package com.example.teamnaji.mhci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UnlockBike extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlock_bike);
    }

    public void qrCodeScanner(View v) {
        startActivity(new Intent(UnlockBike.this, QrCodeScanner.class));
    }

    public void ManualCodeEnter(View v) {
        startActivity(new Intent(UnlockBike.this, ManualCodeEnter.class));
    }
}
