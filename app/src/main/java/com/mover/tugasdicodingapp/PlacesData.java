package com.mover.tugasdicodingapp;

import com.mover.tugasdicodingapp.model.Place;

import java.util.ArrayList;

public class PlacesData {
    private static String[] placesNames = {
            "Bali",
            "Pragser Wildsee",
            "Borobudur",
            "Stonehenge",
            "Li Jiang",
            "Hector Lake",
            "Reine",
            "Torres del Paine National Park",
            "Yosemite National Park",
            "Seven Lakes State Park",
    };

    private static String[] placesDetails = {
            "Bali is the most popular island holiday destination in the Indonesian archipelago. The island is home to an ancient culture that's known for its warm hospitality. Exotic temples and palaces set against stunning natural backdrops are some of the top attractions. Dining in Bali presents endless choices of local or far-flung cuisine. After sunset, famous nightspots come to life offering exciting clubbing and packed dance floors. Inland, towering volcanoes and pristine jungles greet you with plenty to see and do, but you won't want to stay away from the beach for long.",
            "Pragser Wildsee is one of the most beautiful lakes in Italy. Located at an altitude of about 1,500 m above sea level in the picturesque Alta Pusteria / Hochpustertal, the mountain lake captivates with its turquoise-green colour and the imposing Seekofel massif (2,810 m) that surrounds it.",
            "Borobudur temple is the world’s biggest Buddhist monument, an ancient site widely considered to be one of the world’s seven wonders. The temple sits majestically on a hilltop overlooking lush green fields and distant hills. Built in the 9th century during the reign of the Syailendra dynasty, the temple’s design in Gupta architecture reflects India's influence on the region, yet there are enough indigenous scenes and elements incorporated to make Borobudur uniquely Indonesian.",
            "Stonehenge is a massive stone monument located on a chalky plain north of the modern-day city of Salisbury, England. Research shows that the site has continuously evolved over a period of about 10,000 years. The structure that we call \"Stonehenge\" was built between roughly 5,000 and 4,000 years ago and was one part of a larger sacred landscape that included a massive stone monument that was 15 times the size of Stonehenge. ",
            "Lijiang is a perfect combination of historical sites, snow-capped mountains, lakes, and ethnic minority cultures. It is famed worldwide for its UNESCO Heritage Site, the Old Town of Lijiang, which dates back to over 800 years ago.",
            "Hector Lake is one of the lakes that line the Icefields Parkway in Banff National Park and Jasper National Park, other such lakes being Bow Lake, Lake Louise, Peyto Lake, Mistaya Lake, Waterfowl Lakes, Chephren Lake and Sunwapta Lake.",
            "Reine is the administrative centre of Moskenes Municipality in Nordland county, Norway. The fishing village is located on the island of Moskenesøya in the Lofoten archipelago, above the Arctic Circle, about 300 kilometres (190 mi) southwest of the town of Troms. Reine Church is located here and it serves the northern part of the municipality.",
            "Torres del Paine National Park is a national park encompassing mountains, glaciers, lakes, and rivers in southern Chilean Patagonia. The Cordillera del Paine is the centerpiece of the park. It lies in a transition area between the Magellanic subpolar forests and the Patagonian Steppes. The park is located 112 km (70 mi) north of Puerto Natales and 312 km (194 mi) north of Punta Arenas. The park borders Bernardo O'Higgins National Park to the west and the Los Glaciares National Park to the north in Argentine territory. Paine means \"blue\" in the native Tehuelche (Aonikenk) language and is pronounced PIE-nay.",
            "Not just a great valley, but a shrine to human foresight, the strength of granite, the power of glaciers, the persistence of life, and the tranquility of the High Sierra.\n" +
                    "\nFirst protected in 1864, Yosemite National Park is best known for its waterfalls, but within its nearly 1,200 square miles, you can find deep valleys, grand meadows, ancient giant sequoias, a vast wilderness area, and much more.",
            "Seven Lakes State Park is a public recreation area covering 1,434 acres (580 ha) one mile northwest of Holly in Holly Township, Oakland County, Michigan. The state park's 230 acres (93 ha) of water are found in six named lakes that include 170-acre Big Seven Lake, Little Seven Lake, and 44-acre Dickinson Lake",
    };

    private static int[] placesImages = {
            R.drawable.bali,
            R.drawable.pragser_wildsee,
            R.drawable.borobudur,
            R.drawable.stonehenge,
            R.drawable.lijiang,
            R.drawable.hectorlake,
            R.drawable.reine,
            R.drawable.torres,
            R.drawable.yosemite,
            R.drawable.sevenlakes,
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
