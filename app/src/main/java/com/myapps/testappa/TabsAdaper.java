package com.myapps.testappa;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.myapps.testappa.Fragments.HistoryFragment;
import com.myapps.testappa.Fragments.TestFragment;

import java.util.ArrayList;
import java.util.List;

public class TabsAdaper extends FragmentPagerAdapter {
    private List<String> tabs;
    public TabsAdaper(FragmentManager fm) {
        super(fm);
        tabs = new ArrayList();
        tabs.add("Test");
        tabs.add("History");
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TestFragment();
            case 1:
                return new HistoryFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position);
    }
}
