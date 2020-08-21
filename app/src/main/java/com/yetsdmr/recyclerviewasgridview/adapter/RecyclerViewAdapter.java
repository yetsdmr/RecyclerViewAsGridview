package com.yetsdmr.recyclerviewasgridview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yetsdmr.recyclerviewasgridview.R;
import com.yetsdmr.recyclerviewasgridview.model.ElementModel;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    private ArrayList<ElementModel> elementModels;
    LayoutInflater inflater;

    public RecyclerViewAdapter(Context context, ArrayList<ElementModel> elementModels) {
        this.elementModels = elementModels;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_grid_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.title.setText(elementModels.get(position).getTitle());
        holder.gridIcon.setImageResource(elementModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return elementModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView gridIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView);
            gridIcon = itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Clicked -> "+ getAdapterPosition(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
