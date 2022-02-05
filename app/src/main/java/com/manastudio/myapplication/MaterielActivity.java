package com.manastudio.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.manastudio.myapplication.materi1.Materi1Activity;
import com.manastudio.myapplication.materi2.Materi2Activity;
import com.manastudio.myapplication.materi3.Materi3Activity;

import java.util.Objects;

public class MaterielActivity extends AppCompatActivity implements View.OnClickListener {
CardView btnMateri1, btnMateri2, btnMateri3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materiel);

        initView();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.materiel);
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
        btnMateri1 = findViewById(R.id.btnMateriel1);
        btnMateri1.setOnClickListener(this);
        btnMateri2 = findViewById(R.id.btnMateriel2);
        btnMateri2.setOnClickListener(this);
        btnMateri3 = findViewById(R.id.btnMateriel3);
        btnMateri3.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMateriel1:
                startActivity(new Intent(MaterielActivity.this, Materi1Activity.class));
                break;
            case R.id.btnMateriel2:
                startActivity(new Intent(MaterielActivity.this, Materi2Activity.class));
                break;
            case R.id.btnMateriel3:
                startActivity(new Intent(MaterielActivity.this, Materi3Activity.class));
                break;
        }
    }
}