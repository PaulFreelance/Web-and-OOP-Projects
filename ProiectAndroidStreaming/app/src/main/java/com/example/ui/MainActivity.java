package com.example.ui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.adapters.FilmItemClickListener;
import com.example.modele.Filme;
import com.example.adapters.FilmeAdapter;
import com.example.modele.Slide;
import com.example.adapters.SliderPagina;
import com.example.myapplication12.R;
import com.example.utils.DateSursa;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements FilmItemClickListener {

    private List<Slide> lstslide;
    private ViewPager slidepager;
    private TabLayout indicator;
    private RecyclerView FilmRV,filmRVsaptamanii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniViews();
        iniSlider();
        iniPopularsFilms();
        iniWeekFilms();
    }

    private void iniWeekFilms() {
        FilmeAdapter saptamanaFilmeAdapter = new FilmeAdapter(this,DateSursa.getFilmeleSaptamanii(),this);
        filmRVsaptamanii.setAdapter(saptamanaFilmeAdapter);
        filmRVsaptamanii.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void iniSlider() {
        lstslide = new ArrayList<>();
        lstslide.add(new Slide(R.drawable.slider, "The last man on the Earth \nmore text here"));
        lstslide.add(new Slide(R.drawable.slider2, "Mark of the Vampire \nmore text here"));
        lstslide.add(new Slide(R.drawable.slider, "The last man on the Earth \nmore text here"));
        lstslide.add(new Slide(R.drawable.slider2, "Mark of the Vampire \nmore text here"));

        SliderPagina pagina = new SliderPagina(this,lstslide);
        slidepager.setAdapter(pagina);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new STimer(),4000,6000);
        indicator.setupWithViewPager(slidepager,true);
    }

    private void iniViews() {
        slidepager = findViewById(R.id.slider);
        indicator= findViewById(R.id.indicator);
        FilmRV = findViewById(R.id.film_RV);
        filmRVsaptamanii = findViewById(R.id.filmele_saptamanii_RV);
    }


    private void iniPopularsFilms(){
    FilmeAdapter filmeAdapter = new FilmeAdapter(this, DateSursa.getFilmePopulare(),this);
    FilmRV.setAdapter(filmeAdapter);
    FilmRV.setLayoutManager(new LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL,false));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onFilmClick(Filme film, ImageView filmImageView) {
        Intent intent = new Intent(this, DetaliiFilmActivity.class);
        intent.putExtra("titlu",film.getTitlu());
        intent.putExtra("imagineURL",film.getIconita());
        intent.putExtra("imagineCoperta",film.getPozaCoperta());
        //startActivity(intent);
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,filmImageView,"sharedName");
        startActivity(intent,options.toBundle());
        Toast.makeText(this,"item clicked"+ film.getTitlu(),Toast.LENGTH_LONG).show();
    }

    class STimer extends TimerTask{
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(slidepager.getCurrentItem()<lstslide.size()-1){
                        slidepager.setCurrentItem(slidepager.getCurrentItem()+1);
                    }
                    else
                        slidepager.setCurrentItem(0);
                }
            });
        }
    }
}