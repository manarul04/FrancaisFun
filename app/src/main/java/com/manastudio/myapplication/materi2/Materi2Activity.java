package com.manastudio.myapplication.materi2;

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

import java.util.Objects;

public class Materi2Activity extends AppCompatActivity {
    TextView tvVocab1,tvVocab2,tvVocab3,tvVocab4,tvVocab5,tvVocab6,tvVocab7,tvVocab8,tvVocab9,tvVocab10,tvVocab11,tvVocab12;
    TextView tvArti1,tvArti2,tvArti3,tvArti4,tvArti5,tvArti6,tvArti7,tvArti8,tvArti9,tvArti10,tvArti11,tvArti12;
    Button btnQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi2);

        btnQuiz = findViewById(R.id.btnQuiz);
        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Materi2Activity.this, QuizMateri2Activity.class));
            }
        });

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.materiel_2);

        tvVocab1= findViewById(R.id.tvMateri2_vocab1);
        Spanned sp1 = Html.fromHtml("Elle est <strong>belle</strong>");
        tvVocab1.setText(sp1);
        tvArti1= findViewById(R.id.tvMateri2_arti1);
        Spanned si1 = Html.fromHtml("<i>Dia <strong>Cantik</strong></i>");
        tvArti1.setText(si1);

        tvVocab2= findViewById(R.id.tvMateri2_vocab2);
        Spanned sp2 = Html.fromHtml("Elle est <b>moche</b>");
        tvVocab2.setText(sp2);
        tvArti2= findViewById(R.id.tvMateri2_arti2);
        Spanned si2 = Html.fromHtml("<i>Dia <b>Jelek</b></i>");
        tvArti2.setText(si2);

        tvVocab3= findViewById(R.id.tvMateri2_vocab3);
        Spanned sp3 = Html.fromHtml("Elle a le nez <b>pointu</b>");
        tvVocab3.setText(sp3);
        tvArti3= findViewById(R.id.tvMateri2_arti3);
        Spanned si3 = Html.fromHtml("<i>Dia memiliki hidung yang <b>mancung</b></i>");
        tvArti3.setText(si3);

        tvVocab4= findViewById(R.id.tvMateri2_vocab4);
        Spanned sp4 = Html.fromHtml("Elle a le nez <b>carlin</b>");
        tvVocab4.setText(sp4);
        tvArti4= findViewById(R.id.tvMateri2_arti4);
        Spanned si4 = Html.fromHtml("<i>Dia memiliki hidung <b>pesek</b></i>");
        tvArti4.setText(si4);

        tvVocab5= findViewById(R.id.tvMateri2_vocab5);
        Spanned sp5 = Html.fromHtml("Elle est <b>grande</b> et <b>mince</b>");
        tvVocab5.setText(sp5);
        tvArti5= findViewById(R.id.tvMateri2_arti5);
        Spanned si5 = Html.fromHtml("<i>Dia <b>tinggi</b> dan <b>kurus</b></i>");
        tvArti5.setText(si5);

        tvVocab6= findViewById(R.id.tvMateri2_vocab6);
        Spanned sp6 = Html.fromHtml("Elle est <b>petite</b> et <b>grosse</b> ");
        tvVocab6.setText(sp6);
        tvArti6= findViewById(R.id.tvMateri2_arti6);
        Spanned si6 = Html.fromHtml("<i>Dia <b>pendek</b> dan <b>gendut</b></i>");
        tvArti6.setText(si6);

        tvVocab7= findViewById(R.id.tvMateri2_vocab7);
        Spanned sp7 = Html.fromHtml("Elle a les cheveux <b>blonds</b>");
        tvVocab7.setText(sp7);
        tvArti7= findViewById(R.id.tvMateri2_arti7);
        Spanned si7 = Html.fromHtml("<i>Dia memiliki rambut <b>pirang</b></i>");
        tvArti7.setText(si7);

        tvVocab8= findViewById(R.id.tvMateri2_vocab8);
        Spanned sp8 = Html.fromHtml("Elle a les cheveux <b>noirs</b>");
        tvVocab8.setText(sp8);
        tvArti8= findViewById(R.id.tvMateri2_arti8);
        Spanned si8 = Html.fromHtml("<i>Dia memiliki rambut <b>hitam</b></i>");
        tvArti8.setText(si8);

        tvVocab9= findViewById(R.id.tvMateri2_vocab9);
        Spanned sp9 = Html.fromHtml("Elle a <b>les yeux bleus</b> et <b>ronds</b>");
        tvVocab9.setText(sp9);
        tvArti9= findViewById(R.id.tvMateri2_arti9);
        Spanned si9 = Html.fromHtml("<i>Dia memiliki <b>mata biru</b> dan berbentuk <b>bulat</b></i>");
        tvArti9.setText(si9);

        tvVocab10= findViewById(R.id.tvMateri2_vocab10);
        Spanned sp10 = Html.fromHtml("Il a les yeux <b>bruns</b> et <b>brid??s</b>");
        tvVocab10.setText(sp10);
        tvArti10= findViewById(R.id.tvMateri2_arti10);
        Spanned si10 = Html.fromHtml("<i>Dia memiliki mata <b>coklat</b> dan <b>sipit</b></i>");
        tvArti10.setText(si10);

        tvVocab11= findViewById(R.id.tvMateri2_vocab11);
        Spanned sp11 = Html.fromHtml("Laura est <b>gentille</b> et <b>g??n??reuse</b>");
        tvVocab11.setText(sp11);
        tvArti11= findViewById(R.id.tvMateri2_arti11);
        Spanned si11 = Html.fromHtml("<i>Laura <b>baik</b> dan <b>dermawan</b></i>");
        tvArti11.setText(si11);

        tvVocab12= findViewById(R.id.tvMateri2_vocab12);
        Spanned sp12 = Html.fromHtml("Il est <b>m??chant</b> et <b>avare</b>");
        tvVocab12.setText(sp12);
        tvArti12= findViewById(R.id.tvMateri2_arti12);
        Spanned si12 = Html.fromHtml("<i>Dia <b>jahat</b> dan <b>pelit</b></i>");
        tvArti12.setText(si12);

        TextView tvVocab13= findViewById(R.id.tvMateri2_vocab13);
        Spanned sp13 = Html.fromHtml("L'appartement est <b>sympa</b> et <b>cher</b>");
        tvVocab13.setText(sp13);
        TextView tvArti13= findViewById(R.id.tvMateri2_arti13);
        Spanned si13 = Html.fromHtml("<i>Apartemennya <b>bagus</b> dan <b>mahal</b></i>");
        tvArti13.setText(si13);

        TextView tvVocab14= findViewById(R.id.tvMateri2_vocab14);
        Spanned sp14 = Html.fromHtml("L'appartement est <b>laid</b> et <b>pas cher</b>");
        tvVocab14.setText(sp14);
        TextView tvArti14= findViewById(R.id.tvMateri2_arti14);
        Spanned si14 = Html.fromHtml("<i>Apartemennya <b>jelek</b> dan <b>murah</b></i>");
        tvArti14.setText(si14);

        TextView tvVocab15= findViewById(R.id.tvMateri2_vocab15);
        Spanned sp15 = Html.fromHtml("L'appartement est <b>confortable<b>");
        tvVocab15.setText(sp15);
        TextView tvArti15= findViewById(R.id.tvMateri2_arti15);
        Spanned si15 = Html.fromHtml("<i>Apartemennya <b>nyaman</b></i>");
        tvArti15.setText(si15);

        TextView tvVocab16= findViewById(R.id.tvMateri2_vocab16);
        Spanned sp16 = Html.fromHtml("L'appartement est <b>d??sagr??able<b>");
        tvVocab16.setText(sp16);
        TextView tvArti16= findViewById(R.id.tvMateri2_arti16);
        Spanned si16 = Html.fromHtml("<i>Apartemennya <b>tidak nyaman</b></i>");
        tvArti16.setText(si16);
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