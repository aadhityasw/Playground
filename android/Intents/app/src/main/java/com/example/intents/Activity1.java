package com.example.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        tvWelcome = findViewById(R.id.tvWelcome);

        String name = getIntent().getStringExtra("name");
        String msg = name+", Welcome to Activity 1.";
        tvWelcome.setText(msg);

    }


}
