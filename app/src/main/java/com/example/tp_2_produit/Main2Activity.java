package com.example.tp_2_produit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Map;

public class Main2Activity extends AppCompatActivity {

    ImageView hlou , mtewem , rechta ;
    HorizontalScrollView scrl1 , scrl2 , scrl3 , scrl4 ;
    Map<String,Plat> MesPlats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        hlou = findViewById(R.id.p1);
        mtewem = findViewById(R.id.p2);
        rechta = findViewById(R.id.p3);


        scrl1 = findViewById(R.id.scrl1);
        scrl2 = findViewById(R.id.scrl2);
        scrl3 = findViewById(R.id.scrl3);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.produit);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.produit_);
        hlou.startAnimation(animation);
        mtewem.startAnimation(animation2);
        rechta.startAnimation(animation);

        /*View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                int val = v.getId();
                switch (val){

                    case R.id.p1:
                        hlou.setVisibility(View.GONE);
                        scrl1.setVisibility(View.VISIBLE);
                        break;
                    case R.id.p2:
                        mtewem.setVisibility(View.GONE);
                        scrl2.setVisibility(View.VISIBLE);
                        break;
                    case R.id.p3:
                        rechta.setVisibility(View.GONE);
                        scrl3.setVisibility(View.VISIBLE);
                        break;
                    default:
                }

                return false;
            }
        };*/

        View.OnLongClickListener longClickListener2 = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String nomPlat  = "";
                int val = v.getId();
                switch (val){

                    case R.id.p1:
                        nomPlat = "hlou";
                        break;
                    case R.id.p2:
                        nomPlat = "mtewem";
                        break;
                    case R.id.p3:
                        nomPlat = "rechta";
                        break;
                    default:
                }

                openDetailActivity(nomPlat);

                return false;
            }
        };



        View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    int val = v.getId();
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast;
                    CharSequence text ;
                    switch (val){

                        case R.id.p1:
                            text = "Hlou";
                            break;
                        case R.id.p2:
                            text = "Mtouwem";
                            break;
                        case R.id.p3:
                            text = "Rechta";
                            break;
                        default:
                            text = " ";

                    }

                    toast = Toast.makeText(context, text, duration);
                    toast.show();

            }
        };

        hlou.setOnClickListener(cl);
        mtewem.setOnClickListener(cl);
        rechta.setOnClickListener(cl);

        /*
        hlou.setOnLongClickListener(longClickListener);
        mtewem.setOnLongClickListener(longClickListener);
        rechta.setOnLongClickListener(longClickListener);
        */

        hlou.setOnLongClickListener(longClickListener2);
        mtewem.setOnLongClickListener(longClickListener2);
        rechta.setOnLongClickListener(longClickListener2);

    }
    public void openDetailActivity(String nomPlat){
        Intent intent = new Intent(this, detail.class);
        intent.putExtra("nomPlat",nomPlat);
        startActivity(intent);
    }
}
