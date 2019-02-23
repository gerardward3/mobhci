package com.example.teamnaji.mhci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void launchFitness(View v){
        startActivity(new Intent(HomeActivity.this, Fitness.class));
    }

    public void launchMoney(View v){
        startActivity(new Intent(HomeActivity.this, Money.class));
    }
}
