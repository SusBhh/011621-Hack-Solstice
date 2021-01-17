package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subwaysecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subwaysecond);

        Button subwaySecondWebsite = (Button)findViewById(R.id.subwaySecondWebsite);
        subwaySecondWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://www.subway.com/en-us?utm_source=google&utm_medium=cpc&utm_term=subway_e&utm_content=national&utm_campaign=sd-bgeneral&cid=0:0:0:0:0:0&segment_code=0&gclid=Cj0KCQiA3Y-ABhCnARIsAKYDH7tw_ct4_OVsLt5VAboB-NpciDSmkrnbxRlUdygT6iMehZaHNl-BPiQaAlWIEALw_wcB&gclsrc=aw.ds/";
                Uri address = Uri.parse(Website);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,address);
                startActivity(goToWebsite);
            }
        });

        Button subwaySecondMap= (Button)findViewById(R.id.subwaySecondMap);
        subwaySecondMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://www.google.com/maps/place/Subway/@29.6465988,-82.3504811,17z/data=!3m1!4b1!4m5!3m4!1s0x88e8a384848aaef1:0xf5116fb065d324ea!8m2!3d29.6465988!4d-82.348287";
                Uri Map = Uri.parse(Website);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,Map);
                startActivity(goToWebsite);
            }
        });

        Button subwaySecondDelivery = (Button)findViewById(R.id.subwaySecondDelivery);
        subwaySecondDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://www.subway.com/en-US/FindAStore?utm_source=google&utm_medium=cpc&utm_term=subway%20delivery_e&utm_content=national&utm_campaign=sd-bdelivery&cid=0:0:0:0:0:0&segment_code=0&gclid=Cj0KCQiA3Y-ABhCnARIsAKYDH7vMVrTfKNbNvVGXGrNOvof2TbCR2j0kfQ3vgASaklZ_Xf8VXg4N8Y4aAm2BEALw_wcB&gclsrc=aw.ds";
                Uri Delivery = Uri.parse(Website);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,Delivery);
                startActivity(goToWebsite);
            }
        });
    }
}