package com.example.floatingactionbutton;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
Animation fab_open, fab_close,fab_clock,fab_anticlock;
FloatingActionButton fab_plus,fab_camera,fab_call,fab_bt;
boolean isOpen,isClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab_plus =(FloatingActionButton) findViewById(R.id.fabplus);
        fab_camera=(FloatingActionButton) findViewById(R.id.fabcamera);
        fab_call =(FloatingActionButton) findViewById(R.id.fabcall);
        fab_bt = (FloatingActionButton)  findViewById(R.id.fabbt);


        fab_open= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        fab_close=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        fab_clock=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_clockwise);
        fab_anticlock=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_anticlockwise);


        fab_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!isOpen) {

                    fab_camera.startAnimation(fab_open);
                    fab_call.startAnimation(fab_close);
                    fab_bt.startAnimation(fab_open);

                    fab_plus.startAnimation(fab_clock);
                    fab_camera.setClickable(true);
                    fab_call.setClickable(true);
                    fab_bt.setClickable(true);
                    isOpen = true;
                } else {
                    fab_camera.startAnimation(fab_open);
                    fab_call.startAnimation(fab_close);
                    fab_bt.startAnimation(fab_open);

                    fab_plus.startAnimation(fab_anticlock);
                    fab_camera.setClickable(false);
                    fab_call.setClickable(false);
                    fab_bt.setClickable(false);
                    isOpen = false;
                }
            }
        });








} }