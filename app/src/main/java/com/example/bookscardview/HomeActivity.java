package com.example.bookscardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {


    List<Menu> lstBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lstBook = new ArrayList<>();
        lstBook.add(new Menu("Chief Mate",R.drawable.thecadet));
        lstBook.add(new Menu("The Vegitarian",R.drawable.thecadet));
        lstBook.add(new Menu("The Vegitarian",R.drawable.mgf));
        lstBook.add(new Menu("The Vegitarian",R.drawable.theasm));
        lstBook.add(new Menu("The Vegitarian",R.drawable.mgf));
        lstBook.add(new Menu("The Vegitarian",R.drawable.thecadet));





        RecyclerView myRecyclerView= findViewById(R.id.homeRecyclerView_id);
       // RecyclerViewAdapter myAdapter= new RecyclerViewAdapter(this,lstBook);
        homeRecyclerViewAdapter myAdapter= new homeRecyclerViewAdapter(this,lstBook);
        myRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        myRecyclerView.setAdapter(myAdapter);
    }
}
