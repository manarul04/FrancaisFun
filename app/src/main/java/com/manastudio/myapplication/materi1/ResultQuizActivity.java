package com.manastudio.myapplication.materi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.manastudio.myapplication.R;

import java.util.Objects;

public class ResultQuizActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvResult;
    private Button btnHome, btnSoal;
    MediaPlayer soaltambahan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            Objects.requireNonNull(this.getSupportActionBar()).hide();
        }
        catch (NullPointerException ignored){}
        setContentView(R.layout.activity_result_quiz);
        tvResult = findViewById(R.id.txt_result);
        btnHome = findViewById(R.id.btn_home);
        btnHome.setOnClickListener(this);



        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        tvResult.setText("" + score);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_home:
                finish();
                break;
        }
    }
}