package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pandaexpresssecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pandaexpresssecond);

        Button pandaExpressWebsite = (Button)findViewById(R.id.pandaSecondWebsite);
        pandaExpressWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pandaExpressWebsite = "https://www.pandaexpress.com/";
                Uri pandaExpressUri = Uri.parse(pandaExpressWebsite);
                Intent goToPandaExpress = new Intent(Intent.ACTION_VIEW,pandaExpressUri);
                startActivity(goToPandaExpress);
            }
        });

        Button pandaExpressMap = (Button)findViewById(R.id.pandaExpressMap);
        pandaExpressMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pandaExpressWebsite = "https://www.google.com/maps/place/Panda+Express/@29.6398327,-82.3522638,15z/data=!4m15!1m9!2m8!1spanda+express!3m6!1spanda+express!2sReitz+Student+Union,+Gainesville,+FL+32603!3s0x88e8a3765526e70d:0xaceb928d71b6e60!4m2!1d-82.3477816!2d29.6463212!3m4!1s0x88e8a3744f2e5301:0xfb8e0f175c6060a6!8m2!3d29.6459924!4d-82.3477005";
                Uri pandaExpressUri = Uri.parse(pandaExpressWebsite);
                Intent goToPandaExpress = new Intent(Intent.ACTION_VIEW,pandaExpressUri);
                startActivity(goToPandaExpress);
            }
        });

        Button pandaExpressDelivery = (Button)findViewById(R.id.pandaExpressDelivery);
        pandaExpressDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pandaExpressWebsite = "https://www.pandaexpress.com/details/freedelivery";
                Uri pandaExpressUri = Uri.parse(pandaExpressWebsite);
                Intent goToPandaExpress = new Intent(Intent.ACTION_VIEW,pandaExpressUri);
                startActivity(goToPandaExpress);
            }
        });
    }
}