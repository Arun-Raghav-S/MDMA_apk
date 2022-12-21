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

public class Saturdayfrag extends AppCompatActivity {
    Button generate;
    String recipeDay="Saturday";
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mRecipes=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saturdayfrag);
        generate=findViewById(R.id.generateSat);
        Toolbar toolbar=findViewById(R.id.satToolbar);
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
        mNames.add("Aloo Baingan");
        mRecipes.add("https://www.youtube.com/watch?v=DDhSNjm_2oQ");
        mNames.add("Lauki Arhar Dal");
        mRecipes.add("https://www.youtube.com/watch?v=O9ga8jt7AIQ");
        mNames.add("Toor Dal");
        mRecipes.add("https://www.youtube.com/watch?v=Dx0FPw1Tibo");
        mNames.add("Arhar ki Dal");
        mRecipes.add("https://www.youtube.com/watch?v=VaP3bogwcGU");
        mNames.add("Urad Dal");
        mRecipes.add("https://www.youtube.com/watch?v=ydfoTgYMLK0");
        mNames.add("Black masoor Dal");
        mRecipes.add("https://www.youtube.com/watch?v=sa3Rq4g39Cw");
        mNames.add("Dry Mutter Aloo");
        mRecipes.add("https://www.youtube.com/watch?v=HalTfKwuhUQ");
        initRecyclerView();

    }
    private void initRecyclerView(){
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView=findViewById(R.id.satRecycler);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewVertical adapter=new RecyclerViewVertical(this,mNames,mRecipes);
        recyclerView.setAdapter(adapter);
    }
}
