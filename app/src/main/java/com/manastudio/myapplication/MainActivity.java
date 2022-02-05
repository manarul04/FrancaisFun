package com.manastudio.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnIntro, btnObjektif, btnMateri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntro = findViewById(R.id.btnIntro);
        btnIntro.setOnClickListener(this);
        btnObjektif = findViewById(R.id.btnObjektif);
        btnObjektif.setOnClickListener(this);
        btnMateri = findViewById(R.id.ViewIntro);
        btnMateri.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnIntro:
                startActivity(new Intent(MainActivity.this, IntroductionActivity.class));
                break;
            case R.id.btnObjektif:
                startActivity(new Intent(MainActivity.this, ObjektifActivity.class));
                break;
            case R.id.ViewIntro:
                startActivity(new Intent(MainActivity.this, MaterielActivity.class));
                break;
        }
    }
}