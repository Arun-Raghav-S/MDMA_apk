package com.example.mdma;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewVertical extends RecyclerView.Adapter<RecyclerViewVertical.ViewHolder>{
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mRecipes=new ArrayList<>();
    private Context mContext;

    public RecyclerViewVertical( Context mContext,ArrayList<String> mNames, ArrayList<String> mRecipes) {
        this.mNames = mNames;
        this.mRecipes = mRecipes;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.recipeName.setText(mNames.get(position));
        String link=mRecipes.get(position);
        holder.select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.recipeName.getText()=="Bhindi masala"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo gobhi"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo mutter curry"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo green beans"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo soyabean"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                } else if(holder.recipeName.getText()=="Rajma masala"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                } else if(holder.recipeName.getText()=="Loki sabji"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo patta-gobi"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Chole curry"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                } else if(holder.recipeName.getText()=="Chole masala"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Mushroom masala"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo palak"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                } else if(holder.recipeName.getText()=="Palak dal"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Lehsuni palak"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                } else if(holder.recipeName.getText()=="Mutter masala"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Lal masoor dal"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                } else if(holder.recipeName.getText()=="Mutter curry"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo gajar"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Dry channa Sabji"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Arhar ki Dal"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Urad Dal"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Black masoor Dal"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Dry Mutter Aloo"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Channa Dal ki Khichdi"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Channa Dal fry"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Dal Khichdi"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Gawarfali ki Sabzi"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo patta gobhi mutter"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo patta gobhi mutter"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Moong Dal Curry"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Gajar Mutter"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo Channa Sabji"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Kala channa curry"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Soyabean"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Lauki kofta"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Mutter Mushroom"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Shimla mirch aloo"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Baingan Bharta"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Baingan Masala"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo Baingan"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Lauki Arhar Dal"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Toor Dal"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }
                else if(holder.recipeName.getText()=="Aloo methi"){
                    Intent myIntent = new Intent(view.getContext(),SelectedMeal.class);
                    myIntent.putExtra("myText",holder.recipeName.getText());
                    view.getContext().startActivity(myIntent);
                }

            }
        });
        holder.recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.recipeName.getText()=="Bhindi masala"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=ckr_xJnaUD8"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo gobhi"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=Iv-qfNzO6qQ"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo mutter curry"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=oVfWo91JoSM"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo green beans"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=hCXgfs9evpw"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo soyabean"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=330RjVF6wDg"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                } else if(holder.recipeName.getText()=="Rajma masala"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=DsZr3U4Clf0"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                } else if(holder.recipeName.getText()=="Loki sabji"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=Zvmb6vzhJ0E"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo patta-gobi"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=GLYOybma1oo"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Chole curry"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=uKUvtyjw8R0"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                } else if(holder.recipeName.getText()=="Chole masala"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=D65rl_c82Rw"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Mushroom masala"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=r9IEKuASfgU"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo methi"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=YGmXIQ2F7k4"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo palak"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=tlZbRKRSBnM"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                } else if(holder.recipeName.getText()=="Palak dal"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=9kvkhxa3K_w"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Lehsuni palak"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=BZzHpN-alP4"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                } else if(holder.recipeName.getText()=="Mutter masala"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=VQyOcbw2kkc"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Lal masoor dal"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=IWqsAsmLhs0"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                } else if(holder.recipeName.getText()=="Mutter curry"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=IWqsAsmLhs0"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo gajar"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=YUKvt9N3x7M"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Dry channa Sabji"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=9nxTwE5Ruv0"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Arhar ki Dal"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=VaP3bogwcGU"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Urad Dal"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=ydfoTgYMLK0"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Black masoor Dal"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=sa3Rq4g39Cw"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Dry Mutter Aloo"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=HalTfKwuhUQ"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Channa Dal ki Khichdi"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=ceqzDC73n0s"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Channa Dal fry"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=C-Px-WKlTLc"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Dal Khichdi"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=SYWtizV5oCI"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Gawarfali ki Sabzi"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=-EEl1p_9srs"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo patta gobhi mutter"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=DYvF6lgUZaM"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo patta gobhi mutter"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=DYvF6lgUZaM"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Moong Dal Curry"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=8vMYERpXP8c"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Gajar Mutter"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=9mls0lSGdIU"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo Channa Sabji"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=GfIvyMnZt-o"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Kala channa curry"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=1hC3EQ9UFrI"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Soyabean"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=uEirYWOaWKQ"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Lauki kofta"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=oBR3nQUnhJc"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Mattar Mushroom"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=D2hrDgK_5b8"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Shimla mirch aloo"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=CeK7vUAAEKY"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Baingan Bharta"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=2YKafOGBSNw"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Baingan Massala"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=nkb1fJ8fVvo"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Aloo Baingan"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=DDhSNjm_2oQ"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Lauki Arhar Dal"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=O9ga8jt7AIQ"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
                else if(holder.recipeName.getText()=="Toor Dal"){
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=Dx0FPw1Tibo"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return mNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView recipeName;
        Button recipe,select;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeName=itemView.findViewById(R.id.recipeName);
            recipe=itemView.findViewById(R.id.recipe);
            select=itemView.findViewById(R.id.select);

        }
    }
}
