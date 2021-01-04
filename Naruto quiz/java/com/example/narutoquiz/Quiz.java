package com.example.narutoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    public static final String EXTRA_NUMBER = "com.example.narutoquiz.example.EXTRA_NUMBER";

    private TextView text;
    private TextView name;
    private int randomNumber;
    private Button button1;
    private Button button2;
    private Button button3;
    private int count;
    private int score;
    private int temp1 = 10, temp2 = 11, temp3 = 12, temp4 = 14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        count = 0;
        score = 0;
        text = (TextView)findViewById(R.id.question);
        button1 = (Button)findViewById(R.id.button1);
        button2= (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        randomNumber = Utilities.QuizUtilities.GetRandomNumber();
        button1.setText(Utilities.QuizUtilities.GetTextButton1());
        button2.setText(Utilities.QuizUtilities.GetTextButton2());
        button3.setText(Utilities.QuizUtilities.GetTextButton3());
        if(randomNumber==0) {
            text.setText(Utilities.QuizUtilities.GetQuestion1());
        }
        else if (randomNumber == 1) {
            text.setText(Utilities.QuizUtilities.GetQuestion2());
        }
        else if (randomNumber == 2){
            text.setText(Utilities.QuizUtilities.GetQuestion3());
        }
        else if (randomNumber == 3){
            text.setText(Utilities.QuizUtilities.GetQuestion4());
        }
        else if (randomNumber == 4){
            text.setText(Utilities.QuizUtilities.GetQuestion5());
        }
        button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                if(count < 4) {
                    if (randomNumber == 0)
                        score += 60;
                    if (randomNumber == 1)
                        score += 40;
                    if (randomNumber == 2)
                        score += 40;
                    if (randomNumber == 3)
                        score += 60;
                    if (randomNumber == 4)
                        score += 20;
                    if (count == 0){
                        temp1 = randomNumber;
                        while (randomNumber == temp1)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }
                    if (count == 1){
                        temp2 = randomNumber;
                        while (randomNumber == temp1 || randomNumber == temp2)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }
                    if (count == 2){
                        temp3 = randomNumber;
                        while (randomNumber == temp1 || randomNumber == temp2 || randomNumber == temp3)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }
                    if (count == 3){
                        temp4 = randomNumber;
                        while (randomNumber == temp1 || randomNumber == temp2 || randomNumber == temp3 || randomNumber == temp4)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }

                    if (randomNumber == 0) {
                        text.setText(Utilities.QuizUtilities.GetQuestion1());
                    } else if (randomNumber == 1) {
                        text.setText(Utilities.QuizUtilities.GetQuestion2());
                    } else if (randomNumber == 2) {
                        text.setText(Utilities.QuizUtilities.GetQuestion3());
                    } else if (randomNumber == 3) {
                        text.setText(Utilities.QuizUtilities.GetQuestion4());
                    } else if (randomNumber == 4) {
                        text.setText(Utilities.QuizUtilities.GetQuestion5());
                    }
                }
                count++;
                if(count>=5) {
                    if (randomNumber == 0)
                        score += 60;
                    if (randomNumber == 1)
                        score += 40;
                    if (randomNumber == 2)
                        score += 40;
                    if (randomNumber == 3)
                        score += 60;
                    if (randomNumber == 4)
                        score += 20;
                    /*button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    if (score < 150)
                        text.setText("You got Obito.");
                    else if (score < 200 && score >= 150)
                        text.setText("You got Sasuke");
                    else if (score < 250 && score >=200)
                        text.setText("You got KAKASHI");
                    else if (score <= 300 && score >=250)
                        text.setText("You got naruto"); */
                    openResult();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                if(count < 4) {
                    if (randomNumber == 0)
                        score += 40;
                    if (randomNumber == 1)
                        score += 20;
                    if (randomNumber == 2)
                        score += 20;
                    if (randomNumber == 3)
                        score += 40;
                    if (randomNumber == 4)
                        score += 40;
                    if (count == 0){
                        temp1 = randomNumber;
                        while (randomNumber == temp1)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }
                    if (count == 1){
                        temp2 = randomNumber;
                        while (randomNumber == temp1 || randomNumber == temp2)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }
                    if (count == 2){
                        temp3 = randomNumber;
                        while (randomNumber == temp1 || randomNumber == temp2 || randomNumber == temp3)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }
                    if (count == 3){
                        temp4 = randomNumber;
                        while (randomNumber == temp1 || randomNumber == temp2 || randomNumber == temp3 || randomNumber == temp4)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }

                    if (randomNumber == 0) {
                        text.setText(Utilities.QuizUtilities.GetQuestion1());
                    } else if (randomNumber == 1) {
                        text.setText(Utilities.QuizUtilities.GetQuestion2());
                    } else if (randomNumber == 2) {
                        text.setText(Utilities.QuizUtilities.GetQuestion3());
                    } else if (randomNumber == 3) {
                        text.setText(Utilities.QuizUtilities.GetQuestion4());
                    } else if (randomNumber == 4) {
                        text.setText(Utilities.QuizUtilities.GetQuestion5());
                    }
                }
                count++;
                if(count>=5) {
                    if (randomNumber == 0)
                        score += 40;
                    if (randomNumber == 1)
                        score += 20;
                    if (randomNumber == 2)
                        score += 20;
                    if (randomNumber == 3)
                        score += 40;
                    if (randomNumber == 4)
                        score += 40;
                    /*button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    if (score < 150)
                        text.setText("You got Obito.");
                    else if (score < 200 && score >= 150)
                        text.setText("You got Sasuke");
                    else if (score < 250 && score >=200)
                        text.setText("You got KAKASHI");
                    else if (score <= 300 && score >=250)
                        text.setText("You got naruto"); */
                    openResult();
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                if(count < 4) {
                    if (randomNumber == 0)
                        score += 20;
                    if (randomNumber == 1)
                        score += 60;
                    if (randomNumber == 2)
                        score += 60;
                    if (randomNumber == 3)
                        score += 20;
                    if (randomNumber == 4)
                        score += 60;
                    if (count == 0){
                        temp1 = randomNumber;
                        while (randomNumber == temp1)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }
                    if (count == 1){
                        temp2 = randomNumber;
                        while (randomNumber == temp1 || randomNumber == temp2)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }
                    if (count == 2){
                        temp3 = randomNumber;
                        while (randomNumber == temp1 || randomNumber == temp2 || randomNumber == temp3)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }
                    if (count == 3){
                        temp4 = randomNumber;
                        while (randomNumber == temp1 || randomNumber == temp2 || randomNumber == temp3 || randomNumber == temp4)
                            randomNumber = Utilities.QuizUtilities.GetRandomNumber();
                    }

                    if (randomNumber == 0) {
                        text.setText(Utilities.QuizUtilities.GetQuestion1());
                    } else if (randomNumber == 1) {
                        text.setText(Utilities.QuizUtilities.GetQuestion2());
                    } else if (randomNumber == 2) {
                        text.setText(Utilities.QuizUtilities.GetQuestion3());
                    } else if (randomNumber == 3) {
                        text.setText(Utilities.QuizUtilities.GetQuestion4());
                    } else if (randomNumber == 4) {
                        text.setText(Utilities.QuizUtilities.GetQuestion5());
                    }
                }
                count++;
                if(count>=5) {
                    if (randomNumber == 0)
                        score += 20;
                    if (randomNumber == 1)
                        score += 60;
                    if (randomNumber == 2)
                        score += 60;
                    if (randomNumber == 3)
                        score += 20;
                    if (randomNumber == 4)
                        score += 60;
                    /*button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    if (score < 150)
                        text.setText("You got Obito.");
                    else if (score < 200 && score >= 150)
                        text.setText("You got Sasuke");
                    else if (score < 250 && score >=200)
                        text.setText("You got KAKASHI");
                    else if (score <= 300 && score >=250)
                        text.setText("You got naruto"); */
                    openResult();
                }
            }
        });

    }
    public void openResult(){
        Intent intent = new Intent(this, Result.class);
        intent.putExtra(EXTRA_NUMBER, score);
        startActivity(intent);
        finish();
    }

}
