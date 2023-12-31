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
import com.example.scheduletheevent.adapter.NotificationAdapter;
import com.example.scheduletheevent.data.Notifications;

import java.util.ArrayList;

public class FragmentNotifications extends Fragment {
    private ArrayList<Notifications> notifications;
    RecyclerView rvNotification;
    NotificationAdapter notificationAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        notifications = new ArrayList<>();
        notifications.add(new Notifications("Hall Number 1","Offer a discount","we are running New Year Sale and give 10% discount till 15-JAN-2024!","now","https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk="));
        notifications.add(new Notifications("Hall Number 2","Order Booked!","Thank you!","now","https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk="));
        notifications.add(new Notifications("Hall Number 3","Send a message","Hi, Sir how are You? We are waiting for your response ","now","https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk="));
        notifications.add(new Notifications("Hall Number 4","Update Price","we are running New Year Sale and give 10% discount till 15-JAN-2024!","now","https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk="));
        notifications.add(new Notifications("Hall Number 5","Order Booked!","Thank you!","now","https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk="));
        notifications.add(new Notifications("Hall Number 6","Update Price","we are running New Year Sale and give 10% discount till 15-JAN-2024!","now","https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk="));
        notifications.add(new Notifications("Hall Number 7","Send a message","Hi, Sir how are You? We are waiting for your response ","now","https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk="));
        notifications.add(new Notifications("Hall Number 8","offer a discount","we are running New Year Sale and give 10% discount till 15-JAN-2024!","now","https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk="));
        notifications.add(new Notifications("Hall Number 9","offer a discount","we are running New Year Sale and give 10% discount till 15-JAN-2024!","now","https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk="));
        notifications.add(new Notifications("Hall Number 10","offer a discount","we are running New Year Sale and give 10% discount till 15-JAN-2024!","now","https://media.istockphoto.com/id/493839116/photo/tables-with-centerpieces-at-wedding-reception.jpg?s=612x612&w=0&k=20&c=g-tb7QZoq3nGXBKEsjNf-hPUUt-U_rhDny0VnHWd3xk="));
        rvNotification = view.findViewById(R.id.rv_notifications);
        notificationAdapter = new NotificationAdapter(notifications,this.getContext());
        rvNotification.setAdapter(notificationAdapter);
        rvNotification.setLayoutManager(new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false));

    }
}
