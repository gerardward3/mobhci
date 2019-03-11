package com.example.teamnaji.mhci;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class HomeFragment extends Fragment implements View.OnClickListener{

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
        mMoneyCard.setOnClickListener(this);
        CardView mFitnessCard = view.findViewById(R.id.fitnessCard);
        mFitnessCard.setOnClickListener(this);
        CardView mEnvironmentCard = view.findViewById(R.id.environmentCard);
        mEnvironmentCard.setOnClickListener(this);
        return view;

    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.flContainer, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.moneyCard: {
                loadFragment(new MoneyFragment());
                break;
            }

            case R.id.fitnessCard: {
                loadFragment(new FitnessFragment());
                break;
            }

            case R.id.environmentCard: {
                loadFragment(new EnvironmentFragment());
                break;
            }
        }
    }

}
