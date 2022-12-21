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

public class Tuesdayfrag extends AppCompatActivity {
    Button generate;
    String recipeDay="Tuesday";
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mRecipes=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuesdayfrag);
        generate=findViewById(R.id.generateTue);
        Toolbar toolbar=findViewById(R.id.tueToolbar);
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
        mNames.add("Rajma masala");
        mRecipes.add("https://www.youtube.com/watch?v=DsZr3U4Clf0");
        mNames.add("Loki sabji");
        mRecipes.add("https://www.youtube.com/watch?v=Zvmb6vzhJ0E");
        mNames.add("Aloo patta-gobi");
        mRecipes.add("https://www.youtube.com/watch?v=GLYOybma1oo");
        mNames.add("Chole curry");
        mRecipes.add("https://www.youtube.com/watch?v=uKUvtyjw8R0");
        mNames.add("Chole masala");
        mRecipes.add("https://www.youtube.com/watch?v=D65rl_c82Rw");
        mNames.add("Mushroom masala");
        mRecipes.add("https://www.youtube.com/watch?v=r9IEKuASfgU");
        mNames.add("Aloo palak");
        mRecipes.add("https://www.youtube.com/watch?v=tlZbRKRSBnM");
        initRecyclerView();

    }
    private void initRecyclerView(){
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView=findViewById(R.id.tueRecyler);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewVertical adapter=new RecyclerViewVertical(this,mNames,mRecipes);
        recyclerView.setAdapter(adapter);
    }
}
