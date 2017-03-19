package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by paulstyslinger on 3/2/17.
 */

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //information copied from https://www.zagat.com/b/8-must-try-restaurants-in-birmingham-alabama
        final ArrayList<Attraction> restaurants = new ArrayList<Attraction>();
        restaurants.add(new Attraction(R.drawable.babalu, getString(R.string.restaurants_title_babalu), getString(R.string.restaurants_desc_babalu)));
        restaurants.add(new Attraction(R.drawable.barrio, getString(R.string.restaurants_title_barrio), getString(R.string.restaurants_desc_barrio)));
        restaurants.add(new Attraction(R.drawable.habitat, getString(R.string.restaurants_title_habitat), getString(R.string.restaurants_desc_habitat)));
        restaurants.add(new Attraction(R.drawable.highlands, getString(R.string.restaurants_title_highlands), getString(R.string.restaurants_desc_highlands)));
        restaurants.add(new Attraction(R.drawable.ollie_irene, getString(R.string.restaurants_title_ollie_irene), getString(R.string.restaurants_desc_ollie_irene)));
        restaurants.add(new Attraction(R.drawable.ovenbird, getString(R.string.restaurants_title_ovenbird), getString(R.string.restaurants_desc_ovenbird)));
        restaurants.add(new Attraction(R.drawable.revelator, getString(R.string.restaurants_title_revelator), getString(R.string.restaurants_desc_revelator)));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), restaurants, R.color.restaurants_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
