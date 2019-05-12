package com.example.projectnewyorksubway;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;



public class ActivityDLine extends ActivityLines {

private ScrollView scrollViewD;
private Button buttonTopD;

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

        numVisitedD.setText(String.valueOf(numberD));

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                ActivityLines activityLinesNumD = new ActivityLines();
                int numD = activityLinesNumD.numberOfPeople(numberD);

                SharedPreferences myDPrefs = getSharedPreferences(getString(R.string.my_number_D), Context.MODE_PRIVATE);
                SharedPreferences.Editor myDEditor = myDPrefs.edit();
                myDEditor.putInt(getString(R.string.number_D), numD);

                myDEditor.apply();


                numVisitedD.setText(String.valueOf(numD));
            }
        });


        //for the radio button pop up of the fun facts in English and French
         String strDEnglish = getString(R.string.fact_d);
         String strDFrench = getString(R.string.fact_d_french);

        RadioButton radioBtnD = findViewById(R.id.radioButtonD);

        ActivityLines activityLinesRadioD = new ActivityLines();

        Context dContext = ActivityDLine.this;

        activityLinesRadioD.radioButtonPopUp(strDEnglish, radioBtnD, dContext, strDFrench);


        //for the scroll to top button
        scrollViewD = findViewById(R.id.scroll_view_d);
        buttonTopD = findViewById(R.id.dLineScrollTopButton);

        ActivityLines activityLinesScrollD = new ActivityLines();
        activityLinesScrollD.scrollingToTop(buttonTopD, scrollViewD);


    }




}
