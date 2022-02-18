package com.manastudio.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class IntroductionActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton btnBack;
TextView tvIntro,tvMateri;
CardView txLintro,txLobjek,txLmateriel;
CardView btnLintro, btnLobjek, btnLmateriel;
ImageView arrowLintro,arrowLobjek,arrowLmateriel;

    @Override
    protected void onCreate(Bundle savedInsatanceState) {
        super.onCreate(savedInsatanceState);
        setContentView(R.layout.activity_introduction);
        initView();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.introduction);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initView() {

        //Text
        Spanned sp = Html.fromHtml( getString(R.string.l_introduction));
        tvIntro = findViewById(R.id.tvLintro);
        tvIntro.setText(sp);
        Spanned sp2 = Html.fromHtml( getString(R.string.l_materiel));
        tvMateri = findViewById(R.id.tvLmateriel);
        tvMateri.setText(sp2);
        //cardview
        txLintro = findViewById(R.id.textLintro);
        txLintro.setOnClickListener(this);
        txLobjek = findViewById(R.id.textLobjek);
        txLobjek.setOnClickListener(this);
        txLmateriel = findViewById(R.id.textLmateriel);
        txLmateriel.setOnClickListener(this);
        //Button
        btnLintro = findViewById(R.id.btnLintro);
        btnLintro.setOnClickListener(this);
        btnLobjek = findViewById(R.id.btnLobjek);
        btnLobjek.setOnClickListener(this);
        btnLmateriel = findViewById(R.id.btnLmateri);
        btnLmateriel.setOnClickListener(this);
        //Arrow
        arrowLintro = findViewById(R.id.arrowLintro);
        arrowLobjek = findViewById(R.id.arrowLobjek);
        arrowLmateriel = findViewById(R.id.arrowLmateriel);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLintro:
                if(txLintro.getVisibility()==View.GONE){
                    txLintro.setVisibility(View.VISIBLE);
                    arrowLintro.setImageResource(R.drawable.ic_up);
                }else{
                    txLintro.setVisibility(View.GONE);
                    arrowLintro.setImageResource(R.drawable.ic_down);
                }
                break;
            case R.id.btnLobjek:
                if(txLobjek.getVisibility()==View.GONE){
                    txLobjek.setVisibility(View.VISIBLE);
                    arrowLobjek.setImageResource(R.drawable.ic_up);
                }else{
                    txLobjek.setVisibility(View.GONE);
                    arrowLobjek.setImageResource(R.drawable.ic_down);
                }
                break;
            case R.id.btnLmateri:
                if(txLmateriel.getVisibility()==View.GONE){
                    txLmateriel.setVisibility(View.VISIBLE);
                    arrowLmateriel.setImageResource(R.drawable.ic_up);
                }else{
                    txLmateriel.setVisibility(View.GONE);
                    arrowLmateriel.setImageResource(R.drawable.ic_down);
                }
                break;
        }
    }
}