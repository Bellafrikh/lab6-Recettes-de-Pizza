package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;

public class SplashActivity extends AppCompatActivity {

    private static final int DUREE_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Ajout d'une petite animation sur le logo
        ImageView logo = findViewById(R.id.img_logo);
        Animation animationFade = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        logo.startAnimation(animationFade);

        // Redirection vers la liste des pizzas après un délai
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intention = new Intent(SplashActivity.this, ListPizzaActivity.class);
                startActivity(intention);
                finish();
            }
        }, DUREE_SPLASH);
    }
}
