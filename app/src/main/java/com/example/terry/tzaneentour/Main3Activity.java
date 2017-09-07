package com.example.terry.tzaneentour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.name;
import static com.example.terry.tzaneentour.R.id.textView;

public class Main3Activity extends AppCompatActivity {
Tourguide tourguide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView textView2=(TextView)findViewById(textView);
        TextView textView1=(TextView)findViewById(R.id.textView2);
//        ImageView imageView=(ImageView)findViewById(R.id.imageView3);

        Intent intent = getIntent();
       tourguide =(Tourguide) intent.getSerializableExtra ("word");
        textView1.setText(tourguide.getDescription());



    }
}
