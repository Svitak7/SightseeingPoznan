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
public class PubsFragment extends Fragment {

    public PubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_places,container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.place_pubs_twoja_stara),getString(R.string.address_pubs_twoja_stara),R.drawable.twojastara));
        places.add(new Place(getString(R.string.place_pubs_dragon),getString(R.string.address_pubs_dragon),R.drawable.dragon));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
