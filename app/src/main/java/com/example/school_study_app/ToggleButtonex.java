package com.example.school_study_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

import com.airbnb.lottie.LottieDrawable;
import com.example.school_study_app.databinding.ActivityToggleButtonBinding;

public class ToggleButtonex extends AppCompatActivity {

//    com.airbnb.lottie.LottieAnimationView imageView;
//    ToggleButton toggleButton;
    ActivityToggleButtonBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_toggle_button);


//        imageView =  findViewById(R.id.lottieAnimationView);
//        toggleButton =  (ToggleButton) findViewById(R.id.toggle);

        binding.toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    binding.lottieAnimationView.setAnimation(R.raw.on1);
                }else {
                    binding.lottieAnimationView.setAnimation(R.raw.off1);

                }
            }
        });
    }
}