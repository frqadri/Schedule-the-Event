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
        popularPlaces.add(new PopularPlaces("https://media.istockphoto.com/id/1397739237/photo/international-buffet-in-the-hotel-for-meetings-and-seminars-dining-together.jpg?s=612x612&w=0&k=20&c=RoTqIWUaQ2XxypATaOxxrnGd0oONWdj5N6lgRpO9stI=","Hall Number 1","Lahore","3000/Per Head"));
        popularPlaces.add(new PopularPlaces("https://media.istockphoto.com/id/1472804671/photo/luxury-delicious-appetizer-serving.jpg?s=612x612&w=0&k=20&c=2anc2oN7XNMcsygVv-S6wCV07ekrXb2SAoJPuiIeuS0=","Hall Number 2","Karachi","2500/Per Head"));
        popularPlaces.add(new PopularPlaces("https://media.istockphoto.com/id/1307328933/photo/interior-of-a-banquet-hall-in-a-hotel-or-in-a-luxury-restaurant-with-round-tables-and-navy.jpg?s=612x612&w=0&k=20&c=0RHTrl51nwZRmw_RtNE2xTdNhlgaCOAzK4XJAV3cpkU=","Hall Number 3","Gujwanwala","2999/Per Head"));
        popularPlaces.add(new PopularPlaces("https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk=","Hall Number 4","Pindi","2599/Per Head"));
        popularPlaces.add(new PopularPlaces("https://media.istockphoto.com/id/1387884589/photo/table-setting-for-an-event.jpg?s=612x612&w=0&k=20&c=uKg6gBbqqB1PLN1dtuj0LAUFDlXSaOgevC0a9pa41H0=","Hall Number 5","Multan","3999/Per Head"));
        popularPlaces.add(new PopularPlaces("https://images.unsplash.com/photo-1524824267900-2fa9cbf7a506?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmFucXVldHxlbnwwfDB8MHx8fDI%3D","Hall Number 6","Islamabad","4999/Per Head"));
        popularPlaces.add(new PopularPlaces("https://media.istockphoto.com/id/492542118/photo/elegant-banquet-hall-interior.jpg?s=612x612&w=0&k=20&c=A4FP8QdSVi--k0vxMPcfXf7qwi2H3jNq3KmgH8dSZY4=","Hall Number 7","Lahore","3599/Per Head"));
        popularPlaces.add(new PopularPlaces("https://media.istockphoto.com/id/1060895354/photo/banquet-hall.jpg?s=612x612&w=0&k=20&c=QIGkt1Z8_AdGftxCGCvAiEL8zNjEpLhyq_KXJiOJE0k=","Hall Number 8","Lahore","3699/Per Head"));

        rvBrowse = view.findViewById(R.id.rv_browse);
        pp_adapter = new PopularPlacesAdapter(popularPlaces,this.getContext());
        rvBrowse.setAdapter(pp_adapter);
        rvBrowse.setLayoutManager(new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false));
    }
}
