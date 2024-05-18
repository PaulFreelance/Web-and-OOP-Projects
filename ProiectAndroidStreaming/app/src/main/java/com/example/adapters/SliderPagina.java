package com.example.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.modele.Slide;
import com.example.myapplication12.R;

import java.util.List;

public class SliderPagina extends PagerAdapter {

    private Context ncontext;
    private List<Slide> nList;

    public SliderPagina(Context ncontext, List<Slide> nList) {
        this.ncontext = ncontext;
        this.nList = nList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) ncontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View slideLayout = inflater.inflate(R.layout.slide_obiecte,null);
        ImageView slideImage = slideLayout.findViewById(R.id.slide_imagine);
        TextView slideText = slideLayout.findViewById(R.id.slide_titlu);
        slideImage.setImageResource(nList.get(position).getImag());
        slideText.setText(nList.get(position).getTitlu());
        container.addView(slideLayout);
        return slideLayout;
    }

    @Override
    public int getCount() {
        return nList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
