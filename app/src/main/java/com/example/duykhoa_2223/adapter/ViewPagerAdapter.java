package com.example.duykhoa_2223.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.duykhoa_2223.fragment.AccountFragment;
import com.example.duykhoa_2223.fragment.CartFragment;
import com.example.duykhoa_2223.fragment.CategoryFragment;
import com.example.duykhoa_2223.fragment.FavouriteFragment;
import com.example.duykhoa_2223.fragment.HomeFragment;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new CategoryFragment();
            case 2:
                return new CartFragment();
            case 3:
                return new FavouriteFragment();
            case 4:
                return new AccountFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
