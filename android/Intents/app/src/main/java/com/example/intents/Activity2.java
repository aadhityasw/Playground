package com.example.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView etSurname;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        etSurname = findViewById(R.id.etSurname);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etSurname.getText().toString().isEmpty())
                {
                    Toast.makeText(Activity2.this, "Please enter valid details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String surname = etSurname.getText().toString().trim();
                    Intent intent = new Intent();
                    intent.putExtra("Surname",surname);
                    setResult(RESULT_OK,intent);

                }
            }
        });
    }
}
