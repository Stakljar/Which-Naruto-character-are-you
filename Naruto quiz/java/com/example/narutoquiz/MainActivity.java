package com.example.narutoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        text = (TextView) findViewById(R.id.textview);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startQuiz();
            }
        });
    }
    public void startQuiz(){
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }

}
