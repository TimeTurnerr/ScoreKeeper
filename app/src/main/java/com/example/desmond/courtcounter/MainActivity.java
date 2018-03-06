package com.example.desmond.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA = 0;
    int scoreTeamA2 = 0;
    int scoreTeamB = 0;
    int scoreTeamB2 = 0;
    public void goal(View view)
    {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void freeKick(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void redCard(View view){
        scoreTeamA2 = scoreTeamA2 + 2;
        displayForTeamA2(scoreTeamA2);
    }
    public void yellowCard(View view){
        scoreTeamA2 = scoreTeamA2 + 1;
        displayForTeamA2(scoreTeamA2);
    }
    public void outSide(View view){
        scoreTeamA2 = scoreTeamA2 + 1;
        displayForTeamA2(scoreTeamA2);
    }

    public void goalb(View view)
    {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void freeKickb(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void redCardb(View view){
        scoreTeamB2 = scoreTeamB2 + 2;
        displayForTeamB2(scoreTeamB2);
    }
    public void yellowCardb(View view){
        scoreTeamB2 = scoreTeamB2 + 1;
        displayForTeamB2(scoreTeamB2);
    }
    public void outSideb(View view){
        scoreTeamB2 = scoreTeamB2 + 1;
        displayForTeamB2(scoreTeamB2);
    }

    public void reset(View view){
        scoreTeamB = 0;
        scoreTeamA2 = 0;
        scoreTeamB2 = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB2(scoreTeamB2);
        displayForTeamA2(scoreTeamA2);
    }
    /**
     * Displays the given score for  Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamA2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score2);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayForTeamA2(0);
        displayForTeamB2(0);



    }
}
