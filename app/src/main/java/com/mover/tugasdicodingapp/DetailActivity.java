package com.mover.tugasdicodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.mover.tugasdicodingapp.model.Place;

public class DetailActivity extends AppCompatActivity {

    private ImageView imvPlace;
    private TextView tvPlaceName,tvPlaceDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Place place = (Place) getIntent().getSerializableExtra("EXTRA_PLACE");

        imvPlace = findViewById(R.id.img_detail);
        tvPlaceName = findViewById(R.id.tv_place_name);
        tvPlaceDetail = findViewById(R.id.tv_place_detail);

        imvPlace.setImageResource(place.getImage());
        tvPlaceName.setText(place.getName());
        tvPlaceDetail.setText(place.getDetail());
    }
}
