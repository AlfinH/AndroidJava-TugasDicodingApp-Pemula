package com.mover.tugasdicodingapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mover.tugasdicodingapp.R;
import com.mover.tugasdicodingapp.model.Place;

import java.util.ArrayList;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {
    public OnItemClickListener listener;

    private ArrayList<Place> listPlace;

    public PlaceAdapter(ArrayList<Place> listPlace) {
        this.listPlace = listPlace;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        Place place = listPlace.get(position);
        Glide.with(holder.itemView.getContext())
                .load(place.getImage())
                .apply(new RequestOptions().override(150, 150))
                .into(holder.imgPhoto);
        holder.tvName.setText(place.getName());
        holder.tvDetail.setText(place.getDetail());
    }

    @Override
    public int getItemCount() {
        return listPlace.size();
    }

    public class PlaceViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION && listener != null){
                        listener.onItemClick(listPlace.get(position),position);
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Place place, int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }
}
