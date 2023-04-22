package com.example.thuchanh2.adpater;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.thuchanh2.fragment.FragmentHome;
import com.example.thuchanh2.fragment.FragmentInfo;
import com.example.thuchanh2.fragment.FragmentSearch;

public class ViewPagerAdpater extends FragmentStatePagerAdapter {
    public ViewPagerAdpater(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                new FragmentHome();
            case 1:
                new FragmentInfo();
            case 2:
                new FragmentSearch();
            default:
                new FragmentHome();
        }
        return null;
    }
    @Override
    public int getCount() {
        return 3;
    }
}
