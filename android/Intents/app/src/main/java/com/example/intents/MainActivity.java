package com.example.intents;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btn1,btn2;
    TextView tvResult;
    final int ACTIVITY2 = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        tvResult = findViewById(R.id.tvResult);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etName.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please Enter all Feilds",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String name = etName.getText().toString().trim();

                    Intent intent = new Intent(MainActivity.this, com.example.intents.Activity1.class);

                    intent.putExtra("Name",name);

                    startActivity(intent);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, com.example.intents.Activity2.class);
                startActivityForResult(intent,ACTIVITY2);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == ACTIVITY2)
        {

            if(resultCode==RESULT_OK)
            {
                tvResult.setText(data.getStringExtra("Surname"));
            }
            if(resultCode==RESULT_CANCELED)
            {
                tvResult.setText(R.string.Errormsg);
            }
        }
    }
}
