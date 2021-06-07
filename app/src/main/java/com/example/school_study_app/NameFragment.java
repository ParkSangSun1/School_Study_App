package com.example.school_study_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Fragment;

public class NameFragment extends Fragment {
    public static android.app.Fragment newInstance(String name){
        NameFragment f = new NameFragment();

        Bundle bundle = new Bundle();
        bundle.putString("name",name);
        f.setArguments(bundle);

        return f;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.activity_name_fragment, container, false);
        return layout;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setView(view);
    }

    private void setView(View view){
        String name = getArguments().getString("name");

        TextView nameText = view.findViewById(R.id.name);
        nameText.setText(name);
    }
}
