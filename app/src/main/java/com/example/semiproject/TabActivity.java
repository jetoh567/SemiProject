package com.example.semiproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class TabActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setText("메모") );
        tabLayout.addTab(tabLayout.newTab().setText("회원가입"));

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

    }

    class MyPagerAdapter extends FragmentPagerAdapter {
        int tabSize; // TAB 수

        public MyPagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
            super(supportFragmentManager);
            this.tabSize = tabCount;
        }

        @Override
        public Fragment getItem(int position) {
            switch(position) {
                case 0:
                    return new fragment_1();
                case 1:
                    return new fragment_2();

            }

            return null;
        }

        @Override
        public int getCount() {
            return this.tabSize;
        }
    }

}
