package com.example.tabexperiment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private int NUMBER_ITEM;

    public PageAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.NUMBER_ITEM = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: return new Tab0();
            case 1: return new Tab1();
            case 2: return new Tab2();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return NUMBER_ITEM;
    }
}
