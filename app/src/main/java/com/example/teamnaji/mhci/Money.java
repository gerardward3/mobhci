package com.example.teamnaji.mhci;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Money extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_money);
    }

    public void returnToHome(View v){
        startActivity(new Intent(Money.this, MainActivity.class));
    }

//    public void switchLeft(View v){
//        TextView transport_type = (TextView)findViewById(R.id.transport_type);
//        TextView todays_savings = (TextView)findViewById(R.id.todays_savings);
//        TextView months_savings = (TextView)findViewById(R.id.months_savings);
//        TextView total_savings = (TextView)findViewById(R.id.total_savings);
//
//        String new_transport_type = "";
//        String new_todays_savings = "";
//        String new_months_savings = "";
//        String new_total_savings = "";
//
//        if(transport_type.getText().toString().matches("All Transport")){
//            new_transport_type = getString(R.string.compare_bus);
//            new_todays_savings = getString(R.string.today_savings_bus);
//            new_months_savings = getString(R.string.month_savings_bus);
//            new_total_savings = getString(R.string.total_savings_bus);
//        } else if(transport_type.getText().toString().matches("Compared to Bus")){
//            new_transport_type = getString(R.string.compare_uber);
//            new_todays_savings = getString(R.string.today_savings_uber);
//            new_months_savings = getString(R.string.month_savings_uber);
//            new_total_savings = getString(R.string.total_savings_uber);
//        } else{
//            new_transport_type = getString(R.string.compare_overall);
//            new_todays_savings = getString(R.string.today_savings_value);
//            new_months_savings = getString(R.string.month_savings_value);
//            new_total_savings = getString(R.string.total_savings_value);
//        }
//
//        transport_type.setText(new_transport_type);
//        todays_savings.setText(new_todays_savings);
//        months_savings.setText(new_months_savings);
//        total_savings.setText(new_total_savings);
//    }
//
//    public void switchRight(View v){
//        TextView transport_type = (TextView)findViewById(R.id.transport_type);
//        TextView todays_savings = (TextView)findViewById(R.id.todays_savings);
//        TextView months_savings = (TextView)findViewById(R.id.months_savings);
//        TextView total_savings = (TextView)findViewById(R.id.total_savings);
//
//        String new_transport_type = "";
//        String new_todays_savings = "";
//        String new_months_savings = "";
//        String new_total_savings = "";
//
//        if(transport_type.getText().toString().matches("All Transport")){
//            new_transport_type = getString(R.string.compare_uber);
//            new_todays_savings = getString(R.string.today_savings_uber);
//            new_months_savings = getString(R.string.month_savings_uber);
//            new_total_savings = getString(R.string.total_savings_uber);
//        } else if(transport_type.getText().toString().matches("Compared to Bus")){
//            new_transport_type = getString(R.string.compare_overall);
//            new_todays_savings = getString(R.string.today_savings_value);
//            new_months_savings = getString(R.string.month_savings_value);
//            new_total_savings = getString(R.string.total_savings_value);
//        } else{
//            new_transport_type = getString(R.string.compare_bus);
//            new_todays_savings = getString(R.string.today_savings_bus);
//            new_months_savings = getString(R.string.month_savings_bus);
//            new_total_savings = getString(R.string.total_savings_bus);
//        }
//
//        transport_type.setText(new_transport_type);
//        todays_savings.setText(new_todays_savings);
//        months_savings.setText(new_months_savings);
//        total_savings.setText(new_total_savings);
//    }

}
