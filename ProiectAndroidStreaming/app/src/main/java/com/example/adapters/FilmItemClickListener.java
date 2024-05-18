package com.example.adapters;

import android.widget.ImageView;

import com.example.modele.Filme;

public interface FilmItemClickListener {
    void onFilmClick(Filme film, ImageView filmImageView);

}
