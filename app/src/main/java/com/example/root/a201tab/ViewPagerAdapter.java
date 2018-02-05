package com.example.root.a201tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 1/31/18.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> listFragment = new ArrayList<>();
    private List<String> listTitles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //return listTitles.get(position);
        return null;
    }

    public void addFragment(Fragment fragment, String titles){
        listFragment.add(fragment);
        listTitles.add(titles);
    }
}
