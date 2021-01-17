package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class saladcreation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saladcreation);

        Button saladCreationWebsite = (Button)findViewById(R.id.saladCreationlWebsite);
        saladCreationWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String polloTropicalWebsite = "https://menupages.com/salad-creations/4437-lyons-rd-suite-e-coconut-creek/";
                Uri address = Uri.parse(polloTropicalWebsite);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,address);
                startActivity(goToWebsite);
            }
        });

        Button saladCreationMap= (Button)findViewById(R.id.saladCreationlMap);
        saladCreationMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://www.google.com/maps/place/Salad+Creations/@29.6401686,-82.3460996,17z/data=!4m5!3m4!1s0x88e8a39fb16222bf:0x79201aff3fd7ddd!8m2!3d29.640164!4d-82.3439055";
                Uri Map = Uri.parse(Website);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,Map);
                startActivity(goToWebsite);
            }
        });

        Button saladCreationDelivery = (Button)findViewById(R.id.saladCreationDelivery);
       saladCreationDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://www.grubhub.com/restaurant/salad-creations-4437-lyons-rd-suite-e-coconut-creek/556429";
                Uri Delivery = Uri.parse(Website);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,Delivery);
                startActivity(goToWebsite);
            }
        });
    }
}