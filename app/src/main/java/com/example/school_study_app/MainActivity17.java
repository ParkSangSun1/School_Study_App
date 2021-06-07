package com.example.school_study_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity17 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        findViewById(R.id.btn17_1).setOnClickListener(this);
        findViewById(R.id.btn17_2).setOnClickListener(this);
        findViewById(R.id.btn17_3).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        setFragment(button.getText().toString());

    }
    private void setFragment(String name){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment, NameFragment.newInstance(name));
        ft.commit();
    }
}