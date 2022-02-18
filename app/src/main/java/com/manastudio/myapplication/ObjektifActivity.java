package com.manastudio.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;

public class ObjektifActivity extends AppCompatActivity {
TextView tvObjektif1,tvObjektif2,tvObjektif3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objektif);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.objektif);
        //Text
        Spanned sp = Html.fromHtml( getString(R.string.competence1));
        tvObjektif1 = findViewById(R.id.tvObejek1);
        tvObjektif1.setText(sp);
        Spanned sp2 = Html.fromHtml( getString(R.string.competence2));
        tvObjektif2 = findViewById(R.id.tvObejek2);
        tvObjektif2.setText(sp2);
        Spanned sp3 = Html.fromHtml( getString(R.string.competence3));
        tvObjektif3 = findViewById(R.id.tvObejek3);
        tvObjektif3.setText(sp3);
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
}