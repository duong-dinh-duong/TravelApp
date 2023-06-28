package com.example.travelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.travelapp.Domains.PopularDomain;
import com.example.travelapp.R;

public class DetailActivity extends AppCompatActivity {
    private TextView titleTxt, locationTxt, bedTxt,guideTxt,wifiTxt,descriptionTxt,scoreTxt;
    private PopularDomain items;
    private ImageView picImg,backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();
        setVariable();

    }

    private void setVariable() {
        items = (PopularDomain) getIntent().getSerializableExtra("object");

        titleTxt.setText(items.getTitle());
        scoreTxt.setText(""+(int) items.getScore());
        locationTxt.setText(items.getLocation());
        bedTxt.setText(items.getBed()+ "Bed");
        descriptionTxt.setText(items.getDescription());

        if(items.isGuide()){
            guideTxt.setText("Guide");
        }else {
            guideTxt.setText("No-Guide");
        }
        if(items.isWifi()){
            guideTxt.setText("Wifi");
        }else {
            guideTxt.setText("No-Wifi");
        }

        int drawableResId =getResources().getIdentifier(items.getPic(),"drawable",getPackageName());

        Glide.with(this).load(drawableResId).into(picImg);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    private void initView() {
        titleTxt =findViewById(R.id.titleTxt);
        locationTxt =findViewById(R.id.locationTxt);
        bedTxt =findViewById(R.id.bedTxt);
        guideTxt =findViewById(R.id.guideTxt);
        wifiTxt =findViewById(R.id.wifiTxt);
        descriptionTxt =findViewById(R.id.descriptionTxt);
        scoreTxt =findViewById(R.id.scoreTxt);
        picImg =findViewById(R.id.picImg);
        backBtn =findViewById(R.id.backBtn);


    }
}