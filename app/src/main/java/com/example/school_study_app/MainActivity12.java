package com.example.school_study_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.school_study_app.databinding.ActivityMain12Binding;

public class MainActivity12 extends AppCompatActivity {

    ActivityMain12Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main12);
        String checkStr = "";

        binding.check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = binding.txt.toString();
                binding.txt.setText(txt1.concat(txt1));

            }
        });
        binding.check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txt.setText(binding.txt.toString() + "\n" + binding.text2.getText().toString());

            }
        });
        binding.check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        binding.check4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


//    public void onClick(View v){
//        int id=v.getId();
//        Log.d("로그", String.valueOf(id));
//        if(id == R.id.check1 || id == R.id.check2 || id == R.id.check3 || id == R.id.check4){
//            checkText();
//            Log.d("로그","호");
//
//        }
//    }
//    private void checkText(){
//        if(binding.check1.isChecked()){
//            Log.d("로그","호1");
//
//        }else if(binding.check2.isChecked()){
//            checkStr +="\n" + binding.text2.getText().toString();
//
//            Log.d("로그","호2"+checkStr);
//
//        }else if(binding.check3.isChecked()){
//            checkStr +="\n" + binding.text3.getText().toString();
//            Log.d("로그","호3");
//
//        }else if(binding.check4.isChecked()){
//            checkStr +="\n" + binding.text4.getText().toString();
//            Log.d("로그","호4");
//
//        }
//
//        binding.txt.setText(checkStr);
//    }


}