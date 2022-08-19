package com.example.anime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Animeadapter extends ArrayAdapter {
    List<Anime> animeList;

    public Animeadapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        animeList= objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view= LayoutInflater.from(getContext()).inflate(R.layout.poster, parent, false);

        Anime cutanime= animeList.get(position);

        TextView animeNametxt= view.findViewById(R.id.txtname);
        TextView animetime= view.findViewById(R.id.txttime);
        ImageView animeimge= view.findViewById(R.id.nimage);
        animeNametxt.setText(cutanime.getAnimename());
        animetime.setText( String.valueOf(cutanime.getAnimetime()));
        animeimge.setImageResource(cutanime.getAnimeimge());
             return view;

    }
}

