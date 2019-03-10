package com.example.teamnaji.mhci;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Bundle;

public class FitnessFragment extends Fragment {


    public static FitnessFragment newInstance(String param1, String param2) {
        FitnessFragment fragment = new FitnessFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_fitness, container, false);
        return view;
    }



}
