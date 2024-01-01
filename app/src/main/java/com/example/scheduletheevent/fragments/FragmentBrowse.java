package com.example.scheduletheevent.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.scheduletheevent.R;
import com.example.scheduletheevent.adapter.PopularPlacesAdapter;
import com.example.scheduletheevent.data.PopularPlaces;

import java.util.ArrayList;

public class FragmentBrowse extends Fragment {

    private ArrayList<PopularPlaces> popularPlaces;
    RecyclerView rvBrowse;
    PopularPlacesAdapter pp_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_browse, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        popularPlaces = new ArrayList<>();
        popularPlaces.add(new PopularPlaces("Hall Number One","Lahore","6000","https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        popularPlaces.add(new PopularPlaces("Hall Number Two","Karachi","6500","https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        popularPlaces.add(new PopularPlaces("Hall Number Three","Multan","5499","https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));
        popularPlaces.add(new PopularPlaces("Hall Number Four","Islamabad","7000","https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k="));


        rvBrowse = view.findViewById(R.id.rv_browse);
        pp_adapter = new PopularPlacesAdapter(popularPlaces,this.getContext());
        rvBrowse.setAdapter(pp_adapter);
        rvBrowse.setLayoutManager(new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false));
    }
}
