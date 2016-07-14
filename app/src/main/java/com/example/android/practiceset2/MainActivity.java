package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int AScore = 0;
    int BScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Aplus3(View view) {
        AScore += 3;
        displayA(AScore);
    }

    public void Aplus2(View view) {
        AScore += 2;
        displayA(AScore);
    }

    public void Aplus1(View view) {
        AScore += 1;
        displayA(AScore);
    }

    public void Bplus3(View view) {
        BScore += 3;
        displayB(BScore);
    }

    public void Bplus2(View view) {
        BScore += 2;
        displayB(BScore);
    }

    public void Bplus1(View view) {
        BScore += 1;
        displayB(BScore);
    }

    public void reset(View view) {
        AScore = 0;
        BScore = 0;
        displayA(AScore);
        displayB(BScore);

    }

    public void displayA(int score) {
        TextView ATextView = (TextView) findViewById(R.id.AScore);
        ATextView.setText(String.valueOf(AScore));
    }

    public void displayB(int score) {
        TextView BTextView = (TextView) findViewById(R.id.BScore);
        BTextView.setText(String.valueOf(BScore));
    }
}
