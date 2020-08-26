package com.zhy.carddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zhy.cardview.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cardView=findViewById(R.id.cardView);
        cardView.setMaxCardElevation(20f);
    }
}