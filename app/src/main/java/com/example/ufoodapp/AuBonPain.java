package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AuBonPain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_au_bon_pain);

        //webBtnAuBon
        Button webBtnAuBon = (Button)findViewById(R.id.webBtnAuBon);
        webBtnAuBon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aubon = "https://www.aubonpain.com/stores/university-florida";
                Uri aubonWeb = Uri.parse(aubon);

                Intent gotoAubon = new Intent(Intent.ACTION_VIEW,aubonWeb);

                startActivity(gotoAubon);

            }
        });


        //aubon_take
        Button takeBtnaubon = (Button)findViewById(R.id.aubon_take);
        takeBtnaubon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String takeAubon = "https://www.google.com/maps/place/%E5%A5%BD%E9%9D%A2%E5%8C%85/@29.6491529,-82.3452923,19.56z/data=!4m13!1m7!3m6!1s0x88e8a3778441fb73:0x1100448c3acf556!2z5aW96Z2i5YyF!8m2!3d29.649093!4d-82.3450569!10e1!3m4!1s0x88e8a3778441fb73:0x1100448c3acf556!8m2!3d29.649093!4d-82.3450569";
                Uri aubonTake = Uri.parse(takeAubon);

                Intent gotoAubontake = new Intent(Intent.ACTION_VIEW,aubonTake);

                startActivity(gotoAubontake);

            }
        });

        //aubon_order
        Button orderBtnaubon = (Button)findViewById(R.id.aubon_order);
        orderBtnaubon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aubon = " Online Order not Available. ";
                Uri croutonsOrder = Uri.parse(aubon);
                Intent gotoAubonorder = new Intent(Intent.ACTION_VIEW,croutonsOrder);
                startActivity(gotoAubonorder);

            }
        });



    }
}