package com.example.qwer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<MainModels> mainModels;
    Context context;

    public Adapter(Context context, ArrayList<MainModels> mainModels)
    {
        this.context=context;
        this.mainModels=mainModels;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.order_details_recycler,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Setting image view:
        holder.imageview.setImageResource(mainModels.get(position).getImg());


    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //Initialize Variable
        ImageView imageview;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            imageview=itemView.findViewById(R.id.image1);
       }
    }
}
