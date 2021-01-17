package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pandaexpressfirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pandaexpressfirst);

        Button pandaExpressWebsite = (Button)findViewById(R.id.pandaFirstWebsite);
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
                String pandaExpressWebsite = "https://www.google.com/maps/place/Panda+Express/@29.6398379,-82.3456603,17z/data=!3m1!4b1!4m5!3m4!1s0x88e8a3744f2e5301:0x51e418128f2e430a!8m2!3d29.6398333!4d-82.3434662";
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

