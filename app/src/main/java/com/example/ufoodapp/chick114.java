package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chick114 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick114);

        //chickwebBtn
        Button webBtnchick2 = (Button)findViewById(R.id.chickwebBtn);
        webBtnchick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chicks2 = "https://www.chick-fil-a.com/florida";
                Uri chickWeb = Uri.parse(chicks2);

                Intent gotoChick = new Intent(Intent.ACTION_VIEW,chickWeb);

                startActivity(gotoChick);

            }
        });


        //chick_take 114th street
        Button takeBtnchick = (Button)findViewById(R.id.chick_take);
        takeBtnchick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String takeChicks = "https://www.google.com/maps/place/%E9%B8%A1%E6%9F%B3/@29.6461654,-82.3503203,17z/data=!4m8!1m2!2m1!1sChick-fil-A+sun+terrace!3m4!1s0x88e8a39ce943a3bf:0x106a0b1fda85ff84!8m2!3d29.6483173!4d-82.3451213";
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