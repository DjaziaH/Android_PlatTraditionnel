package com.example.tp_2_produit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img ;

    MediaPlayer monSong ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monSong = MediaPlayer.create(this, R.raw.music);
        monSong.start();


        img = findViewById(R.id.img);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.main);
        img.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this , Main2Activity.class);
                startActivity(i);
            }
        }, 4800);

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        monSong.release();
        finish();
    }

}

