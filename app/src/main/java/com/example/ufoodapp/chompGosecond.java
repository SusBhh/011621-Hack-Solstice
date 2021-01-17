package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chompGosecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chomp_gosecond);

        //
        Button webBtnchomp = (Button)findViewById(R.id.chompwebBtn);
        webBtnchomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chompsecond = "https://www.bsd.ufl.edu/dining/m/Hours.aspx?lid=6&dr=0";
                Uri chompsecondWeb = Uri.parse(chompsecond);

                Intent gotoChimpsecond = new Intent(Intent.ACTION_VIEW,chompsecondWeb);

                startActivity(gotoChimpsecond);

            }
        });


        //chomp second
        Button takeBtnchompsecond = (Button)findViewById(R.id.chomp_take);
        takeBtnchompsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String takeChompsecond = "https://www.google.com/maps/place/Hough+Hall,+Gainesville,+FL+32611/@29.6504095,-82.3428602,17z/data=!3m1!4b1!4m5!3m4!1s0x88e8a3836969c027:0xc5a2e384499484ef!8m2!3d29.6504049!4d-82.3406662";
                Uri chompsecondTake = Uri.parse(takeChompsecond);

                Intent gotoChompssecondtake = new Intent(Intent.ACTION_VIEW,chompsecondTake);

                startActivity(gotoChompssecondtake);

            }
        });

        //chomp_order
        Button orderBtnchompsecond = (Button)findViewById(R.id.chomp_order);
        orderBtnchompsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String orderChompsecond = "";
                Uri chompsSecondOrder = Uri.parse(orderChompsecond);

                Intent gotoChompsSecond = new Intent(Intent.ACTION_VIEW,chompsSecondOrder);
                startActivity(gotoChompsSecond);

            }
        });


    }
}