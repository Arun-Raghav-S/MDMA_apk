package com.example.mdma;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class GeneratedMeal extends AppCompatActivity {
    ImageView mainDish,recipePic;
    TextView mainText,sideText;
    String random;
    private ArrayList<String> mNamesMon=new ArrayList<>();
    private ArrayList<String> MainDish=new ArrayList<>();
    private ArrayList<String> mNamesTue=new ArrayList<>();
    private ArrayList<String> mNamesWed=new ArrayList<>();
    private ArrayList<String> mNamesThurs=new ArrayList<>();
    private ArrayList<String> mNamesFri=new ArrayList<>();
    private ArrayList<String> mNamesSat=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generatedmeal);
        mainDish=findViewById(R.id.mainDish);
        recipePic=findViewById(R.id.sideDish);
        mainText=findViewById(R.id.mainText);
        sideText=findViewById(R.id.sideText);
        MainDish.add("Chapathi");
        MainDish.add("Bread");
        MainDish.add("Rice");
        mNamesMon.add("Bhindi masala");
        mNamesMon.add("Aloo gobhi");
        mNamesMon.add("Aloo mutter curry");
        mNamesMon.add("Aloo methi");
        mNamesMon.add("Aloo green beans");
        mNamesMon.add("Aloo soyabean");
        mNamesMon.add("Moong Dal Curry");
        mNamesTue.add("Rajma masala");
        mNamesTue.add("Loki sabji");
        mNamesTue.add("Aloo patta-gobi");
        mNamesTue.add("Chole curry");
        mNamesTue.add("Chole masala");
        mNamesTue.add("Mushroom masala");
        mNamesTue.add("Aloo palak");
        mNamesWed.add("Palak dal");
        mNamesWed.add("Lehsuni palak");
        mNamesWed.add("Mutter masala");
        mNamesWed.add("Lal masoor dal");
        mNamesWed.add("Mutter curry");
        mNamesWed.add("Aloo gajar");
        mNamesWed.add("Gajar Mutter");
        mNamesThurs.add("Dry channa Sabji");
        mNamesThurs.add("Aloo Channa Sabji");
        mNamesThurs.add("Channa Dal ki Khichdi");
        mNamesThurs.add("Channa Dal fry");
        mNamesThurs.add("Dal Khichdi");
        mNamesThurs.add("Gawarfali ki Sabzi");
        mNamesThurs.add("Aloo patta gobhi mutter");
        mNamesFri.add("Kala channa curry");
        mNamesFri.add("Soyabean");
        mNamesFri.add("Lauki kofta");
        mNamesFri.add("Mutter Mushroom");
        mNamesFri.add("Shimla mirch aloo");
        mNamesFri.add("Baingan Bharta");
        mNamesFri.add("Baingan Masala");
        mNamesSat.add("Aloo Baingan");
        mNamesSat.add("Lauki Arhar Dal");
        mNamesSat.add("Toor Dal");
        mNamesSat.add("Arhar ki Dal");
        mNamesSat.add("Urad Dal");
        mNamesSat.add("Black masoor Dal");
        mNamesSat.add("Dry Mutter Aloo");
        String text,text1;
        int index1 = (int)(Math.random() * mNamesMon.size());
        int index2 = (int)(Math.random() * mNamesTue.size());
        int index3 = (int)(Math.random() * mNamesWed.size());
        int index4 = (int)(Math.random() * mNamesThurs.size());
        int index5 = (int)(Math.random() * mNamesFri.size());
        int index6 = (int)(Math.random() * mNamesSat.size());
        int index7 = (int)(Math.random() * MainDish.size());
        if(getIntent().getStringExtra("Generate").equals("Monday")){
            mainText.setText(MainDish.get(index7));
            sideText.setText(mNamesMon.get(index1));
            text=mNamesMon.get(index1);
            text1=MainDish.get(index7);
            if(text1.equals("Chapathi")){
                mainDish.setImageResource(R.drawable.chhapati);
            }
            else if(text1.equals("Rice")){
                mainDish.setImageResource(R.drawable.rice);
            }
            else if(text1.equals("Bread")){
                mainDish.setImageResource(R.drawable.bread);
            }
            ////////////
            if(text.equals("Bhindi masala")){
                recipePic.setImageResource(R.drawable.bhindi_masala);
            }
            else if(text.equals("Moong Dal Curry")){
                recipePic.setImageResource(R.drawable.moong_dal_curry);
            }
            else if(text.equals("Aloo gobhi")){
                recipePic.setImageResource(R.drawable.aloo_gobhi);

            }
            else if(text.equals("Aloo methi")){
                recipePic.setImageResource(R.drawable.aloo_methi);
            }
            else if(text.equals("Aloo green beans")){
                recipePic.setImageResource(R.drawable.aloo_grean_beans);
            }
            else if(text.equals("Aloo soyabean")){
                recipePic.setImageResource(R.drawable.aloo_soyabean);
            }
            else if(text.equals("Aloo mutter curry")){
                recipePic.setImageResource(R.drawable.aloo_matar);
            }
            ///////
        }
        else if(getIntent().getStringExtra("Generate").equals("Tuesday")){
            mainText.setText(MainDish.get(index7));
            sideText.setText(mNamesTue.get(index2));
            text=mNamesTue.get(index2);
            text1=MainDish.get(index7);
            if(text1.equals("Chapathi")){
                mainDish.setImageResource(R.drawable.chhapati);
            }
            else if(text1.equals("Rice")){
                mainDish.setImageResource(R.drawable.rice);
            }
            else if(text1.equals("Bread")){
                mainDish.setImageResource(R.drawable.bread);
            }

            if(text.equals("Rajma masala")){
                recipePic.setImageResource(R.drawable.rajma_masala);
            }
            else if(text.equals("Loki sabji")){
                recipePic.setImageResource(R.drawable.loki_sabji);
            }
            else if(text.equals("Aloo patta-gobi")){
                recipePic.setImageResource(R.drawable.aloo_patta_gobhi);

            }
            else if(text.equals("Chole curry")){
                recipePic.setImageResource(R.drawable.chole_curry);
            }
            else if(text.equals("Chole masala")){
                recipePic.setImageResource(R.drawable.chole_masala);
            }
            else if(text.equals("Mushroom masala")){
                recipePic.setImageResource(R.drawable.mushroom_masala);
            }
            else if(text.equals("Aloo palak")){
                recipePic.setImageResource(R.drawable.aloo_palak);
            }
            ///////

        }
        else if(getIntent().getStringExtra("Generate").equals("Wednesday")){
            mainText.setText(MainDish.get(index7));
            sideText.setText(mNamesWed.get(index3));
            text=mNamesWed.get(index3);
            text1=MainDish.get(index7);
            if(text1.equals("Chapathi")){
                mainDish.setImageResource(R.drawable.chhapati);
            }
            else if(text1.equals("Rice")){
                mainDish.setImageResource(R.drawable.rice);
            }
            else if(text1.equals("Bread")){
                mainDish.setImageResource(R.drawable.bread);
            }

            if(text.equals("Palak dal")){
                recipePic.setImageResource(R.drawable.palak_dal);

            }
            else if(text.equals("Lehsuni palak")){
                recipePic.setImageResource(R.drawable.lehsuni_palak);

            }
            else if(text.equals("Mutter masala")){
                recipePic.setImageResource(R.drawable.matar_masala);

            }
            else if(text.equals("Lal masoor dal")){
                recipePic.setImageResource(R.drawable.lal_masoor_dal);

            }
            else if(text.equals("Aloo gajar")){
                recipePic.setImageResource(R.drawable.aloo_gajar);

            }
            else if(text.equals("Mutter curry")){
                recipePic.setImageResource(R.drawable.matar_curry);

            }
            else if(text.equals("Gajar Mutter")){
                recipePic.setImageResource(R.drawable.gajar_matar);
            }

        }else if(getIntent().getStringExtra("Generate").equals("Thursday")){
            mainText.setText(MainDish.get(index7));
            sideText.setText(mNamesThurs.get(index4));
            text=mNamesThurs.get(index4);
            text1=MainDish.get(index7);
            if(text1.equals("Chapathi")){
                mainDish.setImageResource(R.drawable.chhapati);
            }
            else if(text1.equals("Rice")){
                mainDish.setImageResource(R.drawable.rice);
            }
            else if(text1.equals("Bread")){
                mainDish.setImageResource(R.drawable.bread);
            }

            if(text.equals("Dry channa Sabji")){
                recipePic.setImageResource(R.drawable.dry_channa_sabji);

            }
            else if(text.equals("Aloo Channa Sabji")){
                recipePic.setImageResource(R.drawable.aloo_channa_sabji);
            }else if(text.equals("Channa Dal ki Khichdi")){
                recipePic.setImageResource(R.drawable.chana_dal_khichdi);

            }else if(text.equals("Channa Dal fry")){
                recipePic.setImageResource(R.drawable.chana_dal_fry);

            }else if(text.equals("Dal Khichdi")){
                recipePic.setImageResource(R.drawable.dal_khichdi);

            }else if(text.equals("Gawarfali ki Sabzi")){
                recipePic.setImageResource(R.drawable.gawarfali_sabji);
            }
            else if(text.equals("Aloo patta gobhi mutter")){
                recipePic.setImageResource(R.drawable.aloo_patta_gobhi_mattar);

            }
        }else if(getIntent().getStringExtra("Generate").equals("Friday")){
            mainText.setText(MainDish.get(index7));
            sideText.setText(mNamesFri.get(index5));
            text=mNamesFri.get(index5);
            text1=MainDish.get(index7);
            if(text1.equals("Chapathi")){
                mainDish.setImageResource(R.drawable.chhapati);
            }
            else if(text1.equals("Rice")){
                mainDish.setImageResource(R.drawable.rice);
            }
            else if(text1.equals("Bread")){
                mainDish.setImageResource(R.drawable.bread);
            }

            if(text.equals("Kala channa curry")){
                recipePic.setImageResource(R.drawable.kala_chana_curry);
            }

            else if(text.equals("Soyabean")){
                recipePic.setImageResource(R.drawable.soyabean);

            }
            else if(text.equals("Lauki kofta")){
                recipePic.setImageResource(R.drawable.lauki_kofta);

            }
            else if(text.equals("Mutter Mushroom")){
                recipePic.setImageResource(R.drawable.mattar_mushroom);

            }
            else if(text.equals("Shimla mirch aloo")){
                recipePic.setImageResource(R.drawable.shima_mirch_aloo);

            }
            else if(text.equals("Baingan Bharta")){
                recipePic.setImageResource(R.drawable.baigan_bharta);

            }
            else if(text.equals("Baingan Masala")){
                recipePic.setImageResource(R.drawable.baigan_masala);

            }
        }else if(getIntent().getStringExtra("Generate").equals("Saturday")){
            mainText.setText(MainDish.get(index7));
            sideText.setText(mNamesSat.get(index6));
            text=mNamesSat.get(index5);
            text1=MainDish.get(index7);
            if(text1.equals("Chapathi")){
                mainDish.setImageResource(R.drawable.chhapati);
            }
            else if(text1.equals("Rice")){
                mainDish.setImageResource(R.drawable.rice);
            }
            else if(text1.equals("Bread")){
                mainDish.setImageResource(R.drawable.bread);
            }

            if(text.equals("Aloo Baingan")){
                recipePic.setImageResource(R.drawable.aloo_baigan);

            }
            else if(text.equals("Lauki Arhar Dal")){
                recipePic.setImageResource(R.drawable.lauki_arhar_dal);

            }
            else if(text.equals("Toor Dal")){
                recipePic.setImageResource(R.drawable.toor_dal);

            }
            else if(text.equals("Arhar ki Dal")){
                recipePic.setImageResource(R.drawable.arhar_dal);

            }
            else if(text.equals("Urad Dal")){
                recipePic.setImageResource(R.drawable.urad_dal);

            }
            else if(text.equals("Black masoor Dal")){
                recipePic.setImageResource(R.drawable.black_masoor);

            }
            else if(text.equals("Dry Mutter Aloo")){
                recipePic.setImageResource(R.drawable.dry_matar_aloo);

            }
        }











    }
}
