package com.example.ex_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText Std_Name;
    public EditText Std_regNo;
    public Button btsend;
    public String name , regno;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        std_Name=(EditText)findViewById(R.id.edName);
    }
}