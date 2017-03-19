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
        bars.add(new Attraction("41st Street Pub","Try the signature Moscow Mule at this classic city pub in the blossoming Avondale neighborhood."));
        bars.add(new Attraction("Avondale Brewing Company","A sprawling backyard and live music stage set this brewery apart from the rest. Choose from one of six flagship beers or seasonal offerings."));
        bars.add(new Attraction("Carrigan's Public House","A gregarious crowd fills the outdoor patio and rooftop bar of this sprawling industrial space. The inventive cocktails incorporate curious ingredients—TY KU Coconut Sake, Icebox cold-brewed coffee, flamed orange (thankfully not all in one drink)."));
        bars.add(new Attraction("Good People Brewing Company","Located near Railroad Park in a former beer distribution warehouse and across from the minor league baseball stadium. Cornhole and other games in the industrial outdoor seating area."));
        bars.add(new Attraction("Lou’s Pub & Package Store","A liquor store and a classic bar that’s just the right kind of gritty, this watering hole was named one of the best bars by Esquire."));
        bars.add(new Attraction("Octane Coffee","Perfect cuppa joe in the morning and carefully crafted cocktails at night."));
        bars.add(new Attraction("Paramount","With an old-school arcade in the back, this kid-friendly bar serves up playful cocktails."));


        AttractionAdapter adapter = new AttractionAdapter(getActivity(), bars, R.color.bars_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }


}
