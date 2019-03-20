package com.myapp.ahova.manhigot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import com.myapp.ahova.manhigot.R;

import java.util.ArrayList;

public class Mabada_regeshot extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<Regesh> re = new ArrayList<Regesh>();
        re.add(new Regesh(R.drawable.green_lab_1, R.string.des_green_firest_judement));
        re.add(new Regesh(R.drawable.green_lab_2, R.string.des_green_second_anger));
        re.add(new Regesh(R.drawable.green_lab_3, R.string.des_green_third_jealous));
        re.add(new Regesh(R.drawable.green_lab_4, R.string.des_green_forth_dare));
        re.add(new Regesh(R.drawable.green_lab_5, R.string.des_green_fifth_auto));
        re.add(new Regesh(R.drawable.green_lab_6, R.string.des_green_six_bounderies));
        re.add(new Regesh(R.drawable.green_lab_7, R.string.des_green_seven_giving));
        re.add(new Regesh(R.drawable.green_lab_8, R.string.des_green_eight_ego));
        re.add(new Regesh(R.drawable.green_lab_9, R.string.des_green_nine_patinece));
        re.add(new Regesh(R.drawable.green_lab_10, R.string.des_green_ten_responabilty));
        re.add(new Regesh(R.drawable.green_lab_11, R.string.des_gren_elevn_belong));
        re.add(new Regesh(R.drawable.green_lab_12, R.string.des_green_twlevth_singer));
        re.add(new Regesh(R.drawable.green_lab_13, R.string.des_thirdteen_delivery));
        re.add(new Regesh(R.drawable.green_lab_14, R.string.des_fortheen_leadership));
        re.add(new Regesh(R.drawable.green_lab_15, R.string.des_green_fifthteen_true_love));

        TederAdpater adpater = new TederAdpater(this, re, 0);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adpater);
    }

}


