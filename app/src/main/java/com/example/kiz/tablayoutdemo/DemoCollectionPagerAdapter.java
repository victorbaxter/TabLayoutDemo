package com.example.kiz.tablayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionPagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();
    public DemoCollectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Object" + (position+1);
    }

    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }
}
