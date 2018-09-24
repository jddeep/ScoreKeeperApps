package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int goalA, goalB, foulA, foulB, cardA, cardB;

    /**
     * Displays the given goals for Team A.
     */


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void GoalA(View view) {
        goalA = goalA + 1;
        displayA(goalA);
    }

    public void FoulA(View view) {
        foulA = foulA + 1;
        displayFoulA(foulA);
    }

    public void CardA(View view) {
        cardA = cardA + 1;
        displayCardsA(cardA);
    }

    public void displayA(int number) {
        TextView countViewer = (TextView) findViewById(R.id.team_a_goals);
        countViewer.setText("" + number);
    }

    public void displayFoulA(int number) {
        TextView countViewer = (TextView) findViewById(R.id.fouls);
        countViewer.setText("" + number);
    }

    public void displayCardsA(int number) {
        TextView countViewer = (TextView) findViewById(R.id.cards);
        countViewer.setText("" + number);
    }

    public void GoalB(View view) {
        goalB = goalB + 1;
        displayB(goalB);
    }

    public void FoulB(View view) {
        foulB = foulB + 1;
        displayFoulB(foulB);
    }

    public void CardB(View view) {
        cardB = cardB + 1;
        displayCardsB(cardB);
    }

    public void displayB(int number) {
        TextView countViewer = (TextView) findViewById(R.id.team_b_goals);
        countViewer.setText("" + number);
    }

    public void displayFoulB(int number) {
        TextView countViewer = (TextView) findViewById(R.id.foulB);
        countViewer.setText("" + number);
    }

    public void displayCardsB(int number) {
        TextView countViewer = (TextView) findViewById(R.id.cardB);
        countViewer.setText("" + number);
    }

    public void Reset(View view) {
        goalA = 0;
        goalB = 0;
        foulA = 0;
        foulB = 0;
        cardA = 0;
        cardB = 0;
        displayA(goalA);
        displayB(goalB);
        displayFoulA(foulA);
        displayFoulB(foulB);
        displayCardsA(cardA);
        displayCardsB(cardB);
    }
}

