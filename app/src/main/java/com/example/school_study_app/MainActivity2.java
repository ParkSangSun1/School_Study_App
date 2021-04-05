package com.example.school_study_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.example.school_study_app.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding.textView.setText(binding.textView.getText() + "문자 추가");
        binding.textView.setTextColor(Color.RED);
        binding.textView.setTextSize(40);

    }
}