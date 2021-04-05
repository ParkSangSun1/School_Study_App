package com.example.school_study_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity implements View.OnClickListener{

    TextView textBox;
    CheckBox check1;
    CheckBox check2;
    CheckBox check3;
    CheckBox check4;

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        textBox = findViewById(R.id.txt1);

        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        check4 = findViewById(R.id.check4);
        text1 = findViewById(R.id.text11);
        text2 = findViewById(R.id.text22);
        text3 = findViewById(R.id.text33);
        text4 = findViewById(R.id.text44);


        check1.setOnClickListener(this);
        check2.setOnClickListener(this);
        check3.setOnClickListener(this);
        check4.setOnClickListener(this);

    }


    public void onClick(View v){
        int id = v.getId();
        if(id == R.id.check1 || id==R.id.check2 || id==R.id.check3 || id==R.id.check4){
            checkText();
        }
    }

    private void checkText(){
        String checkStr = "";
        if(check1.isChecked()){
            checkStr = text1.getText().toString();
        }
        if(check2.isChecked()){
            checkStr += "\n"+text2.getText().toString();
        }
        if (check3.isChecked()){
            checkStr += "\n"+text3.getText().toString();
        }
        if (check4.isChecked()){
            checkStr += "\n"+text4.getText().toString();
        }

        textBox.setText(checkStr);
    }

}