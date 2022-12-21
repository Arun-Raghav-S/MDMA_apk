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

public class Wednesdayfrag extends AppCompatActivity {
    Button generate;
    String recipeDay="Wednesday";
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mRecipes=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wednesdayfrag);
        generate=findViewById(R.id.generateWed);
        Toolbar toolbar=findViewById(R.id.wedToolbar);
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
        mNames.add("Palak dal");
        mRecipes.add("https://www.youtube.com/watch?v=9kvkhxa3K_w");
        mNames.add("Lehsuni palak");
        mRecipes.add("https://www.youtube.com/watch?v=BZzHpN-alP4");
        mNames.add("Mutter masala");
        mRecipes.add("https://www.youtube.com/watch?v=VQyOcbw2kkc");
        mNames.add("Lal masoor dal");
        mRecipes.add("https://www.youtube.com/watch?v=qZzrSma8160");
        mNames.add("Mutter curry");
        mRecipes.add("https://www.youtube.com/watch?v=IWqsAsmLhs0");
        mNames.add("Aloo gajar");
        mRecipes.add("https://www.youtube.com/watch?v=YUKvt9N3x7M");
        mNames.add("Gajar Mutter");
        mRecipes.add("https://www.youtube.com/watch?v=9mls0lSGdIU");
        initRecyclerView();
    }
    private void initRecyclerView(){
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView=findViewById(R.id.wedRecycler);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewVertical adapter=new RecyclerViewVertical(this,mNames,mRecipes);
        recyclerView.setAdapter(adapter);
    }
}
