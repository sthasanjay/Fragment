package com.example.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.fragment.fragment.FirstFragment;
import com.example.fragment.fragment.SecondFragment;

import Adapter.ViewPageAdapter;

public class ViewPageActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        tabLayout = findViewById(R.id.tabid);
        viewPager = findViewById(R.id.viewPager);

        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());

        adapter.addFragment(new FirstFragment(),"Sum");
        adapter.addFragment(new SecondFragment(),"Area of circle");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
