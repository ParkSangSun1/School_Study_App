package com.example.school_study_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.school_study_app.databinding.ActivityMain11Binding;

public class MainActivity11 extends AppCompatActivity {

    ActivityMain11Binding binding;
    int currentIndex = 0;
    int[] imageRes = {R.drawable.friend1,R.drawable.friend2,R.drawable.friend3, R.drawable.friend4, R.drawable.friend5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main11);

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentIndex == 0){
                    return;
                }else currentIndex --;
                setImage();
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentIndex == (imageRes.length -1)){
                    return;
                }else currentIndex ++;
                setImage();
            }
        });

    }

    public void setImage(){
        binding.imageView.setImageResource(imageRes[currentIndex]);
    }
}