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

public class Thursdayfrag extends AppCompatActivity {
    Button generate;
    String recipeDay="Thursday";
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mRecipes=new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thursdayfrag);
        generate=findViewById(R.id.generateThurs);
        Toolbar toolbar=findViewById(R.id.thurToolbar);
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

        mNames.add("Dry channa Sabji");
        mRecipes.add("https://www.youtube.com/watch?v=9nxTwE5Ruv0");
        mNames.add("Aloo Channa Sabji");
        mRecipes.add("https://www.youtube.com/watch?v=GfIvyMnZt-o");
        mNames.add("Channa Dal ki Khichdi");
        mRecipes.add("https://www.youtube.com/watch?v=ceqzDC73n0s");
        mNames.add("Channa Dal fry");
        mRecipes.add("https://www.youtube.com/watch?v=C-Px-WKlTLc");
        mNames.add("Dal Khichdi");
        mRecipes.add("https://www.youtube.com/watch?v=SYWtizV5oCI");
        mNames.add("Gawarfali ki Sabzi");
        mRecipes.add("https://www.youtube.com/watch?v=-EEl1p_9srs");
        mNames.add("Aloo patta gobhi mutter");
        mRecipes.add("https://www.youtube.com/watch?v=DYvF6lgUZaM");
        initRecyclerView();

    }
    private void initRecyclerView(){
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView=findViewById(R.id.thursRecycler);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewVertical adapter=new RecyclerViewVertical(this,mNames,mRecipes);
        recyclerView.setAdapter(adapter);
    }
}
