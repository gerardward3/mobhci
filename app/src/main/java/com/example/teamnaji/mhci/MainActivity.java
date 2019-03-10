package com.example.teamnaji.mhci;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//    private BottomNavigationView bottomNavigationView;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_home);
//        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
//
//        setupBottomNavigationView();
//
//    }
//
//    public void launchFitness(View v){
//        startActivity(new Intent(MainActivity.this, Fitness.class));
//    }
//
//    public void launchMoney(View v){
//        startActivity(new Intent(MainActivity.this, Money.class));
//    }
//
//    public void unlockBike(View v) {
//        startActivity(new Intent(MainActivity.this, QrCodeScanner.class));
//    }
//
//
//
//    private void setupBottomNavigationView() {
//        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.bottombaritem_home:
//                        break;
//                    case R.id.bottombaritem_environment:
//                        startActivity(new Intent(MainActivity.this, EnvironmentActivity.class));
//                        break;
//                    case R.id.bottombaritem_money:
//                        startActivity(new Intent(MainActivity.this, Money.class));
//                        break;
//                    case R.id.bottombaritem_fitness:
//                        startActivity(new Intent(MainActivity.this, Fitness.class));
//                        break;
//                }
//                return true;
//            }
//        });
//    }
//}

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        loadFragment(new HomeFragment());
        setupBottomNavigationView();
    }

    public void launchFitness(View v){
        startActivity(new Intent(MainActivity.this, Fitness.class));
    }

    public void launchMoney(View v){
        startActivity(new Intent(MainActivity.this, Money.class));
    }

    public void unlockBike(View v) {
        startActivity(new Intent(MainActivity.this, QrCodeScanner.class));
    }


    private void setupBottomNavigationView() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottombaritem_home:
                        loadFragment(new HomeFragment());
                        break;
                    case R.id.bottombaritem_environment:
                        loadFragment(new EnvironmentFragment());
                        break;
                    case R.id.bottombaritem_money:
                        loadFragment(new MoneyFragment());
                        break;
                    case R.id.bottombaritem_fitness:
                        loadFragment(new FitnessFragment());
                        break;
                }
                return true;
            }
        });
    }



    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.flContainer, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


    public void switchLeft(View v){
        TextView transport_type = (TextView)findViewById(R.id.transport_type);
        TextView todays_savings = (TextView)findViewById(R.id.todays_savings);
        TextView months_savings = (TextView)findViewById(R.id.months_savings);
        TextView total_savings = (TextView)findViewById(R.id.total_savings);

        String new_transport_type = "";
        String new_todays_savings = "";
        String new_months_savings = "";
        String new_total_savings = "";

        if(transport_type.getText().toString().matches("All Transport")){
            new_transport_type = getString(R.string.compare_bus);
            new_todays_savings = getString(R.string.today_savings_bus);
            new_months_savings = getString(R.string.month_savings_bus);
            new_total_savings = getString(R.string.total_savings_bus);
        } else if(transport_type.getText().toString().matches("Compared to Bus")){
            new_transport_type = getString(R.string.compare_uber);
            new_todays_savings = getString(R.string.today_savings_uber);
            new_months_savings = getString(R.string.month_savings_uber);
            new_total_savings = getString(R.string.total_savings_uber);
        } else{
            new_transport_type = getString(R.string.compare_overall);
            new_todays_savings = getString(R.string.today_savings_value);
            new_months_savings = getString(R.string.month_savings_value);
            new_total_savings = getString(R.string.total_savings_value);
        }

        transport_type.setText(new_transport_type);
        todays_savings.setText(new_todays_savings);
        months_savings.setText(new_months_savings);
        total_savings.setText(new_total_savings);
    }

    public void switchRight(View v){
        TextView transport_type = (TextView)findViewById(R.id.transport_type);
        TextView todays_savings = (TextView)findViewById(R.id.todays_savings);
        TextView months_savings = (TextView)findViewById(R.id.months_savings);
        TextView total_savings = (TextView)findViewById(R.id.total_savings);

        String new_transport_type = "";
        String new_todays_savings = "";
        String new_months_savings = "";
        String new_total_savings = "";

        if(transport_type.getText().toString().matches("All Transport")){
            new_transport_type = getString(R.string.compare_uber);
            new_todays_savings = getString(R.string.today_savings_uber);
            new_months_savings = getString(R.string.month_savings_uber);
            new_total_savings = getString(R.string.total_savings_uber);
        } else if(transport_type.getText().toString().matches("Compared to Bus")){
            new_transport_type = getString(R.string.compare_overall);
            new_todays_savings = getString(R.string.today_savings_value);
            new_months_savings = getString(R.string.month_savings_value);
            new_total_savings = getString(R.string.total_savings_value);
        } else{
            new_transport_type = getString(R.string.compare_bus);
            new_todays_savings = getString(R.string.today_savings_bus);
            new_months_savings = getString(R.string.month_savings_bus);
            new_total_savings = getString(R.string.total_savings_bus);
        }

        transport_type.setText(new_transport_type);
        todays_savings.setText(new_todays_savings);
        months_savings.setText(new_months_savings);
        total_savings.setText(new_total_savings);
    }
}


