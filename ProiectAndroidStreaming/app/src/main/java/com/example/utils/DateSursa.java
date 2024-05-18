package com.example.utils;

import com.example.modele.Filme;
import com.example.myapplication12.R;

import java.util.ArrayList;
import java.util.List;

public class DateSursa {

    public static List<Filme> getFilmePopulare(){
        List<Filme> lstFilme = new ArrayList<>();
        lstFilme.add(new Filme("Batmovie", R.drawable.batmovie,R.drawable.vicent));
        lstFilme.add(new Filme("How to Murder your Wife",R.drawable.murder,R.drawable.htmyw));
        lstFilme.add(new Filme("Halloween 3: The Season of Witch",R.drawable.halloween,R.drawable.halloween3));
        lstFilme.add(new Filme("Voyage on the Prehistoric Planet",R.drawable.planet,R.drawable.votpp));
        return lstFilme;
    }
    public static List<Filme> getFilmeleSaptamanii(){
        List<Filme> lstFilme = new ArrayList<>();
        lstFilme.add(new Filme("How to Murder your Wife",R.drawable.murder,R.drawable.htmyw));
        lstFilme.add(new Filme("Halloween 3: The Season of Witch",R.drawable.halloween,R.drawable.halloween3));
        lstFilme.add(new Filme("Voyage on the Prehistoric Planet",R.drawable.planet,R.drawable.votpp));
        return lstFilme;
    }
}
