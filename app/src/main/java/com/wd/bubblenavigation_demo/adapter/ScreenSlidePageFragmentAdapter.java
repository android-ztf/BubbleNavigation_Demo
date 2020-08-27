package com.wd.bubblenavigation_demo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * AUTHOR: MR.Zhang
 * DATE:2020-8-26
 * INTRODUCE：$
 */
public class ScreenSlidePageFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mList;

    public ScreenSlidePageFragmentAdapter(@NonNull FragmentManager fm, List<Fragment> list) {
        super(fm);
        mList = list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
