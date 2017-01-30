package com.example.krupa.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CricketScore extends AppCompatActivity {
    int ScoreTeamA =0;
    int ScoreTeamB =0;
    int wicketA =0;
    int wicketB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket_score);
    }

    /** For Team A /
     *
     */
    public void addOneforteamA(View v){
        ScoreTeamA = ScoreTeamA+1;
        displayForTeamA(ScoreTeamA);
    }
    public void addtwoforteamA(View v){
        ScoreTeamA = ScoreTeamA+2;
        displayForTeamA(ScoreTeamA);
    }
    public void addfourforteamA(View v){
        ScoreTeamA = ScoreTeamA+4;
        displayForTeamA(ScoreTeamA);
    }
    public void addSixforteamA(View v){
        ScoreTeamA = ScoreTeamA+6;
        displayForTeamA(ScoreTeamA);
    }
    public void addonewicket(View v){
        wicketA=wicketA+1;
        displaywicketForTeamA(wicketA);
    }

    /** For Team A /
     *
     */
    public void addOneforteamB(View v){
        ScoreTeamB = ScoreTeamB+1;
        displayForTeamB(ScoreTeamB);
    }
    public void addtwoforteamB(View v){
        ScoreTeamB = ScoreTeamB+2;
        displayForTeamB(ScoreTeamB);
    }
    public void addfourforteamB(View v){
        ScoreTeamB = ScoreTeamB+4;
        displayForTeamB(ScoreTeamB);
    }
    public void addSixforteamB(View v){
        ScoreTeamB = ScoreTeamB+6;
        displayForTeamB(ScoreTeamB);
    }
    public void addonewicketB(View v){
        wicketB=wicketB+1;
        displaywicketForTeamB(wicketB);
    }

    public void addnameforteamB(View v) {
        EditText edittext = (EditText) findViewById(R.id.TeamBname);
        String OversA = edittext.getText().toString().trim();
        TextView oversView = (TextView) findViewById(R.id.TeamB);
        oversView.setText(OversA);
    }
    public void addnameforteamA(View v) {
        EditText edittext = (EditText) findViewById(R.id.TeamAname);
        String OversA = edittext.getText().toString().trim();
        TextView oversView = (TextView) findViewById(R.id.TeamA);
        oversView.setText(OversA);
    }
    public void addOversforteamA(View v) {
        EditText edittext = (EditText) findViewById(R.id.editovers);
        String OversA = edittext.getText().toString().trim();
        displayOversForTeamA(OversA);
    }
    public void addOversforteamB(View v) {
        EditText edittext = (EditText) findViewById(R.id.editoversB);
        String OversB = edittext.getText().toString().trim();
        displayOversForTeamB(OversB);
    }


    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        wicketA =0;
        wicketB =0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);
        displayOversForTeamB("0");
        displayOversForTeamA("0");
        displaywicketForTeamA(wicketA);
        displaywicketForTeamB(wicketB);
    }

//    Displays the given score for Team A.

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ScoreA);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ScoreB);
        scoreView.setText(String.valueOf(score));

    }

    public void displaywicketForTeamA(int wicket) {
        TextView wicketView = (TextView) findViewById(R.id.wicket);
        wicketView.setText(String.valueOf(wicket));
    }

    public void displaywicketForTeamB(int wicket) {
        TextView wicketView = (TextView) findViewById(R.id.wicketB);
        wicketView.setText(String.valueOf(wicket));
    }

    public void displayOversForTeamA(String OversA) {
        TextView oversView = (TextView) findViewById(R.id.overs);
        oversView.setText(OversA);
    }
    public void displayOversForTeamB(String OversB) {
        TextView oversView = (TextView) findViewById(R.id.oversB);
        oversView.setText(OversB);
    }
}
