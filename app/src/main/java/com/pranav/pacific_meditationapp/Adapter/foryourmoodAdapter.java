package com.pranav.pacific_meditationapp.Adapter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.pranav.pacific_meditationapp.Domain.foryourmoodDomain;
import com.pranav.pacific_meditationapp.R;


import java.util.ArrayList;

public class foryourmoodAdapter extends RecyclerView.Adapter<foryourmoodAdapter.ViewHolder> {
    ArrayList<foryourmoodDomain>foryourmoodDomains;
    public foryourmoodAdapter(ArrayList<foryourmoodDomain>foryourmoodDomains){
        this.foryourmoodDomains=foryourmoodDomains;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View inflate =LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_foryourmood,parent,false);
        return new ViewHolder(inflate);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,int position){
        holder.foryourmoodName.setText(foryourmoodDomains.get(position).getTitle());
        String picUrl="";
        switch(position){
            case 0:{
                picUrl="foryourmood1";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
             break;
            }
            case 1:{
                picUrl="foryourmood2";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }case 2:{
                picUrl="foryourmood3";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }case 3:{
                picUrl="foryourmood4";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }case 4:{
                picUrl="foryourmood5";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }case 5:{
                picUrl="foryourmood6";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }case 6:{
                picUrl="foryourmood7";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }case 7:{
                picUrl="foryourmood8";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }case 8:{
                picUrl="foryourmood9";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }case 9:{
                picUrl="foryourmood10";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }case 10:{
                picUrl="foryourmood11";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }case 11:{
                picUrl="foryourmood12";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.for_background1));
                break;
            }
        }
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId)
                .into(holder.foryourmoodPic);

    }


    @Override
    public int getItemCount(){
        return foryourmoodDomains.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView foryourmoodName;
        ImageView foryourmoodPic;
        ConstraintLayout mainLayout;
        public ViewHolder(@NonNull View itemview) {
            super(itemview);
            foryourmoodName= itemview.findViewById(R.id.madeforyouName);
            foryourmoodPic=itemview.findViewById(R.id.madeforyouPic);
            mainLayout=itemview.findViewById(R.id.mainLayout);
        }
    }

}
