package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list1;
    ArrayList<Anime> animes = new ArrayList<Anime>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listiq = (ListView)findViewById(R.id.list1);

        Anime anime1= new Anime("Naruto", R.drawable.n, 2002);
        Anime anime2= new Anime("attack", R.drawable.ae, 2013);
        Anime anime3= new Anime("hyuka", R.drawable.hy, 2012);
        Anime anime4= new Anime("conan", R.drawable.dete, 1996);
        Anime anime5= new Anime("kimtsu", R.drawable.kim, 2019);
        Anime anime6= new Anime("dororo", R.drawable.doro, 2019);
        Anime anime7= new Anime("kiseijuu", R.drawable.mege, 2014);
        Anime anime8= new Anime("dragon ball", R.drawable.dragon, 1986);
        Anime anime9= new Anime("one piece", R.drawable.one, 1999);

        animes.add(anime1);
        animes.add(anime2);
        animes.add(anime3);
        animes.add(anime4);
        animes.add(anime5);
        animes.add(anime6);
        animes.add(anime7);
        animes.add(anime8);
        animes.add(anime9);

  Animeadapter animeadapter= new Animeadapter(this, 0, animes);
 ListView Listview= findViewById(R.id.list1);
 listiq.setAdapter(animeadapter);


    }



}