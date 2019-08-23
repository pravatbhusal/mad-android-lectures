package com.mad.lecture6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<String> namesList;

    // construct the RecyclerView using the data list
    public RecyclerAdapter(ArrayList<String> dataList) {
        this.namesList = dataList;
    }

    // create the view holder for each item
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // set the item view to the item_view.xml XML layout file
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_view, parent, false);

        // return the view holder using the itemView
        return new ViewHolder(itemView);
    }

    // construct each item in the RecyclerView based on its index
    @Override
    public void onBindViewHolder(ViewHolder holder, int index) {
        String name = namesList.get(index);
        holder.titleText.setText(name);
    }

    // return the number of items in the RecyclerView
    @Override
    public int getItemCount() {
        return namesList.size();
    }

    // a class that provides a reference to the view of each item in the RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private View itemView;
        private TextView titleText;

        // construct the view holder
        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            titleText = itemView.findViewById(R.id.titleText);
        }
    }
}
