package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Use the activity_main.xml file to display this content
        setContentView(R.layout.activity_main);

        // Set up a viewPager by linking it to the viewpager element in activity_main.xml
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Set up the Categories Adapter so that the app knows when each fragment should be displayed
        viewPager.setAdapter(new CategoriesAdapter(getSupportFragmentManager(),
                MainActivity.this));

        // Set up some great looking tabs for navigation, then connect the viewPager logic to link fragments with tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_menu);
        tabLayout.setupWithViewPager(viewPager);
    }
}
