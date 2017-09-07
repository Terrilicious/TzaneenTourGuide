package com.example.terry.tzaneentour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Book now and enjoy!!!",R.drawable.a_avator));
        words.add(new Word("Lapologa Bed and Breakfast","From: R600 per person",R.drawable.lapologa));
        words.add(new Word("The fairview collection","From:R800 per person sharing",R.drawable.fairview));
        words.add(new Word("Mashutti country lodge","From:R560 per person sharing",R.drawable.country_house));
        words.add(new Word("Tamboti Lodge"," From:R390 per person sharing",R.drawable.tambo));
        words.add(new Word("Magoebaskloof Ruskamp-Mountain Lodge"," From:R585 per unit,max:2",R.drawable.magoebaskloof));
        words.add(new Word("Sherwoods country house","From:R375 Per person",R.drawable.sherwood));
        words.add(new Word("La Barune Guest House","From:R495 per person sharing",R.drawable.guest_house));
        words.add(new Word("Kings Walden Lodge","From:R875 per person sharing",R.drawable.kings));
        words.add(new Word("Granny Dots's Country Spot"," From:R400 per person sharing ",R.drawable.granny));
        words.add(new Word("Steffins Sun Lodge","From:R875 per person sharing",R.drawable.steffins));
        words.add(new Word("Coach House $ Spa","From:R1299 per person sharing",R.drawable.kings));


        WordAdapter adapter=new WordAdapter(this,words,R.color.tan_background);
        ListView listView=(ListView)findViewById(R.id.List);
        listView.setAdapter(adapter);
    }
}
