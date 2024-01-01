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
import com.example.scheduletheevent.adapter.ChatAdapter;
import com.example.scheduletheevent.data.Chat;

import java.util.ArrayList;

public class FragmentChat extends Fragment {
    private ArrayList<Chat> chat;
    RecyclerView rvChat;
    ChatAdapter chatAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        chat = new ArrayList<>();
        chat.add(new Chat("Hall Number 1", "We will wait for your response.", "Today","https://media.istockphoto.com/id/1397739237/photo/international-buffet-in-the-hotel-for-meetings-and-seminars-dining-together.jpg?s=612x612&w=0&k=20&c=RoTqIWUaQ2XxypATaOxxrnGd0oONWdj5N6lgRpO9stI="));
        chat.add(new Chat("Hall Number 2", "Photo message", "Today","https://media.istockphoto.com/id/1397739237/photo/international-buffet-in-the-hotel-for-meetings-and-seminars-dining-together.jpg?s=612x612&w=0&k=20&c=RoTqIWUaQ2XxypATaOxxrnGd0oONWdj5N6lgRpO9stI="));
        chat.add(new Chat("Hall Number 3", "Did you confirm your order?", "Today","https://media.istockphoto.com/id/1397739237/photo/international-buffet-in-the-hotel-for-meetings-and-seminars-dining-together.jpg?s=612x612&w=0&k=20&c=RoTqIWUaQ2XxypATaOxxrnGd0oONWdj5N6lgRpO9stI="));
        chat.add(new Chat("Hall Number 4", "Check in at 08:30PM.", "Today","https://media.istockphoto.com/id/1397739237/photo/international-buffet-in-the-hotel-for-meetings-and-seminars-dining-together.jpg?s=612x612&w=0&k=20&c=RoTqIWUaQ2XxypATaOxxrnGd0oONWdj5N6lgRpO9stI="));
        chat.add(new Chat("Hall Number 5", "It's RS 6,000 Per Head.", "Today","https://media.istockphoto.com/id/1397739237/photo/international-buffet-in-the-hotel-for-meetings-and-seminars-dining-together.jpg?s=612x612&w=0&k=20&c=RoTqIWUaQ2XxypATaOxxrnGd0oONWdj5N6lgRpO9stI="));
        rvChat = view.findViewById(R.id.rv_chat);
        chatAdapter = new ChatAdapter(chat,this.getContext());
        rvChat.setAdapter(chatAdapter);
        rvChat.setLayoutManager(new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false));

    }
}
