package com.example.android.sightseeingpoznan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places)
    {
        super(context,0,places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Place currentPlace = getItem(position);

        TextView placeTextView = (TextView) convertView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentPlace.getName());

        TextView addressTextView = (TextView) convertView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentPlace.getAddress());

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_view);
        imageView.setImageResource(currentPlace.getImageResourceId());

        return convertView;
    }
}
