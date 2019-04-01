package com.example.projectnewyorksubway;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class ActivityDLine extends AppCompatActivity {
//RadioGroup radioGroupD;


    private int numberD = 0;

    private TextView numVisitedD; //the number of people that have been to the D line before

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dline);


        numVisitedD = findViewById(R.id.totalNumD);
        Button btnD = findViewById(R.id.btnHereD);

        //load how many people have been here
        SharedPreferences myDPrefs = this.getSharedPreferences(getString(R.string.my_number_D), Context.MODE_PRIVATE);
        numberD = myDPrefs.getInt(getString(R.string.number_D), 0);

        //must .setText to update the number of people
        //numVisitedD.setText("number :" + numberD);
        numVisitedD.setText(String.valueOf(numberD));

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberD += 1;

                SharedPreferences myDPrefs = getSharedPreferences(getString(R.string.my_number_D), Context.MODE_PRIVATE);
                SharedPreferences.Editor myDEditor = myDPrefs.edit();
                myDEditor.putInt(getString(R.string.number_D), numberD);
               // myDEditor.commit();
                myDEditor.apply();

                //numVisitedD.setText("number :" + numberD);
                numVisitedD.setText(String.valueOf(numberD));
            }
        });



        // radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
        RadioButton radioBtnD = findViewById(R.id.radioButtonD);
        radioBtnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityDLine.this,getString(R.string.fact_D),Toast.LENGTH_LONG).show();
            }
        });
    }
}
