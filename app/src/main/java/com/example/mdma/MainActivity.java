package com.example.mdma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="Main Activity";
    private ArrayList<String> mdays=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setTitle("");}
        getDays();
    }

    private void getDays() {
        mdays.add("Monday");
        mdays.add("Tuesday");
        mdays.add("Wednesday");
        mdays.add("Thursday");
        mdays.add("Friday");
        mdays.add("Saturday");
        initRecyclerView();
    }
    private void initRecyclerView(){
        Log.d(TAG,"initRecyclerView :init recyclerview");
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(layoutManager);
        RecycleviewAdapter adapter=new RecycleviewAdapter(this,mdays);
        recyclerView.setAdapter(adapter);
    }

}