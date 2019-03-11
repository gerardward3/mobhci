package com.example.teamnaji.mhci;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class HomeFragment extends Fragment {

        public HomeFragment(){}

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        CardView mMoneyCard = view.findViewById(R.id.moneyCard);
        CardView mFitnessCard = view.findViewById(R.id.fitnessCard);
        CardView mEnvironmentCard = view.findViewById(R.id.environmentCard);
        return view;

    }

}

