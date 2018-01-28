package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Set Global Variables to 0
     */
    int oTeamA = 0;
    int iTeamA = 0;
    int gTeamA = 0;
    int oTeamB = 0;
    int iTeamB = 0;
    int gTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the goal for Team A by 1 point.
     */
    public void goalTeamA(View v) {
        gTeamA = gTeamA + 1;
        displayGoalTeamA(gTeamA);
    }

    /**
     * Increase the icing for Team A by 1 points.
     */
    public void icingTeamA(View v) {
        iTeamA = iTeamA + 1;
        displayIcingTeamA(iTeamA);
    }

    /**
     * Increase the offside for Team A by 1 points.
     */
    public void offSideTeamA(View v) {
        oTeamA = oTeamA + 1;
        displayOffSideTeamA(oTeamA);
    }
    /**
     * Increase the goal for Team B by 1 points.
     */
    public void goalTeamB(View v) {
        gTeamB = gTeamB + 1;
        displayGoalTeamB(gTeamB);
    }
    /**
     * Increase the icing for Team B by 1 point.
     */
    public void icingTeamB(View v) {
        iTeamB = iTeamB + 1;
        displayIcingTeamB(iTeamB);
    }

    /**
     * Increase the offside for Team B by 1 points.
     */
    public void offSideTeamB(View v) {
        oTeamB = oTeamB + 1;
        displayOffSideTeamB(oTeamB);
    }
    /**
     * Displays the given goal for Team A.
     */
    public void displayGoalTeamA(int goalScore) {
        TextView goalScoreView = (TextView) findViewById(R.id.team_a_goal);
        goalScoreView.setText(String.valueOf(goalScore));
    }
    /**
     * Displays the given offside for Team A.
     */
    public void displayOffSideTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_offside);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given icing for Team A.
     */
    public void displayIcingTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_icing);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given goal for Team B.
     */
    public void displayGoalTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given icing for Team B.
     */
    public void displayIcingTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_icing);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given offside for Team B.
     */
    public void displayOffSideTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_offside);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Reset's points to 0
     */
    public void resetPoints(View v){
        oTeamA = 0;
        iTeamA = 0;
        gTeamA = 0;
        oTeamB = 0;
        iTeamB = 0;
        gTeamB = 0;
        displayGoalTeamA(gTeamA);
        displayGoalTeamB(gTeamB);
        displayIcingTeamA(iTeamA);
        displayIcingTeamB(iTeamB);
        displayOffSideTeamA(oTeamA);
        displayOffSideTeamB(oTeamB);
    }
}