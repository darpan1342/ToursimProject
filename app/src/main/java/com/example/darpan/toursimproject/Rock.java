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



public class Rock extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_rock, container, false);
        ArrayList<Information> info=new ArrayList<Information>();
        info.add(new Information(R.string.rock_fragment_name,R.string.rock_fragment_timings,R.string.rock_fragment_address,R.string.rock_fragment_ratings,R.string.rock_fragment_unique,R.drawable.rock));
        InformationAdapter viewInfo= new InformationAdapter(getActivity(),info);
        ListView listView=(ListView)rootView.findViewById(R.id.rockFragment);
        listView.setAdapter(viewInfo);
        return rootView;
    }

}
