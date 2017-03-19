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

public class MuseumsFragment  extends Fragment {
    public MuseumsFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //information copied from http://www.10best.com/destinations/alabama/birmingham/attractions/museums/
        final ArrayList<Attraction> museums = new ArrayList<Attraction>();
        museums.add(new Attraction(R.drawable.ic_flight_takeoff_white_24dp, getString(R.string.museums_title_Flight), getString(R.string.museums_desc_Flight)));
        museums.add(new Attraction(R.drawable.ic_lightbulb_outline_white_24dp, getString(R.string.museums_title_McWane), getString(R.string.museums_desc_McWane)));
        museums.add(new Attraction(R.drawable.ic_album_white_24dp, getString(R.string.museums_title_Jazz), getString(R.string.museums_desc_Jazz)));
        museums.add(new Attraction(R.drawable.ic_brush_white_24dp, getString(R.string.museums_title_BMA), getString(R.string.museums_desc_BMA)));
        museums.add(new Attraction(R.drawable.ic_gavel_white_24dp, getString(R.string.museums_title_Civil_Rights), getString(R.string.museums_desc_Civil_Rights)));
        museums.add(new Attraction(R.drawable.ic_motorcycle_white_24dp, getString(R.string.museums_title_Motorsports), getString(R.string.museums_desc_Motorsports)));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), museums, R.color.museums_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
