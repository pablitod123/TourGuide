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
        events.add(new Attraction("Birmingham Restaurant Week","A wide variety of participating restaurants offers fixed prices on meals throughout the week, giving foodies a chance to try out all sorts of new offerings."));
        events.add(new Attraction("Alabama Symphony Orchestra Sound Edge Festival","The music scene like you have never seen.  Hear the cultural underground.  Sound Edge Festival brings together creative talents from the music and art industries for intense collaborations with the Alabama Symphony Orchestra."));
        events.add(new Attraction("Honda Indy Grand Prix of Alabama","The only Indy Series event in the Deep South, this motorsports event draws tens of thousands of race fans every year."));
        events.add(new Attraction("Gumbo Gala","This spicy event has grown into one of the city’s most popular cooking competitions. Proceeds benefit Episcopal Place, which provides affordable, independent living for seniors and disabled adults."));
        events.add(new Attraction("Do Dah Day Festival","Benefitting animal rescue services, this is one of the city’s most wonderful and wacky events. Homemade floats and animals dressed in costume parade the streets of Highland Avenue."));
        events.add(new Attraction("Bob Sykes BBQ and Blues Festival","Now in its eighth year, the festival takes place in the heart of downtown Bessemer, just west of Birmingham."));
        events.add(new Attraction("Sloss Music and Arts Festival","Music fans rock to nationally-known and regional alternative bands on three stages. Southern Living magazine calls this event “one of the iconic Southern festivals.”"));
        events.add(new Attraction("Sidewalk Film Festival","This showcase for independent film has gained wide notoriety in film and consumer publications for its tight organization, range of subject matter and good ol’ weekend fun."));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), events, R.color.events_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
