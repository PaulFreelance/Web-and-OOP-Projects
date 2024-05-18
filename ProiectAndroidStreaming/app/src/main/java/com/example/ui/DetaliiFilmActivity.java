package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.adapters.CastAdapter;
import com.example.modele.Cast;
import com.example.myapplication12.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class DetaliiFilmActivity extends AppCompatActivity {
    private ImageView IconitaFilmimg, CopertaFilm;
    private TextView tv_titlu,tv_descriere;
    private FloatingActionButton play_fab;
    private RecyclerView RVCast;
    private CastAdapter castAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalii_film);
        inViews();
        setupRVCast();
    }
    void inViews(){
        RVCast = findViewById(R.id.rv_cast);
        play_fab = findViewById(R.id.play_fab);
        String titluFilm = getIntent().getExtras().getString("titlu");
        int sursaimaginiID = getIntent().getExtras().getInt("imagineURL");
        int imaginecoperta = getIntent().getExtras().getInt("imagineCoperta");
        IconitaFilmimg = findViewById(R.id.detalii_film_img);
        Glide.with(this).load(sursaimaginiID).into(IconitaFilmimg);
        IconitaFilmimg.setImageResource(sursaimaginiID);
        CopertaFilm = findViewById(R.id.detaliu_coperta_film);
        Glide.with(this).load(imaginecoperta).into(CopertaFilm);
        tv_titlu = findViewById(R.id.detaliu_titlu_film);
        tv_titlu.setText(titluFilm);
        tv_descriere = findViewById(R.id.detaliu_desc_film);
        //CopertaFilm.setAnimation(AnimationUtils.lerp(this,R.anim.scale_animation));
        //play_fab.setAnimation(AnimationUtils.lerp(this,R.anim.scale_animation));
    }
    void setupRVCast(){
        List<Cast> mData = new ArrayList<>();
        mData.add(new Cast("nume",R.drawable.batvicentprince));
        mData.add(new Cast("nume",R.drawable.batagnes));
        mData.add(new Cast("nume",R.drawable.batgavin));
        mData.add(new Cast("nume",R.drawable.batjohnsutton));
        castAdapter = new CastAdapter(this,mData);
        RVCast.setAdapter(castAdapter);
        RVCast.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
}