package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chompGofirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chomp_gofirst);

        //chomp button
        Button webBtnchomp = (Button)findViewById(R.id.chompwebBtn);
        webBtnchomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chompfirst = "https://www.bsd.ufl.edu/dining/m/Hours.aspx?lid=15&dr=0";
                Uri chompfirstWeb = Uri.parse(chompfirst);

                Intent gotoChimpfirst = new Intent(Intent.ACTION_VIEW,chompfirstWeb);

                startActivity(gotoChimpfirst);

            }
        });


        //chomp first
        Button takeBtnchompfirst = (Button)findViewById(R.id.chomp_take);
        takeBtnchompfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String takeChompfist = "https://www.google.com/maps/place/%E4%BD%9B%E5%A4%A7%E7%99%8C%E7%97%87%E4%B8%8E%E9%81%97%E4%BC%A0%E5%AD%A6%E7%A0%94%E7%A9%B6%E6%89%80/@29.6378749,-82.3518584,15z/data=!4m5!3m4!1s0x0:0x992b3bddd149f403!8m2!3d29.6378749!4d-82.3518584";
                Uri chompfirstTake = Uri.parse(takeChompfist);

                Intent gotoChompsfirsttake = new Intent(Intent.ACTION_VIEW,chompfirstTake);

                startActivity(gotoChompsfirsttake);

            }
        });

        //chomp_order
        Button orderBtnchompfirst = (Button)findViewById(R.id.chomp_order);
        orderBtnchompfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String orderChompfirst = "";
                Uri chompsFirstOrder = Uri.parse(orderChompfirst);

                Intent gotoChompsFirst = new Intent(Intent.ACTION_VIEW,chompsFirstOrder);
                startActivity(gotoChompsFirst);

            }
        });


    }
}