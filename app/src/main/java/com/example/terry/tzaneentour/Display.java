package com.example.terry.tzaneentour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Display extends AppCompatActivity {
   private cusDatabase sd = new cusDatabase(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        ArrayList<String> custs = sd.getAllCustomers();
        ListView listView = (ListView) findViewById(R.id.list_item1);
        final customer customers = new customer();

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,custs);
        listView.setAdapter(arrayAdapter);

    }
}
