package com.example.ex_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button bAdd, bSub, bMul, bDiv, bEq, bclr, bdot;
    float res1, res2;
    boolean Add, Sub, Mul, Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button)findViewById(R.id.bt0);
        b1 = (Button)findViewById(R.id.bt1);
        b2 = (Button)findViewById(R.id.bt2);
        b3 = (Button)findViewById(R.id.bt3);
        b4 = (Button)findViewById(R.id.bt4);
        b5 = (Button)findViewById(R.id.bt5);
        b6 = (Button)findViewById(R.id.bt6);
        b7 = (Button)findViewById(R.id.bt7);
        b8 = (Button)findViewById(R.id.bt8);
        b9 = (Button)findViewById(R.id.bt9);
        bAdd= (Button)findViewById(R.id.btadd);
        bSub = (Button)findViewById(R.id.btsub);
        bMul = (Button)findViewById(R.id.btmul);
        bDiv = (Button)findViewById(R.id.btdiv);
        bclr = (Button)findViewById(R.id.btclr);
        bdot = (Button)findViewById(R.id.btdot);
        bEq  = (Button)findViewById(R.id.bteq);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"0");

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"9");

            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"0");

            }
        });
    }
}