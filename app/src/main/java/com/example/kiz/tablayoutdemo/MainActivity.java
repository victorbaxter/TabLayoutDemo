package com.example.kiz.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tabLayout.getSelectedTabPosition();
                switch (position){
                    case 0:
                        Log.d("TAG", "Tab 1");
                        break;
                    case 1:
                        Log.d("TAG", "Tab 2");
                        break;
                    case 2:
                        Log.d("TAG", "Tab 3");
                        break;
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        setupTabIcons();
    }

    private void setupViewPager(ViewPager viewPager) {
        DemoCollectionPagerAdapter adapter = new DemoCollectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new DemoObject1Fragment());
        adapter.addFragment(new DemoObject2Fragment());
        adapter.addFragment(new DemoObject3Fragment());
        viewPager.setAdapter(adapter);
    }

    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("ONE");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, android.R.drawable.ic_menu_camera, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("TWO");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, android.R.drawable.ic_lock_idle_lock, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("THREE");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, android.R.drawable.ic_media_play, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);
    }
}
