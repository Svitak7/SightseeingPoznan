package com.example.android.sightseeingpoznan;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_places,container,false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.place_food_yetztu),getString(R.string.address_food_yetztu),R.drawable.yetztu));
        places.add(new Place(getString(R.string.place_food_made_in_china),getString(R.string.address_food_made_in_china),R.drawable.madeinchina));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootView;
    }

}
