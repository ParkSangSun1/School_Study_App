package com.example.school_study_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.school_study_app.databinding.ActivityMain6Binding;

public class MainActivity6 extends AppCompatActivity {

    ActivityMain6Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main6);


        binding.add.setOnClickListener(v -> {
            int score1 = Integer.parseInt(binding.firstNumber.getText().toString());
            int score2 = Integer.parseInt(binding.secendNumber.getText().toString());
            binding.score.setText("결과 " +Integer.toString(score1+score2));
        });

        binding.Qorl.setOnClickListener(v -> {
            int score1 = Integer.parseInt(binding.firstNumber.getText().toString());
            int score2 = Integer.parseInt(binding.secendNumber.getText().toString());
            binding.score.setText("결과 " +Integer.toString(score1-score2));
        });



        binding.rhqgkrl.setOnClickListener(v -> {
            int score1 = Integer.parseInt(binding.firstNumber.getText().toString());
            int score2 = Integer.parseInt(binding.secendNumber.getText().toString());
            binding.score.setText("결과 " +Integer.toString(score1*score2));
        });

        binding.sksnrl.setOnClickListener(v -> {
            int score1 = Integer.parseInt(binding.firstNumber.getText().toString());
            int score2 = Integer.parseInt(binding.secendNumber.getText().toString());
            binding.score.setText("결과 " +Integer.toString(score1/score2));
        });
    }
}