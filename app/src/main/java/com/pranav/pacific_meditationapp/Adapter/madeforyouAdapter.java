package com.pranav.pacific_meditationapp.Adapter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.pranav.pacific_meditationapp.Domain.madeforyouDomain;
import com.pranav.pacific_meditationapp.R;


import java.util.ArrayList;

public class madeforyouAdapter extends RecyclerView.Adapter<madeforyouAdapter.ViewHolder> {
    ArrayList<madeforyouDomain>madeforyouDomains;
    public madeforyouAdapter(ArrayList<madeforyouDomain>madeforyouDomains){
        this.madeforyouDomains=madeforyouDomains;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View inflate =LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_madeforyou,parent,false);
        return new ViewHolder(inflate);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,int position){
        holder.madeforyouName.setText(madeforyouDomains.get(position).getTitle());
        String picUrl="";
        switch(position){
            case 0:{
                picUrl="foryourmood10";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.made_background1));
                break;
            }
            case 1:{
                picUrl="foryourmood9";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.made_background1));
                break;
            }case 2:{
                picUrl="foryourmood8";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.made_background1));
                break;
            }case 3:{
                picUrl="foryourmood7";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.made_background1));
                break;
            }case 4:{
                picUrl="foryourmood6";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.made_background1));
                break;
            }
        }
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId)
                .into(holder.madeforyouPic);

    }


    @Override
    public int getItemCount(){
        return madeforyouDomains.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView madeforyouName;
        ImageView madeforyouPic;
        ConstraintLayout mainLayout;
        public ViewHolder(@NonNull View itemview) {
            super(itemview);
            madeforyouName= itemview.findViewById(R.id.madeforyouName);
            madeforyouPic=itemview.findViewById(R.id.madeforyouPic);
            mainLayout=itemview.findViewById(R.id.mainLayout);
        }
    }

}
