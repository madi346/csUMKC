package com.example.projectnewyorksubway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ImageButton buttond = findViewById(R.id.dline);
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityD();
            }
        });

        ImageButton buttone = findViewById(R.id.eline);
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityE();
            }
        });

       ImageButton buttonfour = findViewById(R.id.fourline);
        buttonfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityFour();
            }
        });

       ImageButton buttonj = findViewById(R.id.jline);
        buttonj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityJ();
            }
        });

       ImageButton buttonone = findViewById(R.id.oneline);
        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityOne();
            }
        });

        ImageButton buttonq = findViewById(R.id.qline);
        buttonq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityQ();
            }
        });
    }

   private void openActivityD() {
        Intent myIntentD = new Intent(this, ActivityDLine.class);
        startActivity(myIntentD);
    }

    private void openActivityE() {
        Intent myIntentE = new Intent(this, ActivityELine.class);
        startActivity(myIntentE);
    }

    private void openActivityFour() {
        Intent myIntentFour = new Intent(this, ActivityFourLine.class);
        startActivity(myIntentFour);
    }

    private void openActivityJ() {
        Intent myIntentJ = new Intent(this, ActivityJLine.class);
        startActivity(myIntentJ);
    }

    private void openActivityOne() {
        Intent myIntentOne = new Intent(this, ActivityOneLine.class);
        startActivity(myIntentOne);
    }

    private void openActivityQ() {
        Intent myIntentQ = new Intent(this, ActivityQLine.class);
        startActivity(myIntentQ);
    }
}