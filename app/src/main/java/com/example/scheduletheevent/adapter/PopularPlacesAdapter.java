package com.example.scheduletheevent.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.scheduletheevent.R;
import com.example.scheduletheevent.data.PopularPlaces;

import java.util.ArrayList;

public class PopularPlacesAdapter extends RecyclerView.Adapter<PopularPlacesAdapter.ViewHolder>{
    private Context context;
    private ArrayList<PopularPlaces> popularplaces;

    public static class ViewHolder extends RecyclerView.ViewHolder {
//        private TextView url;
        private TextView hName,hLocation,hPrice;
        private ImageView imgurl;
        public ViewHolder(View view) {
            super(view);
            imgurl = view.findViewById(R.id.img_P_Places);
            hName = view.findViewById(R.id.txt_hall_name);
            hLocation = view.findViewById(R.id.txt_hall_location);
            hPrice = view.findViewById(R.id.txt_price);
        }

        public ImageView getImgurl() {
            return imgurl;
        }

        public TextView gethName() {
            return hName;
        }

        public TextView gethLocation() {
            return hLocation;
        }

        public TextView gethPrice() {
            return hPrice;
        }
    }
    public PopularPlacesAdapter(ArrayList<PopularPlaces> p_p, Context context){
        this.popularplaces = p_p;
        this.context = context;
    }
    @NonNull
    @Override
    public PopularPlacesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.popular_places_category,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularPlacesAdapter.ViewHolder holder, int position) {
        PopularPlaces popular_places = popularplaces.get(position);

        holder.gethName().setText(popular_places.getPlace_name());
        holder.gethLocation().setText(popular_places.getPlace_location());
        holder.gethPrice().setText(popular_places.getPrice());

        Glide
                .with(context)
                .load(popular_places.getUrl())
                .thumbnail(Glide.with(context).load(R.raw.imageloading))
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(holder.imgurl);


    }

    @Override
    public int getItemCount() {
        return popularplaces.size();
    }
}
