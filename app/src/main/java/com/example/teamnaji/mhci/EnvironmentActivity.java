package com.example.teamnaji.mhci;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

public class EnvironmentActivity extends AppCompatActivity {
    private ImageView tree;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environment);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        setupBottomNavigationView();

    }

    private void setupBottomNavigationView() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottombaritem_home:
                        startActivity(new Intent(EnvironmentActivity.this, EnvironmentActivity.class));

                    case R.id.bottombaritem_environment:
                        break;
                    case R.id.bottombaritem_money:
                        startActivity(new Intent(EnvironmentActivity.this, Money.class));
                        break;
                    case R.id.bottombaritem_fitness:
                        startActivity(new Intent(EnvironmentActivity.this, Fitness.class));
                        break;
                }
                return true;
            }
        });
    }




}
