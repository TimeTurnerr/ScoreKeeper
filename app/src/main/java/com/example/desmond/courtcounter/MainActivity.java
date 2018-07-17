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
    TextView team_a_score;
    TextView team_a_score2;
    TextView team_b_score;
    TextView team_b_score2;
    /**
     * Displays the given score for  Team A.
     */
    public void displayForTeamA(int score) {
        team_a_score.setText(String.valueOf(score));
    }
    public void displayForTeamA2(int score) {
        team_a_score2.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        team_b_score.setText(String.valueOf(score));
    }
    public void displayForTeamB2(int score) {
        team_b_score2.setText(String.valueOf(score));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team_a_score = (TextView) findViewById(R.id.team_a_score);
        team_a_score2 = (TextView) findViewById(R.id.team_a_score2);
        team_b_score = (TextView) findViewById(R.id.team_b_score);
        team_b_score2 = (TextView) findViewById(R.id.team_b_score2);
        displayForTeamA(0);
        displayForTeamB(0);
        displayForTeamA2(0);
        displayForTeamB2(0);
    }
    public void onClick(View v) {
        switch(v.getId())
        {

            case R.id.goalA:
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
                break;

            case R.id.freeKickA:
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
                break;

            case R.id.redCardA:
                scoreTeamA2 = scoreTeamA2 + 2;
                displayForTeamA2(scoreTeamA2);
                break;

            case R.id.yellowCardA:
                scoreTeamA2 = scoreTeamA2 + 1;
                displayForTeamA2(scoreTeamA2);
                break;

            case R.id.outSideA:
                scoreTeamA2 = scoreTeamA2 + 1;
                displayForTeamA2(scoreTeamA2);
                break;

            case R.id.goalB:
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
                break;

            case R.id.freeKickB:
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
                break;

            case R.id.redCardB:
                scoreTeamB2 = scoreTeamB2 + 2;
                displayForTeamB2(scoreTeamB2);
                break;

            case R.id.yellowCardB:
                scoreTeamB2 = scoreTeamB2 + 1;
                displayForTeamB2(scoreTeamB2);
                break;

            case R.id.outSideB:
                scoreTeamB2 = scoreTeamB2 + 1;
                displayForTeamB2(scoreTeamB2);
                break;

            case R.id.reset:
                displayForTeamB(scoreTeamB = 0);
                displayForTeamA(scoreTeamA = 0);
                displayForTeamB2(scoreTeamB2 = 0);
                displayForTeamA2(scoreTeamA2 = 0);
                break;
        }
    }
}
