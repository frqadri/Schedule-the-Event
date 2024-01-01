package com.example.scheduletheevent.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.scheduletheevent.R;
import com.example.scheduletheevent.adapter.CategoryAdapter;
import com.example.scheduletheevent.adapter.PopularPlacesAdapter;
import com.example.scheduletheevent.data.Categories;
import com.example.scheduletheevent.data.PopularPlaces;
import com.google.android.material.search.SearchBar;

import java.util.ArrayList;

public class FragmentHome extends Fragment {

    private ArrayList<Categories> categories;
    private ArrayList<PopularPlaces> popularPlaces;
    RecyclerView rvCategory, rvPopularPlaces, rvNearToYou;
    CategoryAdapter adapter;
    PopularPlacesAdapter pp_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        categories = new ArrayList<>();
        categories.add(new Categories(R.drawable.hall, "All"));
        categories.add(new Categories(R.drawable.banquet_hall, "Banquet Halls"));
        categories.add(new Categories(R.drawable.conference, "Conference Halls"));
        categories.add(new Categories(R.drawable.exhibition, "Exhibition Centers"));
        categories.add(new Categories(R.drawable.concert, "Concert Venues"));
        categories.add(new Categories(R.drawable.outdoor_event, "Outdoor Event"));
        categories.add(new Categories(R.drawable.sports_event, "Sports Events"));

        rvCategory = view.findViewById(R.id.rv_category);
        adapter = new CategoryAdapter(categories, this.getContext());
        rvCategory.setAdapter(adapter);
        rvCategory.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false));


        popularPlaces = new ArrayList<>();
        popularPlaces.add(new PopularPlaces("Hall Number One", "Lahore", "6000", "https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        popularPlaces.add(new PopularPlaces("Hall Number Two", "Karachi", "6500", "https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        popularPlaces.add(new PopularPlaces("Hall Number Three", "Multan", "5499", "https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        popularPlaces.add(new PopularPlaces("Hall Number Four", "Islamabad", "7000", "https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        popularPlaces.add(new PopularPlaces("Hall Number Five", "Pindi", "6999", "https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        popularPlaces.add(new PopularPlaces("Hall Number Six", "Multan", "5999", "https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        popularPlaces.add(new PopularPlaces("Hall Number Seven", "Lahore", "6500", "https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        popularPlaces.add(new PopularPlaces("Hall Number Eight", "Islamabad", "6800", "https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        rvPopularPlaces = view.findViewById(R.id.rv_popularPlaces);
        pp_adapter = new PopularPlacesAdapter(popularPlaces, this.getContext());
        rvPopularPlaces.setAdapter(pp_adapter);
        rvPopularPlaces.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false));

        rvNearToYou = view.findViewById(R.id.rv_neartoyou);
        pp_adapter = new PopularPlacesAdapter(popularPlaces, this.getContext());
        rvNearToYou.setAdapter(pp_adapter);
        rvNearToYou.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false));

    }
}
