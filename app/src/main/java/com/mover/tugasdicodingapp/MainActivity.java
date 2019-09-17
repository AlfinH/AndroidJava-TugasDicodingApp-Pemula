package com.mover.tugasdicodingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.mover.tugasdicodingapp.adapter.PlaceAdapter;
import com.mover.tugasdicodingapp.model.Place;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPlaces;
    private ArrayList<Place> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlaces = findViewById(R.id.recycler_places);
        rvPlaces.setHasFixedSize(true);

        list.addAll(PlacesData.getListData());
        showRecyclerCardView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.dicoding_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.user_detail:
                Intent goDetail = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(goDetail);
                return true;
            //add more item if you have another item to be clicked
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showRecyclerCardView(){
        rvPlaces.setLayoutManager(new LinearLayoutManager(this));
        PlaceAdapter placeAdapter = new PlaceAdapter(list);
        placeAdapter.setOnItemClickListener(new PlaceAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Place place, int position) {
                Intent goPlaceDetail = new Intent(MainActivity.this, DetailActivity.class);
                goPlaceDetail.putExtra("EXTRA_PLACE", place);
                startActivity(goPlaceDetail);
            }
        });

        rvPlaces.setAdapter(placeAdapter);

    }
}
