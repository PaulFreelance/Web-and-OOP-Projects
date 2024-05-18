package com.example.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.modele.Cast;
import com.example.myapplication12.R;

import java.util.List;

public class CastAdapter extends RecyclerView.Adapter<CastAdapter.CViewHolder> {
    Context mContext;
    List<Cast> mData;

    public CastAdapter(Context mContext, List<Cast> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.cast_item,parent,false);
        return new CViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CViewHolder holder, int position) {
        Glide.with(mContext).load(mData.get(position).getImag_link()).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class CViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        @SuppressLint("ResourceType")
        public CViewHolder(@NonNull View itemView){
            super(itemView);
            img = itemView.findViewById(R.layout.imag_cast);
        }
    }
}
