package com.example.darpan.toursimproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Sukhna extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_sukhna, container, false);
        ArrayList<Information> info=new ArrayList<Information>();
        info.add(new Information(R.string.sukhna_fragment_name,R.string.sukhna_fragment_timings,R.string.sukhna_fragment_address,R.string.sukhna_fragment_ratings,R.string.sukhna_fragment_unique,R.drawable.sukhna));
        InformationAdapter viewInfo= new InformationAdapter(getActivity(),info);
        ListView listView=(ListView)rootView.findViewById(R.id.sukhnaFragment);
        listView.setAdapter(viewInfo);
        return rootView;
    }
}
