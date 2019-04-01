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

public class ActivityOneLine extends AppCompatActivity {
//RadioButton radioBtnOne;

   private int numberOne = 0;

    private TextView numVisitedOne; //the number of people that have been to the One line before
   // private Button btnOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_line);


        numVisitedOne = findViewById(R.id.totalNumOne);
       Button btnOne = findViewById(R.id.btnHereOne);

        //load how many people have been here
        SharedPreferences myOnePrefs = this.getSharedPreferences(getString(R.string.my_number_one), Context.MODE_PRIVATE);
        numberOne = myOnePrefs.getInt(getString(R.string.number_one), 0);

        //must .setText to update the number of people
        numVisitedOne.setText(String.valueOf(numberOne));

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberOne += 1;

                SharedPreferences myOnePrefs = getSharedPreferences(getString(R.string.my_number_one), Context.MODE_PRIVATE);
                SharedPreferences.Editor myOneEditor = myOnePrefs.edit();
                myOneEditor.putInt(getString(R.string.number_one), numberOne);
                myOneEditor.apply();

                numVisitedOne.setText(String.valueOf(numberOne));
            }
        });



        // radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
       RadioButton radioBtnOne = findViewById(R.id.radioButtonOne);
        radioBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityOneLine.this,getString(R.string.fact_One), Toast.LENGTH_LONG).show();
            }
        });
    }
}
