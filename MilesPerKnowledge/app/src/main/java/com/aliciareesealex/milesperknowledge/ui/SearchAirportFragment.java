package com.aliciareesealex.milesperknowledge.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliciareesealex.milesperknowledge.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchAirportFragment extends Fragment {
    static String TAG = SearchAirportFragment.class.getCanonicalName();

    public SearchAirportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_airport, container, false);
    }

}