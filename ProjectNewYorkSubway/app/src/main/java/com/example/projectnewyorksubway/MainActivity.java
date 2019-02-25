package com.example.projectnewyorksubway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton buttond;
    private ImageButton buttone;
    private ImageButton buttonfour;
    private ImageButton buttonj;
    private ImageButton buttonone;
    private ImageButton buttonq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttond = (ImageButton) findViewById(R.id.dline);
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityD();
            }
        });

        buttone = (ImageButton) findViewById(R.id.eline);
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityE();
            }
        });

        buttonfour = (ImageButton) findViewById(R.id.fourline);
        buttonfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityFour();
            }
        });

        buttonj = (ImageButton) findViewById(R.id.jline);
        buttonj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityJ();
            }
        });

        buttonone = (ImageButton) findViewById(R.id.oneline);
        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityOne();
            }
        });

        buttonq = (ImageButton) findViewById(R.id.qline);
        buttonq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityQ();
            }
        });
    }

    public void openActivityD() {
        Intent myIntent = new Intent(this, ActivityDLine.class);
        startActivity(myIntent);
    }

    public void openActivityE() {
        Intent myIntent = new Intent(this, ActivityELine.class);
        startActivity(myIntent);
    }

    public void openActivityFour() {
        Intent myIntent = new Intent(this, ActivityFourLine.class);
        startActivity(myIntent);
    }

    public void openActivityJ() {
        Intent myIntent = new Intent(this, ActivityJLine.class);
        startActivity(myIntent);
    }

    public void openActivityOne() {
        Intent myIntent = new Intent(this, ActivityOneLine.class);
        startActivity(myIntent);
    }

    public void openActivityQ() {
        Intent myIntent = new Intent(this, ActivityQLine.class);
        startActivity(myIntent);
    }
}
