package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chompItsecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chomp_itsecond);

        //chompwebBtn
        Button webBtnchomp2 = (Button)findViewById(R.id.chompItwebBtn);
        webBtnchomp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chompIt2 = "https://www.bsd.ufl.edu/dining/m/Hours.aspx?lid=23&dr=0";
                Uri chompItweb2 = Uri.parse(chompIt2);

                Intent gotoChompIt2 = new Intent(Intent.ACTION_VIEW,chompItweb2);

                startActivity(gotoChompIt2);

            }
        });


        //chomp it second
        Button takeBtnchomp2 = (Button)findViewById(R.id.chompIt_take);
        takeBtnchomp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String takeChomp2 = "https://www.google.com/maps/place/%E4%BD%9B%E7%BD%97%E9%87%8C%E8%BE%BE%E5%A4%A7%E5%AD%A6%E8%8E%B1%E6%96%87%E6%B3%95%E5%AD%A6%E9%99%A2/@29.6494627,-82.3612296,17z/data=!3m1!4b1!4m5!3m4!1s0x88e8a36f78c896c9:0xba39147d08a19156!8m2!3d29.6494627!4d-82.3590409";
                Uri chomp2Take = Uri.parse(takeChomp2);

                Intent gotoChomp2take= new Intent(Intent.ACTION_VIEW,chomp2Take);

                startActivity(gotoChomp2take);

            }
        });

        //chompItsecond_order
        Button orderBtnchomp2 = (Button)findViewById(R.id.chompIt_order);
        orderBtnchomp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String orderChomp2= "https://www.tapingo.com/order/restaurant/chomp-it-uf-levin-college-of-law/";
                Uri chomp2Order = Uri.parse(orderChomp2);

                Intent gotoChomp2 = new Intent(Intent.ACTION_VIEW,chomp2Order);
                startActivity(gotoChomp2);

            }
        });


    }
}