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
public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_places,container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.place_sights_ratusz),getString(R.string.address_sights_ratusz),R.drawable.ratusz));
        places.add(new Place(getString(R.string.address_sights_centrum_kultury),getString(R.string.address_sights_centrum_kultury),R.drawable.zamek));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
