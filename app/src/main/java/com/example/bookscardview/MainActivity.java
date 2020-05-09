package com.example.bookscardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Book>lstBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Vegitarian","Categorie Book","Description book",R.drawable.thevigitarian,"https://www.nestleprofessional.us/sites/g/files/gfb13" +
                "1/f/media/nutripro_magazine_healthy_cooking_methods.pdf"));
        lstBook.add(new Book("The Wild Robot","Categorie Book","Description book",R.drawable.thewildrobot,"https://www.birdlife.org/sites/default/files/attachments/BL_ReportENG_V11_spreads.pdf"));
        lstBook.add(new Book("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples,"https://www.fws.gov/uploadedFiles/Bird_List.pdf"));
        lstBook.add(new Book("The Martian","Categorie Book","Description book",R.drawable.themartian,"https://www.fws.gov/uploadedFiles/Bird_List.pdf"));
        lstBook.add(new Book("He Died with...","Categorie Book","Description book",R.drawable.hediedwith,"https://birdcount.in/wp-content/uploads/2015/02/Intro-to-Birds-and-Birdwatching-GBBC-BirdCountIndia-v0.2.pdf"));
        lstBook.add(new Book("The Vegitarian","Categorie Book","Description book",R.drawable.thevigitarian,"https://birdcount.in/wp-content/uploads/2015/02/Intro-to-Birds-and-Birdwatching-GBBC-BirdCountIndia-v0.2.pdf"));
        lstBook.add(new Book("The Wild Robot","Categorie Book","Description book",R.drawable.thewildrobot,"https://www.fws.gov/uploadedFiles/Bird_List.pdf"));
        lstBook.add(new Book("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples,"https://www.fws.gov/uploadedFiles/Bird_List.pdf"));
        lstBook.add(new Book("The Martian","Categorie Book","Description book",R.drawable.themartian,"https://florida.theorangegrove.org/og/file/3a8c652c-11d0-e967-95fb-b5bbae2586d6/1/math_handbook.pdf"));
        lstBook.add(new Book("He Died with...","Categorie Book","Description book",R.drawable.hediedwith,"https://florida.theorangegrove.org/og/file/3a8c652c-11d0-e967-95fb-b5bbae2586d6/1/math_handbook.pdf"));
        lstBook.add(new Book("The Vegitarian","Categorie Book","Description book",R.drawable.thevigitarian,"https://florida.theorangegrove.org/og/file/3a8c652c-11d0-e967-95fb-b5bbae2586d6/1/math_handbook.pdf"));
        lstBook.add(new Book("The Wild Robot","Categorie Book","Description book",R.drawable.thewildrobot,"https://www.fws.gov/uploadedFiles/Bird_List.pdf"));
        lstBook.add(new Book("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples,"http://www.fulviofrisone.com/attachments/article/453/Springer%20-%20Handbook%20Of%20Mathematics,%20Fifth%20Edition%20(2007).pdf"));
        lstBook.add(new Book("The Martian","Categorie Book","Description book",R.drawable.themartian,"https://birdcount.in/wp-content/uploads/2015/02/Intro-to-Birds-and-Birdwatching-GBBC-BirdCountIndia-v0.2.pdf"));
        lstBook.add(new Book("He Died with...","Categorie Book","Description book",R.drawable.hediedwith,"https://www.fws.gov/uploadedFiles/Bird_List.pdf"));

        RecyclerView myRecyclerView= (RecyclerView) findViewById(R.id.recyclerView_id);
        RecyclerViewAdapter myAdapter= new RecyclerViewAdapter(this,lstBook);
        myRecyclerView.setLayoutManager(new GridLayoutManager(this,3));
        myRecyclerView.setAdapter(myAdapter);

    }
}
