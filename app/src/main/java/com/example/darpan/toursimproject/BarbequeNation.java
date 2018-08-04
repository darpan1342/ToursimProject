package com.example.darpan.toursimproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BarbequeNation extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_barbeque_nation, container, false);
        ArrayList<Information> info=new ArrayList<Information>();
        info.add(new Information(R.string.barbeque_nation_fragment_name,R.string.barbeque_nation_fragment_timings,R.string.barbeque_nation_fragment_address,R.string.barbeque_nation_fragment_ratings,R.string.barbeque_nation_fragment_special,R.drawable.barbequenation));
        InformationAdapter viewInfo= new InformationAdapter(getActivity(),info);
        ListView listView=(ListView)rootView.findViewById(R.id.barbequeNationFragment);
        listView.setAdapter(viewInfo);
        return rootView;
    }
}
