package com.example.android.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulstyslinger on 3/2/17.
 */


public class BarsFragment extends Fragment {

    public BarsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        //information copied from http://www.southernliving.com/travel/city-guide/birmingham/bars
        final ArrayList<Attraction> bars = new ArrayList<Attraction>();
        bars.add(new Attraction(getString(R.string.bars_title_41_Street), getString(R.string.bars_desc_41_Street)));
        bars.add(new Attraction(getString(R.string.bars_title_Avondale), getString(R.string.bars_desc_Avondale)));
        bars.add(new Attraction(getString(R.string.bars_title_Carrigans), getString(R.string.bars_desc_Carrigans)));
        bars.add(new Attraction(getString(R.string.bars_title_Good_People), getString(R.string.bars_desc_Good_People)));
        bars.add(new Attraction(getString(R.string.bars_title_Lous), getString(R.string.bars_desc_Lous)));
        bars.add(new Attraction(getString(R.string.bars_title_Octane), getString(R.string.bars_desc_Octane)));
        bars.add(new Attraction(getString(R.string.bars_title_Paramount), getString(R.string.bars_desc_Paramount)));


        AttractionAdapter adapter = new AttractionAdapter(getActivity(), bars, R.color.bars_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }


}
