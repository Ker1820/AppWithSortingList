package com.myapps.testappa;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


import com.myapps.testappa.Fragments.HistoryFragment;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.tool_bar);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        TabsAdaper adaper = new TabsAdaper(getSupportFragmentManager());
        viewPager.setAdapter(adaper);
        tabLayout.setupWithViewPager(viewPager);
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.sort_button_AZ:
                        if (viewPager.getCurrentItem() == 0) {
                        viewPager.setCurrentItem(1);
                        }
                        MyListViewAdapter.sortListAZ();
                        HistoryFragment.getMyAdapter().notifyDataSetChanged();
                    return true;
                    case R.id.sort_button_ZA:
                        if (viewPager.getCurrentItem() == 0) {
                            viewPager.setCurrentItem(1);
                        }
                        MyListViewAdapter.sortListZA();
                        HistoryFragment.getMyAdapter().notifyDataSetChanged();
                        return true;
                }
                return true;
            }
        });
    }


}
