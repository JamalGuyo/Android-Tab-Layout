package com.example.root.a201tab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    TabLayout tabLayout;
    int[] tabicons = {R.drawable.ic_call, R.drawable.ic_group, R.drawable.ic_favorite};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        //ADD FRAGMENTS HERE
        viewPagerAdapter.addFragment(new FragmentCall(),"");
        viewPagerAdapter.addFragment(new FragmentContact(),"");
        viewPagerAdapter.addFragment(new FragmentFav(),"");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        //ADD ICONS TO THE TABS
        tabLayout.getTabAt(0).setIcon(tabicons[0]);

        tabLayout.getTabAt(1).setIcon(tabicons[1]);
        tabLayout.getTabAt(2).setIcon(tabicons[2]);
    }
}
