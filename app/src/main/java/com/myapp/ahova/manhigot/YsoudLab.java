package com.myapp.ahova.manhigot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.myapp.ahova.manhigot.R;

public class YsoudLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yseod_layout);

        ImageView red_lab = (ImageView) findViewById(R.id.red_lab);
        red_lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView myAnswerRed = (TextView) findViewById(R.id.myAnswer);
                myAnswerRed.setText(R.string.desc_heb_present_red);
                switch (v.getId()){
                }
            }
        });

        ImageView blue_lab = (ImageView) findViewById(R.id.blue_lab);
        blue_lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView myAnswerBlue = (TextView) findViewById(R.id.myAnswer1);
                myAnswerBlue.setText(R.string.desc_heb_blue);
            }
        });

        ImageView yellow_lab = (ImageView) findViewById(R.id.yellow_lab);
        yellow_lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView myAnswerYellow = (TextView) findViewById(R.id.myAnswer2);
                myAnswerYellow.setText(R.string.desc_heb_yellow);
            }
        });



    }
}
