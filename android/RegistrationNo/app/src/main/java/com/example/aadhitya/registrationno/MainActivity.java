package com.example.aadhitya.registrationno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ETIN;
    Button BT;
    TextView TVOUT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETIN=findViewById(R.id.ETIN);
        BT = findViewById(R.id.BT);
        TVOUT = findViewById(R.id.TVOUT);

        TVOUT.setVisibility(View.GONE);

        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String regid = ETIN.getText().toString().trim();

                if(regid.length()==9)
                {
                    int year_of_join = Integer.parseInt(regid.substring(0,2));
                    String stream_of_study = regid.substring(2,5);
                    int place_of_study = (int)(regid.charAt(5)) - 48;
                    int roll_no = Integer.parseInt(regid.substring(6));

                    year_of_join = year_of_join + 2000;
                    String stream="";
                    String place="";
                    stream_of_study=stream_of_study.toUpperCase();
                    if(stream_of_study.equals("BCE"))
                    {
                        stream="Computer Science And Engineering";
                    }
                    else if(stream_of_study.equals("BLC"))
                    {
                        stream = "Electronics and Computer Science Engineering";
                    }
                    else if(stream_of_study.equals("ECE"))
                    {
                        stream = "Electronics and Communication Engineering";
                    }
                    else if(stream_of_study.equals("EEE"))
                    {
                        stream = "Electricals and Electronics Engineering";
                    }
                    else if(stream_of_study.equals("BLW"))
                    {
                        stream = "Bachelor of Law";
                    }
                    if((place_of_study==0)||(place_of_study==2))
                    {
                        place="Vellore";
                    }
                    else if(place_of_study==1)
                    {
                        place="Chennai";
                    }

                    String outstring = "Student Details :\n" +
                            "Year of joining :\t" + year_of_join + "\n" +
                            "Stream of Education :\t" + stream + "\n" +
                            "Place of University :\t" + place + "\n" +
                            "Roll Number of student : \t" + roll_no;

                    TVOUT.setText(outstring);
                    TVOUT.setVisibility(View.VISIBLE);
                }
                else
                {
                    TVOUT.setText("The Entered Input is Invalid.\n Please try again.");
                }
            }
        });
    }
}