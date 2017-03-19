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

public class EventsFragment extends Fragment {
    public EventsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //information copied from http://birminghamal.org/events/2017-birmingham-festivals/
        final ArrayList<Attraction> events = new ArrayList<Attraction>();
        events.add(new Attraction(getString(R.string.events_title_bbq), getString(R.string.events_desc_bbq)));
        events.add(new Attraction(getString(R.string.events_title_do_da_day), getString(R.string.events_desc_do_da_day)));
        events.add(new Attraction(getString(R.string.events_title_film), getString(R.string.events_desc_film)));
        events.add(new Attraction(getString(R.string.events_title_grand_prix), getString(R.string.events_desc_grand_prix)));
        events.add(new Attraction(getString(R.string.events_title_gumbo), getString(R.string.events_desc_gumbo)));
        events.add(new Attraction(getString(R.string.events_title_restaurant), getString(R.string.events_desc_restaurant)));
        events.add(new Attraction(getString(R.string.events_title_sloss), getString(R.string.events_desc_sloss)));
        events.add(new Attraction(getString(R.string.events_title_symphony), getString(R.string.events_desc_symphony)));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), events, R.color.events_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
