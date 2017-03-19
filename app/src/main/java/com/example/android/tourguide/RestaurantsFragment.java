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
        restaurants.add(new Attraction("Ollie Irene","Ask Birmingham's top toques where they like to go on their occasional night off, and Ollie Irene is sure to come up. Set in Mountain Brook, near Birmingham, this Beard-nominated gastropub offers new takes on the farm-style fare chef Chris Newsome’s grandmother used to prepare."));
        restaurants.add(new Attraction("Ovenbird","After 20 years of serving some of the most refined farm-to-table cuisine on the eastern seaboard, James Beard Award–winner chef Chris Hastings, chef-owner of renowned Hot & Hot Fish Club, has expanded his Magic City footprint."));
        restaurants.add(new Attraction("Highlands Bar & Grill","Since 1982, mom-and-pop team Paradis and Beard-winning chef Frank Stitt have been attracting hoards of locals and traveling gourmands to their Five Points restaurant. For the past seven years, the place has been a finalist for Beard's \"Outstanding Restaurant\" award. "));
        restaurants.add(new Attraction("Habitat Feed & Social","Part of the brand-new Grand Bohemian Hotel Mountain Brook, this chic rooftop eatery is reminiscent of a modernized medieval castle. It offers an array of regional, seasonal fare prepared by executive chef Kirk Gilbert such as Alabama lamb rack with huckleberry-elderflower reduction as well as Gulf shrimp and diver scallops with celery root and Yukon gold potatoes, heirloom rainbow carrots and saffron lemongrass beurre fondue. "));
        restaurants.add(new Attraction("El Barrio Restaurante y Bar", "This funky spot, located in Downtown’s up-and-coming Second Avenue North neighborhood, takes fare from across Mexico and gives it an American twist with locally sourced ingredients. Instead, the place offers interesting mash-ups and hybrids like grilled chorizo meatloaf and green pozole with slow-roasted pork, hominy, hatch chile, cilantro, tomatillo, marinated cabbage and cornbread."));
        restaurants.add(new Attraction("Revelator Coffee","Birthed in New Orleans, raised in Downtown Birmingham, this chainlet of coffee shops is taking over the South. Similar to Portland-based Stumptown or San Francisco’s Blue Bottle, there are now crisp, minimalist storefronts popping across the region with newly opened locations in Atlanta, Chattanooga and Nashville."));
        restaurants.add(new Attraction("Babalu Tacos & Tapas ","Babalu is the taco joint that’s taking over the area under the Mason-Dixon line. After receiving rave reviews in Jackson, Mississippi, and Memphis, the company jumped into the Magic City with a modern location in the Lakeview district. With indoor and outdoor seating, the place serves hormone-free proteins and craft cocktails in comfortable surrounds."));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), restaurants, R.color.restaurants_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
