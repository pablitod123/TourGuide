package com.example.android.tourguide;

/**
 * Created by paulstyslinger on 3/2/17.
 */

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class CategoriesAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;
    private String tabMenuTitles[] = new String[] { "Food", "Bars", "Museums", "Events" };

    /**
     * the following comment text copied from the Udacity Miwok app:
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoriesAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new BarsFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else {
            return new EventsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabMenuTitles[position];
    }

    @Override
    public int getCount() {
        return 4;
    }


}
