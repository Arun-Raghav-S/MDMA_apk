package com.example.mdma;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ortiz.touchview.TouchImageView;


public class SelectedMeal extends AppCompatActivity {
    String text;
    TextView selectedText;
    ImageView recipePic,Nut;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedmeal);
        selectedText=findViewById(R.id.SelectedText);
        selectedText.setText(getIntent().getStringExtra("myText"));
        text=selectedText.getText().toString();
        recipePic=findViewById(R.id.recipePic);
        Nut=findViewById(R.id.Nut);
        if(text.equals("Bhindi masala")){
            recipePic.setImageResource(R.drawable.bhindi_masala);
            Nut.setImageResource(R.drawable.bhindi_masala_nutrition);
        }
        else if(text.equals("Aloo mutter curry")){
            recipePic.setImageResource(R.drawable.aloo_matar);
            Nut.setImageResource(R.drawable.aloo_matar_curry_nutrition);
        }
        else if(text.equals("Aloo gobhi")){
            recipePic.setImageResource(R.drawable.aloo_gobhi);
            Nut.setImageResource(R.drawable.aloo_gobhi_nutrition);
        }

        else if(text.equals("Aloo methi")){
            recipePic.setImageResource(R.drawable.aloo_methi);
            Nut.setImageResource(R.drawable.aloo_methi_nutrition);
        }

        else if(text.equals("Aloo green beans")){
            recipePic.setImageResource(R.drawable.aloo_grean_beans);
            Nut.setImageResource(R.drawable.aloo_grean_beans_nutrition);
        }

        else if(text.equals("Aloo soyabean")){
            recipePic.setImageResource(R.drawable.aloo_soyabean);
            Nut.setImageResource(R.drawable.aloo_soyabean_nutrition);
        }
        else if(text.equals("Rajma masala")){
            recipePic.setImageResource(R.drawable.rajma_masala);
            Nut.setImageResource(R.drawable.rajma_masala_nutrition);
        }
        else if(text.equals("Loki sabji")){
            recipePic.setImageResource(R.drawable.loki_sabji);
            Nut.setImageResource(R.drawable.loki_sabji_nutrition);
        }
        else if(text.equals("Aloo patta-gobi")){
            recipePic.setImageResource(R.drawable.aloo_patta_gobhi);
            Nut.setImageResource(R.drawable.aloo_patta_gobhi_nutrition);
        }
        else if(text.equals("Chole curry")){
            recipePic.setImageResource(R.drawable.chole_curry);
            Nut.setImageResource(R.drawable.chole_curry_nutrition);
        }
        else if(text.equals("Chole masala")){
            recipePic.setImageResource(R.drawable.chole_masala);
            Nut.setImageResource(R.drawable.chole_masala_nutrition);
        }
        else if(text.equals("Mushroom masala")){
            recipePic.setImageResource(R.drawable.mushroom_masala);
            Nut.setImageResource(R.drawable.mushroom_masala_nutrition);
        }
        else if(text.equals("Aloo palak")){
            recipePic.setImageResource(R.drawable.aloo_palak);
            Nut.setImageResource(R.drawable.aloo_palak_nutrition);
        }
        else if(text.equals("Palak dal")){
            recipePic.setImageResource(R.drawable.palak_dal);
            Nut.setImageResource(R.drawable.palak_dal_nutrition);
        }
        else if(text.equals("Lehsuni palak")){
            recipePic.setImageResource(R.drawable.lehsuni_palak);
            Nut.setImageResource(R.drawable.lehsuni_palak_nutrition);
        }
        else if(text.equals("Dry channa Sabji")){
            recipePic.setImageResource(R.drawable.dry_channa_sabji);
            Nut.setImageResource(R.drawable.dry_channa_sabji_nutrition);
        }
        else if(text.equals("Aloo Channa Sabji")){
            recipePic.setImageResource(R.drawable.aloo_channa_sabji);
            Nut.setImageResource(R.drawable.aloo_channa_sabji_nutrition);
        }

        else if(text.equals("Kala channa curry")){
            recipePic.setImageResource(R.drawable.kala_chana_curry);
            Nut.setImageResource(R.drawable.kala_chana_curry_nutrition);
        }

        else if(text.equals("Soyabean")){
            recipePic.setImageResource(R.drawable.soyabean);
            Nut.setImageResource(R.drawable.soyabean_nutrition);
        }
        else if(text.equals("Lauki kofta")){
            recipePic.setImageResource(R.drawable.lauki_kofta);
            Nut.setImageResource(R.drawable.lauki_kofta_nutrition);
        }
        else if(text.equals("Mutter Mushroom")){
            recipePic.setImageResource(R.drawable.mattar_mushroom);
            Nut.setImageResource(R.drawable.mattar_mushroom_nutrition);
        }
        else if(text.equals("Shimla mirch aloo")){
            recipePic.setImageResource(R.drawable.shima_mirch_aloo);
            Nut.setImageResource(R.drawable.shima_mirch_aloo_nutrition);
        }
        else if(text.equals("Baingan Bharta")){
            recipePic.setImageResource(R.drawable.baigan_bharta);
            Nut.setImageResource(R.drawable.baigan_bharta_nutrition);
        }
        else if(text.equals("Baingan Masala")){
            recipePic.setImageResource(R.drawable.baigan_masala);
            Nut.setImageResource(R.drawable.baigan_masala_nutrition);
        }
        else if(text.equals("Channa Dal ki Khichdi")){
            recipePic.setImageResource(R.drawable.chana_dal_khichdi);
            Nut.setImageResource(R.drawable.chana_dal_khichdi_nutrition);
        }
        else if(text.equals("Aloo gajar")){
            recipePic.setImageResource(R.drawable.aloo_gajar);
            Nut.setImageResource(R.drawable.aloo_gajar_nutrition);
        }
        else if(text.equals("Mutter curry")){
            recipePic.setImageResource(R.drawable.matar_curry);
            Nut.setImageResource(R.drawable.matar_curry_nutrition);
        }else if(text.equals("Lal masoor dal")){
            recipePic.setImageResource(R.drawable.lal_masoor_dal);
            Nut.setImageResource(R.drawable.lal_masoor_dal_nutrition);
        }
        else if(text.equals("Mutter masala")){
            recipePic.setImageResource(R.drawable.matar_masala);
            Nut.setImageResource(R.drawable.matar_masala_nutrition);
        }

        else if(text.equals("Aloo Baingan")){
            recipePic.setImageResource(R.drawable.aloo_baigan);
            Nut.setImageResource(R.drawable.aloo_baigan_nutrition);
        }
        else if(text.equals("Lauki Arhar Dal")){
            recipePic.setImageResource(R.drawable.lauki_arhar_dal);
            Nut.setImageResource(R.drawable.lauki_arhar_dal_nutrition);
        }
        else if(text.equals("Toor Dal")){
            recipePic.setImageResource(R.drawable.toor_dal);
            Nut.setImageResource(R.drawable.toor_dal_nutrition);
        }
        else if(text.equals("Arhar ki Dal")){
            recipePic.setImageResource(R.drawable.arhar_dal);
            Nut.setImageResource(R.drawable.arhar_dal_nutrition);
        }
        else if(text.equals("Urad Dal")){
            recipePic.setImageResource(R.drawable.urad_dal);
            Nut.setImageResource(R.drawable.urad_dal_nutrition);
        }
        else if(text.equals("Black masoor Dal")){
            recipePic.setImageResource(R.drawable.black_masoor);
            Nut.setImageResource(R.drawable.black_masoor_nutrition);
        }
        else if(text.equals("Dry Mutter Aloo")){
            recipePic.setImageResource(R.drawable.dry_matar_aloo);
            Nut.setImageResource(R.drawable.dry_matar_aloo_nutrition);
        }
        else if(text.equals("Channa Dal fry")){
            recipePic.setImageResource(R.drawable.chana_dal_fry);
            Nut.setImageResource(R.drawable.chana_dal_fry_nutrition);
        }
        else if(text.equals("Dal Khichdi")){
            recipePic.setImageResource(R.drawable.dal_khichdi);
            Nut.setImageResource(R.drawable.dal_khichdi_nutrition);
        }

        else if(text.equals("Gawarfali ki Sabzi")){
            recipePic.setImageResource(R.drawable.gawarfali_sabji);
            Nut.setImageResource(R.drawable.gawarfali_sabji_nutrition);
        }

        else if(text.equals("Aloo patta gobhi mutter")){
            recipePic.setImageResource(R.drawable.aloo_patta_gobhi_mattar);
            Nut.setImageResource(R.drawable.aloo_patta_gobhi_mattar_nutrition);
        }

        else if(text.equals("Moong Dal Curry")){
            recipePic.setImageResource(R.drawable.moong_dal_curry);
            Nut.setImageResource(R.drawable.moong_dal_curry_nutrition);
        }

        else if(text.equals("Gajar Mutter")){
            recipePic.setImageResource(R.drawable.gajar_matar);
            Nut.setImageResource(R.drawable.gajar_matar_nutrition);
        }






    }
}
