package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shakesmart extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shakesmart);

        Button shakeSmartWebsite = (Button)findViewById(R.id.shakeSmartlWebsite);
        shakeSmartWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String polloTropicalWebsite = "https://shakesmart.com/";
                Uri address = Uri.parse(polloTropicalWebsite);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,address);
                startActivity(goToWebsite);
            }
        });

        Button shakeSmartMap= (Button)findViewById(R.id.shakeSmartlMap);
        shakeSmartMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://www.google.com/maps/place/Shake+Smart/@29.6456254,-82.3505709,17z/data=!3m1!4b1!4m5!3m4!1s0x88e8a345194b81d3:0xc4007f728018f483!8m2!3d29.6456254!4d-82.3483822";
                Uri Map = Uri.parse(Website);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,Map);
                startActivity(goToWebsite);
            }
        });

        Button shakeSmartDelivery = (Button)findViewById(R.id.shakeSmartDelivery);
        shakeSmartDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://postmates.com/merchant/shake-smart-tempe";
                Uri Delivery = Uri.parse(Website);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,Delivery);
                startActivity(goToWebsite);
            }
        });
    }
}