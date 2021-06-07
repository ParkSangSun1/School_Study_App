package com.example.school_study_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PaintingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SingleTouchView(this,null));
    }
}