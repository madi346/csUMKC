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

public class ActivityELine extends ActivityLines {

    private ScrollView scrollViewE;
    private Button buttonTopE;


   private int numberE = 0;

    private TextView numVisitedE; //the number of people that have been to the E line before



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eline);



        numVisitedE = findViewById(R.id.totalNumE);
    Button btnE = findViewById(R.id.btnHereE);

    //load how many people have been here
        SharedPreferences myEPrefs = this.getSharedPreferences(getString(R.string.my_number_E),Context.MODE_PRIVATE);
        numberE = myEPrefs.getInt(getString(R.string.number_E), 0);

        //must .setText to update the number of people
        numVisitedE.setText(String.valueOf(numberE));

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ActivityLines activityLinesNumE = new ActivityLines();
                int numE = activityLinesNumE.numberOfPeople(numberE);


                SharedPreferences myEPrefs = getSharedPreferences(getString(R.string.my_number_E), Context.MODE_PRIVATE);
                SharedPreferences.Editor myEEditor = myEPrefs.edit();
                myEEditor.putInt(getString(R.string.number_E), numE);
                myEEditor.apply();

                numVisitedE.setText(String.valueOf(numE));
            }
        });

        //for the radio button pop up of the fun facts in English and French
        String strEEnglish = getString(R.string.fact_e);
        String strEFrench = getString(R.string.fact_e_french);

        RadioButton radioBtnE = findViewById(R.id.radioButtonE);

        ActivityLines activityLinesRadioE = new ActivityLines();

        Context eContext = ActivityELine.this;

        activityLinesRadioE.radioButtonPopUp(strEEnglish, radioBtnE, eContext, strEFrench);


        //for the scroll to top button
        scrollViewE = findViewById(R.id.scroll_view_e);
        buttonTopE = findViewById(R.id.eLineScrollTopButton);

        ActivityLines activityLinesScrollE = new ActivityLines();
        activityLinesScrollE.scrollingToTop(buttonTopE, scrollViewE);


    }

}






