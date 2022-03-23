package com.manastudio.myapplication.materi2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.manastudio.myapplication.R;
import com.manastudio.myapplication.ResultQuizActivity;
import com.manastudio.myapplication.materi2.SoalQuizHelper2;

import java.util.Objects;

public class QuizMateri2Activity extends AppCompatActivity implements View.OnClickListener {
    private SoalQuizHelper2 quizHelper = new SoalQuizHelper2();
    private TextView tvQuestion, tvScore;
    private Button btn_a, btn_b, btn_c, DialogButton;
    private String mAnswer;
    private ImageView ivQuestion;
    private Dialog dialog,dialog_welcome;
    MediaPlayer benar,salah,pembuka;
    private int questionNumber = 0;
    private int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_materi2);
        initView();

        updateQuestion();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Soal "+questionNumber+" dari 10");

    }

    private void initView() {
        btn_a = findViewById(R.id.btn_answer_a);
        btn_b = findViewById(R.id.btn_answer_b);
        btn_c = findViewById(R.id.btn_answer_c);
        benar = MediaPlayer.create(this, R.raw.yeeeea);
        salah = MediaPlayer.create(this, R.raw.salah);
        tvQuestion = findViewById(R.id.tv_question);
        tvScore = findViewById(R.id.tv_score);
        tvScore.setText("0");
        ivQuestion = findViewById(R.id.iv_question);
        btn_a.setOnClickListener(this);
        btn_b.setOnClickListener(this);
        btn_c.setOnClickListener(this);
    }

    @SuppressLint("ResourceAsColor")
    private void updateQuestion() {
        if (questionNumber < quizHelper.getQuestion()) {
            tvQuestion.setText(quizHelper.getQuestion(questionNumber));
            btn_a.setText(quizHelper.getChoice1(questionNumber));
            btn_b.setText(quizHelper.getChoice2(questionNumber));
            btn_c.setText(quizHelper.getChoice3(questionNumber));

            mAnswer = quizHelper.getCorrectAnswer(questionNumber);
            questionNumber++;
            getSupportActionBar().setTitle("Soal "+questionNumber+" dari 10");
            switch (questionNumber) {

                case 2:
                case 3:
                    ivQuestion.setImageResource(R.drawable.blonde_soal);
                    break;
                case 4:
                    ivQuestion.setImageResource(R.drawable.hidung_soal);
                    break;
                case 5:
                    ivQuestion.setImageResource(R.drawable.slim_soal);
                    break;
                case 6:
                    ivQuestion.setImageResource(R.drawable.mata_soal);
                    break;

                default: ivQuestion.setImageResource(0);
                    btn_a.setBackgroundResource(R.color.primary_light);
                    btn_b.setBackgroundResource(R.color.primary_light);
                    btn_c.setBackgroundResource(R.color.primary_light);

                    btn_a.setTextColor(Color.rgb(70,100,140));
                    btn_b.setTextColor(Color.rgb(70,100,140));
                    btn_c.setTextColor(Color.rgb(70,100,140));
            }

        } else {
            Intent intentResult = new Intent(QuizMateri2Activity.this, ResultQuizActivity.class);
            intentResult.putExtra("score", score);
            startActivity(intentResult);
            finish();


        }
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_answer_a:
                if (btn_a.getText() == mAnswer) {
                    benar();

                } else {
                    salah();
                }
                break;
            case R.id.btn_answer_b:
                if (btn_b.getText() == mAnswer) {
                    benar();

                } else {
                    salah();
                }
                break;
            case R.id.btn_answer_c:
                if (btn_c.getText() == mAnswer) {
                    benar();

                } else {
                    salah();
                }
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    private void salah() {
        dialog = new Dialog(QuizMateri2Activity.this);
        //Memasang Title / Judul pada Custom Dialog
        dialog.setTitle("Contoh Custom Dialog");
        salah.start();
        //Memasang Desain Layout untuk Custom Dialog
        dialog.setContentView(R.layout.dialog_box_salah_ulang);

        //Memasang Listener / Aksi saat tombol OK di Klik
        Button DialogButton = dialog.findViewById(R.id.ok);
        DialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        TextView TxBenar = dialog.findViewById(R.id.textbenar);
        TxBenar.setText(mAnswer);
        dialog.show();
        updateQuestion();
    }

    private void benar() {
        score = score + 10;
        updateScore(score);

        dialog = new Dialog(QuizMateri2Activity.this);
        benar.start();
        //Memasang Title / Judul pada Custom Dialog
        dialog.setTitle("Contoh Custom Dialog");

        //Memasang Desain Layout untuk Custom Dialog
        dialog.setContentView(R.layout.dialog_box_benar);

        //Memasang Listener / Aksi saat tombol OK di Klik
        Button DialogButton = dialog.findViewById(R.id.ok);
        DialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
        updateQuestion();
    }

    @SuppressLint("SetTextI18n")
    private void updateScore(int score) {
        tvScore.setText("" + score);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan Quiz", Toast.LENGTH_SHORT).show();
    }
}