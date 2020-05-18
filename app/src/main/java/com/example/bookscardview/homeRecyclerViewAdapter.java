package com.example.bookscardview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class homeRecyclerViewAdapter extends RecyclerView.Adapter<homeRecyclerViewAdapter.MyViewHolder> {
    private Context mContext;
    private List<Menu> mData;


    public homeRecyclerViewAdapter(Context context, List<Menu> mData){
        this.mContext= context;
        this.mData= mData;
    }

    @Override
    public homeRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater= LayoutInflater.from(mContext);
        view= inflater.inflate(R.layout.home_cardview_item,parent,false);
        return new homeRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull homeRecyclerViewAdapter.MyViewHolder holder, int position) {

        holder.tv_book_title.setText(mData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,MainActivity.class);

//                //passing data to book activity
//                intent.putExtra("Title",mData.get(position).getTitle());
//                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
//                intent.putExtra("BookPdfLink",mData.get(position).getBookPdfLink());
                //start activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();


    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_book_title = (TextView) itemView.findViewById(R.id.homebooktxtView);
            img_book_thumbnail = (ImageView) itemView.findViewById(R.id.homebook_img_id);
            cardView = (CardView) itemView.findViewById(R.id.homecardView_id);


        }

    }}
