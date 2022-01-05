package com.example.dummydialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtmsg = findViewById(R.id.txtmsg);

        if(getIntent().getData() != null)
        {
            txtmsg.setText(getIntent().getData().toString());
        }
        else
        {
            txtmsg.setText("No Data Found");
        }
    }
}
