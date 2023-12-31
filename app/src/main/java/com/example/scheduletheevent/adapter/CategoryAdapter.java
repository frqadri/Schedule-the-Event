package com.example.scheduletheevent.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.scheduletheevent.R;
import com.example.scheduletheevent.data.Categories;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Categories> categories;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgCategory;
        private TextView txtCategory;
        public ViewHolder(View view) {
            super(view);
            imgCategory = view.findViewById(R.id.img_category);
            txtCategory = view.findViewById(R.id.txt_category);
        }

        public ImageView getImgCategory() {
            return imgCategory;
        }

        public TextView getTxtCategory() {
            return txtCategory;
        }
    }
    public CategoryAdapter(ArrayList<Categories> c, Context context){
        this.categories = c;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_category,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Categories category = categories.get(position);
        holder.getImgCategory().setImageDrawable(ContextCompat.getDrawable(context,category.getImage()));
        holder.getTxtCategory().setText(category.getName());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

}
