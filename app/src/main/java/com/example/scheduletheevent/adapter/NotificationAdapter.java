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
import com.example.scheduletheevent.data.Notifications;
import com.example.scheduletheevent.data.PopularPlaces;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder>{

    private Context context;
    private ArrayList<Notifications> notifications;



    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView hName,msgTitle,msg_description,msgTime;
        private ImageView imgUrl;
        public ViewHolder(View view) {
            super(view);
            imgUrl = view.findViewById(R.id.img_hall);
            hName = view.findViewById(R.id.txt_hall_name);
            msgTitle = view.findViewById(R.id.txt_msg_title);
            msg_description = view.findViewById(R.id.txt_msg_description);
            msgTime = view.findViewById(R.id.txt_msg_time);
        }

        public TextView gethName() {
            return hName;
        }

        public TextView getMsgTitle() {
            return msgTitle;
        }

        public TextView getMsg_description() {
            return msg_description;
        }

        public TextView getMsgTime() {
            return msgTime;
        }

        public ImageView getImgUrl() {
            return imgUrl;
        }
    }

    public NotificationAdapter(ArrayList<Notifications> n, Context context){
        this.notifications = n;
        this.context = context;
    }

    @NonNull
    @Override
    public NotificationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_notification,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Notifications notification = notifications.get(position);

        holder.gethName().setText(notification.getHall_name());
        holder.getMsgTitle().setText(notification.getMsg_title());
        holder.getMsg_description().setText(notification.getMsg_description());
        holder.getMsgTime().setText(notification.getMsg_time());

        Glide
                .with(context)
                .load(notification.getImg_url())
                .thumbnail(Glide.with(context).load(R.raw.imageloading))
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(holder.imgUrl);
    }

    @Override
    public int getItemCount() {
        return notifications.size();
    }
}
