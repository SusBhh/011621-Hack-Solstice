package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chompGothird extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chomp_gothird);

        //chomp button
        Button webBtnchomp = (Button)findViewById(R.id.chompwebBtn);
        webBtnchomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chompthird = "https://www.bsd.ufl.edu/dining/m/Hours.aspx?lid=18&dr=0";
                Uri chompthirdWeb = Uri.parse(chompthird);

                Intent gotoChimpthird = new Intent(Intent.ACTION_VIEW,chompthirdWeb);

                startActivity(gotoChimpthird);

            }
        });


        //chomp third
        Button takeBtnchompthird = (Button)findViewById(R.id.chomp_take);
        takeBtnchompthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String takeChompthird = "https://www.google.com/maps/place/UF+Health+Orthopaedics+and+Sports+Medicine+Institute/@29.6383517,-82.3740555,15z/data=!4m5!3m4!1s0x0:0xb63ca489e32652a9!8m2!3d29.6383517!4d-82.3740555";
                Uri chompthirdTake = Uri.parse(takeChompthird);

                Intent gotoChompsthirdtake = new Intent(Intent.ACTION_VIEW,chompthirdTake);

                startActivity(gotoChompsthirdtake);

            }
        });

        //chomp_order
        Button orderBtnchompthird = (Button)findViewById(R.id.chomp_order);
        orderBtnchompthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String orderChompthird = "https://www.tapingo.com/order/restaurant/orthopedic-building-caf-orthopedic-building-ground-floor/";
                Uri chompsThirdOrder = Uri.parse(orderChompthird);

                Intent gotoChompsThird = new Intent(Intent.ACTION_VIEW,chompsThirdOrder);
                startActivity(gotoChompsThird);

            }
        });


    }
}