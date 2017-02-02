package com.example.alejandro.recyclertest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Alejandro on 01/02/2017.
 */

public class AlgorithmAdapter extends RecyclerView.Adapter<AlgorithmAdapter.AlgorithmViewHolder> {
    private List<Algorithm> items;

    public AlgorithmAdapter(List<Algorithm> items) {
        this.items = items;
    }

    public static class AlgorithmViewHolder extends RecyclerView.ViewHolder{
        public ImageView image;
        public TextView title;
        public TextView description;

        public AlgorithmViewHolder(View v) {
            super(v);
            image = (ImageView) v.findViewById(R.id.image);
            title = (TextView)v.findViewById(R.id.title);
            description = (TextView)v.findViewById(R.id.description);
        }
    }


    @Override
    public AlgorithmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.algorithm_card, parent,false);
        return new AlgorithmViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AlgorithmViewHolder holder, int position) {
        holder.image.setImageResource(items.get(position).getImage());
        holder.title.setText(items.get(position).getTitle());
        holder.description.setText(items.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
