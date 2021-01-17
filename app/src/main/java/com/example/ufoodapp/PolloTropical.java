package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PolloTropical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollo_tropical);

        Button polloTropicalWebsite = (Button)findViewById(R.id.polloTropicalWebsite);
        polloTropicalWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String polloTropicalWebsite = "https://www.pollotropical.com/";
                Uri pTUri = Uri.parse(polloTropicalWebsite);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,pTUri);
                startActivity(goToWebsite);
            }
        });

        Button polloTropicalMap= (Button)findViewById(R.id.polloTropicalMap);
        polloTropicalMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://www.google.com/maps/place/Pollo+Tropical/@29.6465119,-82.3502057,17z/data=!3m1!4b1!4m5!3m4!1s0x88e8a376ff68d3ef:0x29e5e1ce8f640c5d!8m2!3d29.6465073!4d-82.3480116";
                Uri pTUri = Uri.parse(Website);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,pTUri);
                startActivity(goToWebsite);
            }
        });

        Button polloTropicalDelivery = (Button)findViewById(R.id.polloTropicalDelivery);
        polloTropicalDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Website = "https://www.ubereats.com/brand/pollo-tropical?utm_source=AdWords_NonBrand&utm_campaign=CM2030991-search-google-nonbrand_1_-99_US-National_e_web_acq_cpc_en_9_Restaurant_Exact_pollo%20tropical%20delivery_kwd-63446685116_488410045907_115137410349_e_c&campaign_id=11869174976&adg_id=115137410349&fi_id=&match=e&net=g&dev=c&dev_m=&ad_id=488410045907&cre=488410045907&kwid=kwd-63446685116&kw=pollo%20tropical%20delivery&placement=&tar=&gclid=CjwKCAiAuoqABhAsEiwAdSkVVMj_rtzR22hq1fBE52lLYQQh54TzrnQ0B382oJHcOgdtahFdwUOWGxoCPSsQAvD_BwE&gclsrc=aw.ds";
                Uri pTDelivery = Uri.parse(Website);
                Intent goToWebsite = new Intent(Intent.ACTION_VIEW,pTDelivery);
                startActivity(goToWebsite);
            }
        });
    }
}