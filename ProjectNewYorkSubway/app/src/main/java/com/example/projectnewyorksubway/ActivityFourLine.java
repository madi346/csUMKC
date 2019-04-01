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

public class ActivityFourLine extends AppCompatActivity {
//RadioButton radioBtnFour;

    private int numberFour = 0;

    private TextView numVisitedFour; //the number of people that have been to the Four line before
   // private Button btnFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_line);


        numVisitedFour = findViewById(R.id.totalNumFour);
        Button btnFour = findViewById(R.id.btnHereFour);

        //load how many people have been here
        SharedPreferences myFourPrefs = this.getSharedPreferences(getString(R.string.my_number_four), Context.MODE_PRIVATE);
        numberFour = myFourPrefs.getInt(getString(R.string.number_four), 0);

        //must .setText to update the number of people
        numVisitedFour.setText(String.valueOf(numberFour));

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberFour += 1;

                SharedPreferences myFourPrefs = getSharedPreferences(getString(R.string.my_number_four), Context.MODE_PRIVATE);
                SharedPreferences.Editor myFourEditor = myFourPrefs.edit();
                myFourEditor.putInt(getString(R.string.number_four), numberFour);
                myFourEditor.apply();

                numVisitedFour.setText(String.valueOf(numberFour));
            }
        });



        // radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
       RadioButton radioBtnFour = findViewById(R.id.radioButtonFour);
        radioBtnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityFourLine.this,getString(R.string.fact_four), Toast.LENGTH_LONG).show();
            }
        });
    }
}
