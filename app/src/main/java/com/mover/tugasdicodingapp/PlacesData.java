package com.mover.tugasdicodingapp;

import com.mover.tugasdicodingapp.model.Place;

import java.util.ArrayList;

public class PlacesData {
    private static String[] placesNames = {
            "Li Jiang"
    };

    private static String[] placesDetails = {
            "Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. KH. Ahmad Dahlan telah mempelopori kebangkitan ummat Islam untuk menyadari nasibnya sebagai bangsa terjajah yang masih harus belajar dan berbuat.",
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
