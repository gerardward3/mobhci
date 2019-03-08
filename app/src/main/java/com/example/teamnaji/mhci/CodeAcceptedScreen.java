package com.example.teamnaji.mhci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CodeAcceptedScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_accepted_screen);

        Bundle extras = getIntent().getExtras();
        String bikeCode = "";
        if (extras != null) {
            bikeCode = extras.getString("bikeCode");
        }
        TextView bikeCodeText = (TextView)findViewById(R.id.bikeCodeText);
        bikeCodeText.setText("Bike " + bikeCode + " unlocked!");
    }

    public void launchCycle(View v){
        startActivity(new Intent(CodeAcceptedScreen.this, CycleProgressScreen.class));
    }
}
