package com.example.school_study_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.school_study_app.databinding.ActivityMain8Binding;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ActivityMain8Binding binding = ActivityMain8Binding.inflate(getLayoutInflater());
//        ActivityMain8Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_main8);
        setContentView(R.layout.activity_main8);
    }
}