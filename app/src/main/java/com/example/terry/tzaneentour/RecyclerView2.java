package com.example.terry.tzaneentour;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TERRY on 2017/08/16.
 */

public class RecyclerView2 extends  RecyclerView.Adapter<RecyclerView2.ViewHolder> {

    Context context;
    List<Tourguide> activity;

    public RecyclerView2(Context context,List<Tourguide>activity) {
        this.context=context;
        this.activity=activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tour_view,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Tourguide tourguide=activity.get(position);

        holder.tvtopic.setText(tourguide.getTopic());
        holder.tvdescription.setText(tourguide.getDescription());
        holder.image.setImageResource(tourguide.getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Main3Activity.class);
               intent.putExtra("word",tourguide);
               context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return activity.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvtopic,tvdescription;
        ImageView image;
        CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            tvdescription=(TextView)itemView.findViewById(R.id.tvDescription);
            tvtopic=(TextView)itemView.findViewById(R.id.tvtopic);
            image=(ImageView) itemView.findViewById(R.id.imageView);
            cardView=(CardView)itemView.findViewById(R.id.cardview);
        }
    }
}
