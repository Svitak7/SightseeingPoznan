package com.example.android.sightseeingpoznan;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
       if(position==0) {
           return new SightsFragment();
       } else if (position==1) {
           return new MuseumsFragment();
       } else if (position==2) {
           return new FoodFragment();
       } else {
           return new PubsFragment();
       }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Sights";
        }else if (position == 1) {
            return "Museums";
        }else if (position == 2) {
            return "Food";
        }else {
            return "Pubs";
        }
    }
}
