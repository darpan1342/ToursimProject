package com.example.darpan.toursimproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Pirates();
        } else if (position == 1){
            return new BarbequeNation();
        } else if (position==2){
            return new Sukhna();
        }
        else
        {
            return new Rock();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
