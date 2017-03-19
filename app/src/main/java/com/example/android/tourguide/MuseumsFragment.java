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
        museums.add(new Attraction(R.drawable.ic_album_white_24dp, "Alabama Jazz Hall of Fame","Housed in the restored Carver Theatre, the Jazz Hall of Fame features instruments and memorabilia of Alabama jazz greats. Legends such as Lionel Hampton, W.C. Handy and Nat \"King\" Cole are among some of the Alabama natives honored here."));
        museums.add(new Attraction(R.drawable.ic_lightbulb_outline_white_24dp, "McWane Science Center","A hands-on science and learning center that has a focused mission to make the study of science exciting and to make technology more understandable. An IMAX theater with heart stopping shows is a popular feature, as are several colorful, living aquariums."));
        museums.add(new Attraction(R.drawable.ic_flight_takeoff_white_24dp, "Southern Museum of Flight","Over 80 years of aviation history are highlighted for the aviation buff. Engines, models and memorabilia. Early aircraft include a Huff Daland crop duster, the first plane of Delta Airlines and a 1910 Curtis Pusher."));
        museums.add(new Attraction(R.drawable.ic_gavel_white_24dp, "Birmingham Civil Rights Institute","This museum's galleries will lead you through the era of segregation and the Civil Rights Movement. Multimedia exhibitions depict dramatic events which took place in Birmingham and other cities."));
        museums.add(new Attraction(R.drawable.ic_brush_white_24dp, "Birmingham Museum of Art","The museum boasts an excellent permanent collection of over 16,000 works, including impressive works from the Kress Collection of Renaissance paintings."));
        museums.add(new Attraction(R.drawable.ic_motorcycle_white_24dp, "Barber Vintage Motorsports Museum","Birmingham's most famous racetrack sports an astonishing collection of motorcycles through the ages. There's also a collection of racecars to enjoy."));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), museums, R.color.museums_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
