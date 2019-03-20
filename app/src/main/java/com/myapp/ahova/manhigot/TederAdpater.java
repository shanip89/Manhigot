package com.myapp.ahova.manhigot;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myapp.ahova.manhigot.R;

import java.util.ArrayList;

class TederAdpater extends ArrayAdapter<Regesh> {

    public TederAdpater(Context context, ArrayList<Regesh> re, int recourse) {
        super(context, 0, re);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.mabada_regshot_layout, parent, false);
        }

        Regesh current = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.myAnswer_green_1);
        textView.setText(current.getmExpline());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.green_lab_1);
        imageView.setImageResource(current.getmImagelab());

        return listItemView;
    }
}