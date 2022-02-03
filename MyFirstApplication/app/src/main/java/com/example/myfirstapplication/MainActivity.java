package com.example.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText inrVal, forVal;
     RadioGroup rg;
     RadioButton rb;
     Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert =(Btton)findViewById(R.id.buttton);
        convert.setonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inrVal =(EditText)findViewById(R.Id.INR);
            }
        })
    }
}
