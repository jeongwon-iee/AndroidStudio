package com.example.lab7viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_tabs);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_pager);

        Fragment[] arrFragments = new Fragment[3];
        arrFragments[0]=new RedFragment();
        arrFragments[1]=new YellowFragment();
        arrFragments[2]=new GreenFragment();

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), arrFragments);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        private Fragment[] arrFragments;

        public MyPagerAdapter(@NonNull FragmentManager fm, Fragment[] arrFragments) {
            super(fm);
            this.arrFragments = arrFragments;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return arrFragments[position];
        }

        @Override
        public int getCount() {
            return arrFragments.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Red";
                case 1:
                    return "Yellow";
                case 2:
                    return "Green";
                default:
                    return "";
            }
        }
    }
}
