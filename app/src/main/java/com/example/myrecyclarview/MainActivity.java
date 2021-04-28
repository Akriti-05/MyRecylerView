package com.example.myrecyclarview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.myrecyclarview.Adapters.RecipeAdapter;
import com.example.myrecyclarview.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recyclerView);

        ArrayList<RecipeModel> list= new ArrayList<>();

        list.add(new RecipeModel(R.drawable.burger, "Burger"));
        list.add(new RecipeModel(R.drawable.food1, "Burger"));
        list.add(new RecipeModel(R.drawable.food2, "Burger"));
        list.add(new RecipeModel(R.drawable.food3, "Burger"));
        list.add(new RecipeModel(R.drawable.food4, "Burger"));
        list.add(new RecipeModel(R.drawable.love, "Burger"));
        list.add(new RecipeModel(R.drawable.pizza, "Burger"));
        list.add(new RecipeModel(R.drawable.fries, "Burger"));

        RecipeAdapter adapter= new RecipeAdapter(list, this);
        recyclerView.setAdapter(adapter);
        StaggeredGridLayoutManager staggered= new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggered);





//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        recyclerView.setLayoutManager(gridLayoutManager);



//         LinearLayoutManager layoutManager= new LinearLayoutManager(this);
//         recyclerView.setLayoutManager(layoutManager);
//         to scroll horizontally
//         LinearLayoutManager layoutManager= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//         recyclerView.setLayoutManager(layoutManager);

    }
}