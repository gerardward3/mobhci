package com.example.teamnaji.mhci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class CycleProgressScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_progress_screen);

        Chronometer timer = (Chronometer) findViewById(R.id.timer);

        timer.start();
    }

    public void endCycle(View v){
        startActivity(new Intent(CycleProgressScreen.this, HomeActivity.class));
    }
}
