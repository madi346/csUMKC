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

public class ActivityQLine extends ActivityLines {

    private ScrollView scrollViewQ;
    private Button buttonTopQ;

   private int numberQ = 0;

    private TextView numVisitedQ; //the number of people that have been to the Q line before


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qline);


        numVisitedQ = findViewById(R.id.totalNumQ);
       Button btnQ = findViewById(R.id.btnHereQ);

        //load how many people have been here
        SharedPreferences myQPrefs = this.getSharedPreferences(getString(R.string.my_number_Q), Context.MODE_PRIVATE);
        numberQ = myQPrefs.getInt(getString(R.string.number_Q), 0);

        //must .setText to update the number of people
        numVisitedQ.setText(String.valueOf(numberQ));

        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ActivityLines activityLinesNumQ = new ActivityLines();
                int numQ = activityLinesNumQ.numberOfPeople(numberQ);


                SharedPreferences myQPrefs = getSharedPreferences(getString(R.string.my_number_Q), Context.MODE_PRIVATE);
                SharedPreferences.Editor myQEditor = myQPrefs.edit();
                myQEditor.putInt(getString(R.string.number_Q), numQ);
                myQEditor.apply();

                numVisitedQ.setText(String.valueOf(numQ));
            }
        });

        //for the radio button pop up of the fun facts in English and French
        String strQEnglish = getString(R.string.fact_q);
        String strQFrench = getString(R.string.fact_q_french);

        RadioButton radioBtnQ = findViewById(R.id.radioButtonQ);

        ActivityLines activityLinesRadioQ = new ActivityLines();
        Context qContext = ActivityQLine.this;

        activityLinesRadioQ.radioButtonPopUp(strQEnglish, radioBtnQ, qContext, strQFrench);


        //for the scroll to top button
        scrollViewQ = findViewById(R.id.scroll_view_q);
        buttonTopQ = findViewById(R.id.qLineScrollTopButton);

        ActivityLines activityLinesScrollQ = new ActivityLines();
        activityLinesScrollQ.scrollingToTop(buttonTopQ, scrollViewQ);


    }
}
