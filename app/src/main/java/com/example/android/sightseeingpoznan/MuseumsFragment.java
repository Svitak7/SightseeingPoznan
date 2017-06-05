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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.place_museums_brama_poznania),getString(R.string.address_museums_brama_poznania), R.drawable.bramapoznania));
        places.add(new Place(getString(R.string.place_museums_muzeum_powstania),getString(R.string.address_museums_muzeum_powstania),R.drawable.muzeumpowstaniawielkopolskiego));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
