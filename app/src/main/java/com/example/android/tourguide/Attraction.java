package com.example.android.tourguide;

/**
 * Created by paulstyslinger on 3/2/17.
 */

public class Attraction {

    private String mAttractionTitleId;

    private String mDescriptionId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //Constructor
    public Attraction(String attractionTitleId, String descriptionId) {
        mAttractionTitleId = attractionTitleId;
        mDescriptionId = descriptionId;
    }

    //Constructor for Attractions with images
    public Attraction(int imageResourceId, String attractionTitleId, String descriptionId) {
        mAttractionTitleId = attractionTitleId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;
    }

    //Getter Methods
    public String getDescriptionId() {
        return mDescriptionId;
    }

    public String getAttractionTitleId() {
        return mAttractionTitleId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
