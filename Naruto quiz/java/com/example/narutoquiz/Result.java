package com.example.narutoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Result extends AppCompatActivity {

    public static final String EXTRA_NUMBER = "com.example.narutoquiz.example.EXTRA_NUMBER";

    private TextView text;
    private TextView character;
    private ImageView firstCharacter;
    private ImageView secondCharacter;
    private ImageView thirdCharacter;
    private ImageView fourthCharacter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        text = (TextView) findViewById(R.id.result);
        character = (TextView) findViewById(R.id.character);
        firstCharacter = (ImageView) findViewById(R.id.imageView1);
        firstCharacter.setVisibility(View.INVISIBLE);
        secondCharacter = (ImageView) findViewById(R.id.imageView2);
        secondCharacter.setVisibility(View.INVISIBLE);
        thirdCharacter = (ImageView) findViewById(R.id.imageView3);
        thirdCharacter.setVisibility(View.INVISIBLE);
        fourthCharacter = (ImageView) findViewById(R.id.imageView4);
        fourthCharacter.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        int score = intent.getIntExtra(Quiz.EXTRA_NUMBER, 0);
        text.setText("You got");
        if (score < 150){
            character.setText("Obito Uchiha");
            thirdCharacter.setVisibility(View.VISIBLE);
        }
        else if (score < 200 && score >= 150) {
            character.setText("Sasuke Uchiha");
            fourthCharacter.setVisibility(View.VISIBLE);
        }
        else if (score < 250 && score >=200) {
            character.setText("Kakashi Hatake");
            firstCharacter.setVisibility(View.VISIBLE);
        }
        else if (score <= 300 && score >=250) {
            character.setText("Naruto Uzumaki");
            secondCharacter.setVisibility(View.VISIBLE);
        }
    }
}
