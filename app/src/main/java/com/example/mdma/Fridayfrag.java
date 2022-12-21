package com.example.mdma;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fridayfrag extends AppCompatActivity {
    Button generate;
    String recipeDay="Friday";
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mRecipes=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fridayfrag);
        Toolbar toolbar=findViewById(R.id.friToolbar);
        generate=findViewById(R.id.generateFri);
        setSupportActionBar(toolbar);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),GeneratedMeal.class);
                intent.putExtra("Generate",recipeDay);
                view.getContext().startActivity(intent);
            }
        });
        if(getSupportActionBar()!=null)
        {getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");}
        getNames();
    }
    private void getNames(){
        mNames.add("Kala channa curry");
        mRecipes.add("https://www.youtube.com/watch?v=1hC3EQ9UFrI");
        mNames.add("Soyabean");
        mRecipes.add("https://www.youtube.com/watch?v=uEirYWOaWKQ");
        mNames.add("Lauki kofta");
        mRecipes.add("https://www.youtube.com/watch?v=oBR3nQUnhJc");
        mNames.add("Mutter Mushroom");
        mRecipes.add("https://www.youtube.com/watch?v=D2hrDgK_5b8");
        mNames.add("Shimla mirch aloo");
        mRecipes.add("https://www.youtube.com/watch?v=CeK7vUAAEKY");
        mNames.add("Baingan Bharta");
        mRecipes.add("https://www.youtube.com/watch?v=2YKafOGBSNw");
        mNames.add("Baingan Masala");
        mRecipes.add("https://www.youtube.com/watch?v=nkb1fJ8fVvo");
        initRecyclerView();

    }
    private void initRecyclerView(){
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView=findViewById(R.id.friRecycler);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewVertical adapter=new RecyclerViewVertical(this,mNames,mRecipes);
        recyclerView.setAdapter(adapter);
    }
}
