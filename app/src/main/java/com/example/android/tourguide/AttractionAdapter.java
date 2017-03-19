package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by paulstyslinger on 3/16/17.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private int mColorResourceId;

    public AttractionAdapter(Context context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Attraction object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Get the attraction Title Textview, and set the text to the Attraction Tittle
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.attractionTitle);
        titleTextView.setText(currentAttraction.getAttractionTitleId());

       // Add the Attraction description the same way as the Title
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.attractionDescription);
        descriptionTextView.setText(currentAttraction.getDescriptionId());

        // Find and set the color
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        // Find and set the image to the ImageView, if the image exists
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentAttraction.hasImage()) {
            imageView.setImageResource(currentAttraction.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;

    }
}
