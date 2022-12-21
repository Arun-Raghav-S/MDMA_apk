package com.example.mdma;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleviewAdapter extends RecyclerView.Adapter<RecycleviewAdapter.ViewHolder>{
    private  static final String TAG="RecyclerViewAdapter";
    private ArrayList<String> mdays=new ArrayList<>();
    private Context mContext;

    public RecycleviewAdapter(Context mContext,ArrayList<String> mdays) {
        this.mdays = mdays;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG,"onCreateViewHolder: called.");
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.hori_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG,"onBindViewHolder: called.");
        holder.day.setText(mdays.get(position));
        holder.day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.day.getText()=="Monday"){
                    Intent intent=new Intent(view.getContext(),Mondayfrag.class);
                    mContext.startActivity(intent);
                }
                else if(holder.day.getText()=="Tuesday"){
                    Intent intent=new Intent(view.getContext(),Tuesdayfrag.class);
                    mContext.startActivity(intent);
                }
                else if(holder.day.getText()=="Wednesday"){
                    Intent intent=new Intent(view.getContext(),Wednesdayfrag.class);
                    mContext.startActivity(intent);
                }else if(holder.day.getText()=="Thursday"){
                    Intent intent=new Intent(view.getContext(),Thursdayfrag.class);
                    mContext.startActivity(intent);
                }else if(holder.day.getText()=="Friday"){
                    Intent intent=new Intent(view.getContext(),Fridayfrag.class);
                    mContext.startActivity(intent);
                }
                else if(holder.day.getText()=="Saturday"){
                    Intent intent=new Intent(view.getContext(),Saturdayfrag.class);
                    mContext.startActivity(intent);
                }


            }
        });
    }

    @Override
    public int getItemCount() {
        return mdays.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView day;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            day=itemView.findViewById(R.id.day);
        }
    }
}

