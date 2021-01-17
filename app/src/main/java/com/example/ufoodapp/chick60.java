package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chick60 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick60);

        //chickwebBtn
        Button webBtnchick = (Button)findViewById(R.id.chickwebBtn);
        webBtnchick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chicks = "http://www.viewmenu.com/chick-fil-a-226/menu?ref=google";
                Uri chickWeb = Uri.parse(chicks);

                Intent gotoChick = new Intent(Intent.ACTION_VIEW,chickWeb);

                startActivity(gotoChick);

            }
        });


        //chick_take 60th street
        Button takeBtnchick = (Button)findViewById(R.id.chick_take);
        takeBtnchick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String takeChicks = "https://www.google.com/maps/place/Chick-fil-A/@29.6461654,-82.3503203,17z/data=!4m8!1m2!2m1!1sChick-fil-A!3m4!1s0x88e8a37814255555:0x82f53a34d7a060d4!8m2!3d29.647096!4d-82.341402";
                Uri chicksTake = Uri.parse(takeChicks);

                Intent gotoChickstake = new Intent(Intent.ACTION_VIEW,chicksTake);

                startActivity(gotoChickstake);

            }
        });

        //croutons_order chick_order
        Button orderBtnchick = (Button)findViewById(R.id.chick_order);
        orderBtnchick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String orderChicks = "https://www.chick-fil-a.com/order";
                Uri chicksOrder = Uri.parse(orderChicks);

                Intent gotoChick = new Intent(Intent.ACTION_VIEW,chicksOrder);
                startActivity(gotoChick);

            }
        });


    }
}