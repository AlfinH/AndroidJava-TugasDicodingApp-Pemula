package com.mover.tugasdicodingapp;

import com.mover.tugasdicodingapp.model.Place;

import java.util.ArrayList;

public class PlacesData {
    private static String[] placesNames = {
            "Li Jiang"
    };

    private static String[] placesDetails = {
            "Lijiang is a perfect combination of historical sites, snow-capped mountains, lakes, and ethnic minority cultures. It is famed worldwide for its UNESCO Heritage Site, the Old Town of Lijiang, which dates back to over 800 years ago.",
    };

    private static int[] placesImages = {
            R.drawable.lijiang,
    };

    static ArrayList<Place> getListData() {
        ArrayList<Place> list = new ArrayList<>();
        for (int position = 0; position < placesNames.length; position++) {
            Place place = new Place();
            place.setName(placesNames[position]);
            place.setDetail(placesDetails[position]);
            place.setImage(placesImages[position]);
            list.add(place);
        }
        return list;
    }
}
