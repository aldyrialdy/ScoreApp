package xyz.fatahillah.scoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    TextView scoreTeamA, scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTeamA = (TextView) findViewById(R.id.score_team_a);
        scoreTeamB = (TextView) findViewById(R.id.score_team_b);

    }

    public void plusSixTeamA(View view) {

        scoreA += 6;
        scoreTeamA.setText(String.valueOf(scoreA));

    }

    public void plusThreeTeamA(View view) {

        scoreA += 3;
        scoreTeamA.setText(String.valueOf(scoreA));

    }

    public void plusTwoTeamA(View view) {

        scoreA += 2;
        scoreTeamA.setText(String.valueOf(scoreA));

    }

    public void plusOneTeamA(View view) {

        scoreA += 1;
        scoreTeamA.setText(String.valueOf(scoreA));

    }

    public void plusSixTeamB(View view) {

        scoreB += 6;
        scoreTeamB.setText(String.valueOf(scoreB));

    }

    public void plusThreeTeamB(View view) {

        scoreB += 3;
        scoreTeamB.setText(String.valueOf(scoreB));

    }

    public void plusTwoTeamB(View view) {

        scoreB += 2;
        scoreTeamB.setText(String.valueOf(scoreB));

    }

    public void plusOneTeamB(View view) {

        scoreB += 1;
        scoreTeamB.setText(String.valueOf(scoreB));

    }

    public void resetScore(View view) {

        scoreA = 0;
        scoreB = 0;
        scoreTeamA.setText(String.valueOf(scoreA));
        scoreTeamB.setText(String.valueOf(scoreB));

    }
}
