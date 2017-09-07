package com.example.terry.tzaneentour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class Main2Activity extends AppCompatActivity {
    RecyclerView2 adapter;
    RecyclerView recyclerView;
    Tourguide tourguide;
    Tourguide tourguide2;
    Tourguide tourguide3;
    Tourguide tourguide4;
    Tourguide tourguide5;
    Tourguide tourguide6;
    Tourguide tourguide7;
    Tourguide tourguide8;
    Tourguide tourguide9;
    Tourguide tourguide1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = (RecyclerView) findViewById(R.id.recylerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Tourguide> activityArrayList = new ArrayList<>();

        tourguide=new Tourguide();
        tourguide2=new Tourguide();
        tourguide3=new Tourguide();
        tourguide4=new Tourguide();
        tourguide5=new Tourguide();
        tourguide6=new Tourguide();
        tourguide7=new Tourguide();
        tourguide8=new Tourguide();
        tourguide9=new Tourguide();
        tourguide1=new Tourguide();

        tourguide.setTopic("KNOW_TZANEEN_BETTER!!!");
        tourguide.setDescription("The first theory is that the name Tzaneen is derived from a Sepedi word 'Tsaneng', which means gathering place or 'Tsana' (basket of hills). This theory claim that Makgoba, the leader of a small Tlou tribe, gave the name 'Tsaneng' to the place where the town of Tzaneen is situated today. Since then, this Sepedi word has been used by both the Tsonga and the Pedi people to refer to the name of this place and was popularly used by Afrikaner colonisers as well.\n" +
                "A second theory suggest that the name Tzaneen is derived from the Venda name 'Dzanani'. This theory suggests that Venda people once occupied the area and that they named it 'Dzanani'. Vhavenda lived in this area during the 11th centuries. Originally Venda people still leave in and around the area, for example BaLobedu, and they still practice a lot of Venda customs and speak a mixed language that is predominantly Venda language.");
        tourguide.setImage(R.drawable.a_avator);


        tourguide2.setTopic("ACCOMODATION");
        tourguide2.setDescription("A stylish BnB with luxury and comfort to suit both leisure and business people.\n" +
                " Rooms are decorated to suit your needs. We offer our guests a selection of en suite rooms with air conditioners, tea/coffee making facilities, Dstv, Fridge and pool to relax.\n\n");
        tourguide2.setImage(R.drawable.bedroom);


        tourguide3.setTopic("ACCOMODATION_LIST");
        tourguide3.setDescription("Lapologa Bed and Breakfast" +
                "scover serenity, luxury and privacy in the heart of the Limpopo Valley.\n" +
                " Set against the magnificent Magoebaskloof mountains, the Lodge is ideally situated n easily reached for a relaxing holiday or overnight stay 1 hour from Kruger Park.\" \n \n " +

                " Mashutti Country Lodge \n " +
                "Amidst the mountains overlooking Tzaneen, experience breath-taking views lush gardens.\n" +
                "This owner run lodge will meet your every expectation with personalized service  attention to detail.\n" +
                " Our mountain paradise awaits you\"\n\n" +

                " Magoebaskloof Ruskamp - The Mountain Lodge " +
                " Magoebaskloof Ruskamp provides 30 comfortable attractive furnished rondavels, some of them fully equipped; complete with kitchen, lounge, TV, microwave and patio with braai, for the family wishing to spend quality time away.\n\n" +

                " La Barune Guest House " +
                " La Barune is a 4-Star French styled guest house with exceptional qualities.\n" +
                " We pride ourselves in having created an ambience of sheer hospitality.\n" +
                "  We offer 8 Luxurious French styled en-suite rooms.\n\n" +

                " Kings Walden Lodge " +
                " From Kings Walden you can drive or hike in mountains and forests, visit waterfalls, go boating or fishing on dams, play golf or tennis - or just gaze at the ever-changing vistas of mountains and lowveld.\"\n\n" +
                " Coach House Hotel n Spa " +
                "Coach House Hotel n Spa is the only Hotel in the Limpopo to have a five star grading and a Silver Classification - the highest accolade of hotels in this country, shared only by less than a dozen others throughout South Africa.\"\n ");
        tourguide3.setImage(R.drawable.e_avator);


        tourguide4.setTopic("THINGS_TO_DO");
        tourguide4.setDescription(       "Debengeni Waterfalls\n" +
                "                         Modjadji Cycad Forest\n" +
                "                         Agatha Crocodile Ranch\n" +
                "                         Haenertsburg Village\n" +
                "                         Biggest Baobab Tree in the World\n" +
                "                         Sunland\n" +
                "                         Magoebaskloof Canopy Tours\n" +
                "                         Kaross Workers Studio\"");
        tourguide4.setImage(R.drawable.things);


        tourguide5.setTopic("TZANEEN's ATTRACTIONS");
        tourguide5.setImage(R.drawable.cycad);
        tourguide5.setDescription("Cycad");
        tourguide1.setImage(R.drawable.crocodile_feeding4);
        tourguide1.setDescription("The crocodile feeding");
        tourguide6.setImage(R.drawable.kaross);
        tourguide6.setDescription("The Kaross");
        tourguide7.setImage(R.drawable.haenertsburg_village);
        tourguide7.setDescription("Haenertsburg's view");
        tourguide8.setImage(R.drawable.sunland_baobab);
        tourguide8.setDescription("Tzaneen baobab");
        tourguide9.setImage(R.drawable.debengeni_waterfalls);
        tourguide9.setDescription("Debengeni Waterfalls");



        activityArrayList.add(tourguide);
        activityArrayList.add(tourguide2);
        activityArrayList.add(tourguide3);
        activityArrayList.add(tourguide4);
        activityArrayList.add(tourguide5);
        activityArrayList.add(tourguide6);
        activityArrayList.add(tourguide7);
        activityArrayList.add(tourguide8);
        activityArrayList.add(tourguide9);
        activityArrayList.add(tourguide1);


        adapter=new RecyclerView2(this,activityArrayList);
        recyclerView.setAdapter(adapter);



    }
}
