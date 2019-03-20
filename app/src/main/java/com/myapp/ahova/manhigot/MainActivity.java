package com.myapp.ahova.manhigot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.myapp.ahova.manhigot.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.teder_yesod);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tederBase = new Intent(MainActivity.this, YsoudLab.class);
                startActivity(tederBase);
            }
        });

        TextView textView = (TextView) findViewById(R.id.feelings_green);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent greenLab = new Intent(MainActivity.this, Mabada_regeshot.class);
                startActivity(greenLab);
            }
        });

    }

}