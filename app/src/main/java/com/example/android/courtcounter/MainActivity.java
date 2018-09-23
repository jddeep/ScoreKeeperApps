package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.courtcounter.R;

public class MainActivity extends AppCompatActivity {
    int scoreA,scoreB;
    /**
     * Displays the given score for Team A.
     */


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void scoreThreeA(View view){
        scoreA=scoreA+3;
        displayA(scoreA);
    }
    public void scoreTwoA(View view){
        scoreA=scoreA+2;
        displayA(scoreA);
    }
    public void scoreFreeThrowA(View view){
        scoreA=scoreA+1;
        displayA(scoreA);
    }
    public void displayA(int number){
        TextView countViewer = (TextView)findViewById(R.id.team_a_score);
        countViewer.setText(""+ number);
    }
    public void scoreThreeB(View view){
        scoreB=scoreB+3;
        displayB(scoreB);
    }
    public void scoreTwoB(View view){
        scoreB=scoreB+2;
        displayB(scoreB);
    }
    public void scoreFreeThrowB(View view){
        scoreB=scoreB+1;
        displayB(scoreB);
    }
    public void displayB(int number) {
        TextView countViewer = (TextView) findViewById(R.id.team_b_score);
        countViewer.setText("" + number);
    }
    public void Reset(View view)
    {scoreA=0;
    scoreB=0;
    displayA(scoreA);
    displayB(scoreB);}
}
