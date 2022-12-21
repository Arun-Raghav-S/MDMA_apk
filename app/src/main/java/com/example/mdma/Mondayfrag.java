package com.example.mdma;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Mondayfrag extends AppCompatActivity {
    String recipeDay="Monday";
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mRecipes=new ArrayList<>();
    Button generate;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mondayfrag);
        Toolbar toolbar=findViewById(R.id.monToolbar);
        generate=findViewById(R.id.generateMon);
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
        mNames.add("Bhindi masala");
        mRecipes.add("https://www.youtube.com/watch?v=ckr_xJnaUD8");
        mNames.add("Aloo gobhi");
        mRecipes.add("https://www.youtube.com/watch?v=Iv-qfNzO6qQ");
        mNames.add("Aloo mutter curry");
        mRecipes.add("https://www.youtube.com/watch?v=oVfWo91JoSM");
        mNames.add("Aloo methi");
        mRecipes.add("https://www.youtube.com/watch?v=YGmXIQ2F7k4");
        mNames.add("Aloo green beans");
        mRecipes.add("https://www.youtube.com/watch?v=hCXgfs9evpw");
        mNames.add("Aloo soyabean");
        mRecipes.add("https://www.youtube.com/watch?v=330RjVF6wDg");
        mNames.add("Moong Dal Curry");
        mRecipes.add("https://www.youtube.com/watch?v=8vMYERpXP8c");
        initRecyclerView();

    }
    private void initRecyclerView(){
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView=findViewById(R.id.monRecycler);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewVertical adapter=new RecyclerViewVertical(this,mNames,mRecipes);
        recyclerView.setAdapter(adapter);
    }


}

