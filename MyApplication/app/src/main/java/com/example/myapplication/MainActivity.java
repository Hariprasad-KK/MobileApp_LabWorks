package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {
    EditText inrVal, forVal;
    RadioGroup rg;
    RadioButton rb;
    Button convert;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert=(Button)findViewById(R.id.button);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inrVal = (EditText) findViewById(R.id.INR);
                forVal =(EditText)findViewById(R.id.FOR);



            }
        });

    }
}