package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abrirTelaPosSplash();
            }
        },3000);
    }

    public void abrirTelaPosSplash(){
        Intent i = new Intent(SplashActivity.this, Tela_pos_splash.class);
        startActivity(i);
        finish();

    }
}
