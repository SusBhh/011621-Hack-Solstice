package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PapaJohns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papa_johns);

        Button papaJohnsWebsite = (Button)findViewById(R.id.papaJohnsWebsite);
        papaJohnsWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pJWebsite = "https://www.papajohns.com/";
                Uri pJUri = Uri.parse(pJWebsite);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,pJUri);
                startActivity(goToWebsite);
            }
        });

        Button pJMap = (Button)findViewById(R.id.papaJohnsMap);
        pJMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://www.google.com/maps/place/Papa+John's+Pizza/@29.6392009,-82.3544618,15z/data=!4m8!1m2!2m1!1spapa+johns+uf!3m4!1s0x88e8a487454823ff:0xe5a07ede0c448f76!8m2!3d29.6750173!4d-82.3883646";
                Uri pJUri = Uri.parse(Website);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,pJUri);
                startActivity(goToWebsite);
            }
        });

        Button pJDelivery = (Button)findViewById(R.id.papaJohnsDelivery);
        pJDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://www.grubhub.com/food/papa_johns_pizza";
                Uri pJDelivery = Uri.parse(Website);
                Intent goToPandaExpress = new Intent(Intent.ACTION_VIEW,pJDelivery);
                startActivity(goToPandaExpress);
            }
        });
    }
}