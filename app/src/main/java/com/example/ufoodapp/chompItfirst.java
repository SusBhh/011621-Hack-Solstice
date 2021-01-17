package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chompItfirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chomp_itfirst);

        //chompwebBtn
        Button webBtnchomp1 = (Button)findViewById(R.id.chompItwebBtn);
        webBtnchomp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chompIt1 = "http://www.viewmenu.com/chick-fil-a-226/menu?ref=google";
                Uri chompItweb = Uri.parse(chompIt1);

                Intent gotoChompIt1 = new Intent(Intent.ACTION_VIEW,chompItweb);

                startActivity(gotoChompIt1);

            }
        });


        //chomp it first
        Button takeBtnchomp1 = (Button)findViewById(R.id.chompIt_take);
        takeBtnchomp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String takeChomp1 = "https://gatordining.campusdish.com/en/LocationsAndMenus/Chomp-It";
                Uri chomp1Take = Uri.parse(takeChomp1);

                Intent gotoChomp1take= new Intent(Intent.ACTION_VIEW,chomp1Take);

                startActivity(gotoChomp1take);

            }
        });

        //chompItfirst_order
        Button orderBtnchomp1 = (Button)findViewById(R.id.chompIt_order);
        orderBtnchomp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String orderChomp1= "https://www.tapingo.com/order/restaurant/chomp-it-uf/";
                Uri chomp1Order = Uri.parse(orderChomp1);

                Intent gotoChomp1 = new Intent(Intent.ACTION_VIEW,chomp1Order);
                startActivity(gotoChomp1);

            }
        });


    }
}