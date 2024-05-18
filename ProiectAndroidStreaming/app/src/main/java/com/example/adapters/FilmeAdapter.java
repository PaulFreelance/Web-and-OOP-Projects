package com.example.adapters;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.modele.Filme;
import com.example.myapplication12.R;

import java.util.List;
public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.MyViewHolder> {
    Context context;
    List<Filme> mData;
    FilmItemClickListener filmItemClickListener;

    public FilmeAdapter(Context context, List<Filme> mData,FilmItemClickListener listener) {
        this.context = context;
        this.mData = mData;
        filmItemClickListener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.film_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.TitleTV.setText(mData.get(position).getTitlu());
        holder.ImgFilm.setImageResource(mData.get(position).getIconita());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView TitleTV;
        private ImageView ImgFilm;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            TitleTV = itemView.findViewById(R.id.item_filme_titlu);
            ImgFilm = itemView.findViewById(R.id.item_film_imag);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    filmItemClickListener.onFilmClick(mData.get(getAdapterPosition()),ImgFilm);
                }
            });
        }
    }
}