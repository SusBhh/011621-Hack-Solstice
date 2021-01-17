package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sub_croutons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_croutons);

        //webBtn
        Button webBtncroutons = (Button)findViewById(R.id.webBtn);
        webBtncroutons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String croutons = "https://gatordining.campusdish.com/en/LocationsAndMenus/CroutonsReitzUnion";
                Uri croutonsWeb = Uri.parse(croutons);

                Intent gotoCrouton = new Intent(Intent.ACTION_VIEW,croutonsWeb);

                    startActivity(gotoCrouton);

            }
        });


        //croutons_take
        Button takeBtncroutons = (Button)findViewById(R.id.croutons_take);
        takeBtncroutons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String takeCroutons = "https://www.google.com/maps/place/Reitz+Union+Food+Court/@29.6459972,-82.3499631,17z/data=!3m1!4b1!4m5!3m4!1s0x88e8a376550e35d5:0xaace737d81829d30!8m2!3d29.6459972!4d-82.3477744";
                Uri croutonsTake = Uri.parse(takeCroutons);

                Intent gotoCroutontake = new Intent(Intent.ACTION_VIEW,croutonsTake);

                    startActivity(gotoCroutontake);

            }
        });

        //croutons_order
        Button orderBtncroutons = (Button)findViewById(R.id.croutons_order);
        orderBtncroutons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String orderCroutons = "https://www.tapingo.com/order/restaurant/croutons-uf/";
                Uri croutonsOrder = Uri.parse(orderCroutons);

                Intent gotoCroutonorder = new Intent(Intent.ACTION_VIEW,croutonsOrder);
                    startActivity(gotoCroutonorder);

            }
        });


    }
}