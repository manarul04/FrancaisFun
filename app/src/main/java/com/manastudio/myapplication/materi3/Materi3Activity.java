package com.manastudio.myapplication.materi3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.manastudio.myapplication.R;
import com.manastudio.myapplication.materi1.Materi1Activity;
import com.manastudio.myapplication.materi1.QuizMateri1Activity;
import com.manastudio.myapplication.materi3.QuizMateri3Activity;

import java.util.Objects;

public class Materi3Activity extends AppCompatActivity {
    TextView tvVocab1,tvVocab2,tvVocab3,tvVocab4,tvVocab5,tvVocab6,tvVocab7,tvVocab8,tvVocab9,tvVocab10,tvVocab11,tvVocab12;
    TextView tvArti1,tvArti2,tvArti3,tvArti4,tvArti5,tvArti6,tvArti7,tvArti8,tvArti9,tvArti10,tvArti11,tvArti12;
    Button btnQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi3);

        btnQuiz = findViewById(R.id.btnQuiz);
        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Materi3Activity.this, QuizMateri3Activity.class));
            }
        });

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.materiel_3);

        tvVocab1= findViewById(R.id.tvMateri3_vocab1);
        Spanned sp1 = Html.fromHtml("Regardez <b>sur</b> la table");
        tvVocab1.setText(sp1);
        tvArti1= findViewById(R.id.tvMateri3_arti1);
        Spanned si1 = Html.fromHtml("<i>Lihatlah <b>di atas</b> meja</i>");
        tvArti1.setText(si1);

        tvVocab2= findViewById(R.id.tvMateri3_vocab2);
        Spanned sp2 = Html.fromHtml("Regardez <b>sous</b> la table");
        tvVocab2.setText(sp2);
        tvArti2= findViewById(R.id.tvMateri3_arti2);
        Spanned si2 = Html.fromHtml("<i>Lihatlah <b>di bawah</b> meja</i>");
        tvArti2.setText(si2);

        tvVocab3= findViewById(R.id.tvMateri3_vocab3);
        Spanned sp3 = Html.fromHtml("La table est <b>devant</b> la chaise");
        tvVocab3.setText(sp3);
        tvArti3= findViewById(R.id.tvMateri3_arti3);
        Spanned si3 = Html.fromHtml("<i>Meja ada <b>di depan</b> kursi</i>");
        tvArti3.setText(si3);

        tvVocab4= findViewById(R.id.tvMateri3_vocab4);
        Spanned sp4 = Html.fromHtml("La table est <b>derrière</b> la chaise");
        tvVocab4.setText(sp4);
        tvArti4= findViewById(R.id.tvMateri3_arti4);
        Spanned si4 = Html.fromHtml("<i>Meja ada <b>di belakang</b> kursi</i>");
        tvArti4.setText(si4);

        tvVocab5= findViewById(R.id.tvMateri3_vocab5);
        Spanned sp5 = Html.fromHtml("L'ordinateur est <b>à gauche</b> du placard");
        tvVocab5.setText(sp5);
        tvArti5= findViewById(R.id.tvMateri3_arti5);
        Spanned si5 = Html.fromHtml("<i>Komputer ada <b>di sebelah kiri</b> almari</i>");
        tvArti5.setText(si5);

        tvVocab6= findViewById(R.id.tvMateri3_vocab6);
        Spanned sp6 = Html.fromHtml("L'ordinateur est <b>à droit</b> du placard");
        tvVocab6.setText(sp6);
        tvArti6= findViewById(R.id.tvMateri3_arti6);
        Spanned si6 = Html.fromHtml("<i>Komputer ada <b>di sebelah kanan</b> almari</i>");
        tvArti6.setText(si6);

        tvVocab7= findViewById(R.id.tvMateri3_vocab7);
        Spanned sp7 = Html.fromHtml("La porte est <b>près de</b> la fenêtre");
        tvVocab7.setText(sp7);
        tvArti7= findViewById(R.id.tvMateri3_arti7);
        Spanned si7 = Html.fromHtml("<i>Pintunya <b>dekat</b> dengan jendela</i>");
        tvArti7.setText(si7);

        tvVocab8= findViewById(R.id.tvMateri3_vocab8);
        Spanned sp8 = Html.fromHtml("La porte est <b>loin de</b> la fenêtre");
        tvVocab8.setText(sp8);
        tvArti8= findViewById(R.id.tvMateri3_arti8);
        Spanned si8 = Html.fromHtml("<i>Pintunya <b>jauh</b> dari jendela</i>");
        tvArti8.setText(si8);


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