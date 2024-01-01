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
import com.example.scheduletheevent.data.Chat;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Chat> chat;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView hName,message,time;
        ImageView p_Img;
        public ViewHolder(@NonNull View view) {
            super(view);
            hName = view.findViewById(R.id.txt_hall_name);
            message = view.findViewById(R.id.txt_msg);
            time = view.findViewById(R.id.txt_msg_time);
            p_Img = view.findViewById(R.id.img_hall);
        }

        public TextView gethName() {
            return hName;
        }

        public TextView getMessage() {
            return message;
        }

        public TextView getTime() {
            return time;
        }

        public ImageView getP_Img() {
            return p_Img;
        }

    }

    public ChatAdapter(ArrayList<Chat> c,Context context){
        this.chat = c;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_chat,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ViewHolder holder, int position) {
        Chat chats = chat.get(position);

        holder.gethName().setText(chats.getHall_name());
        holder.getMessage().setText(chats.getMessage());
        holder.getTime().setText(chats.getTime());

        Glide
                .with(context)
                .load(chats.getProfile_url())
                .thumbnail(Glide.with(context).load(R.raw.imageloading))
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(holder.p_Img);
    }

    @Override
    public int getItemCount() {
        return chat.size();
    }
}
