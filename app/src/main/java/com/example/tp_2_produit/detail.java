package com.example.tp_2_produit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Map;


public class detail extends AppCompatActivity {
    ServicePlats servicePlats = new ServicePlats();
    Plat monPlat = new Plat();
    String prixVal = "";


    TextView nom , prix , ingredients , preparation , lien ;
    ImageView img ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if(savedInstanceState != null){
            prixVal = savedInstanceState.getString("prix"," ");
        }

        Intent intent = getIntent();
        String nomPlat = intent.getStringExtra("nomPlat");

        monPlat = servicePlats.getPlats().get(nomPlat);

        nom = findViewById(R.id.nom);
        prix = findViewById(R.id.prixVal);
        ingredients = findViewById(R.id.ingrVal);
        preparation = findViewById(R.id.prepaVal);
        img = findViewById(R.id.img);
        lien = findViewById(R.id.lienVal);

        nom.setText(monPlat.getNom());
        prix.setText(prixVal);
        ingredients.setText(monPlat.getIngredients().toString());
        preparation.setText(monPlat.getPreparation());
        img.setImageResource(monPlat.getImg());
        lien.setText(Html.fromHtml("<a href=\"http://www.siteduzero.com\">Mon lien</a>"));
        lien.setText(Html.fromHtml("<a href=\""+monPlat.getLien()+"\">Lien</a>"));
        lien.setLinksClickable(true);



     }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.avec:
                if (checked)
                    prixVal = String.valueOf(monPlat.getPrixAvecLivraison());
                    prix.setText(prixVal);
                    break;
            case R.id.sans:
                if (checked)
                    prixVal = String.valueOf(monPlat.getPrixSansLivraison());
                    prix.setText(prixVal);
                break;
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("prix",prixVal);
    }


}
