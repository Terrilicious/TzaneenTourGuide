package com.example.terry.tzaneentour;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TERRY on 2017/08/17.
 */

public class WordAdapter extends ArrayAdapter<Word > {

    private int mResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int ResourceId){

        super(context,0,words);
        mResourceId=ResourceId;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListItemView=convertView;
        if(ListItemView==null){
            ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item,parent,false);
        }
        Word currentWord=getItem(position);
        TextView miworkTextView=(TextView)ListItemView.findViewById(R.id.description_textView);
        miworkTextView.setText(currentWord.getMtopic());

        TextView miwork1TextView=(TextView)ListItemView.findViewById(R.id.default_text_view);
        miwork1TextView.setText(currentWord.getMdescription());




        ImageView imageView=(ImageView)ListItemView.findViewById(R.id.image);
        if (currentWord.HasImage()) {
            imageView.setImageResource((currentWord.getmImage()));
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        View textContainer=ListItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mResourceId);
        textContainer.setBackgroundColor(color);
        return ListItemView;
    }


}
