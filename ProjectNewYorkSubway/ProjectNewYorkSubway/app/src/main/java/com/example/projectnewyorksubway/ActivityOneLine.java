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

public class ActivityOneLine extends ActivityLines {
//RadioButton radioBtnOne;
    private ScrollView scrollViewOne;
    private Button buttonTopOne;

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

                //numberOne += 1;
                ActivityLines activityLinesNumOne = new ActivityLines();
                int numOne = activityLinesNumOne.numberOfPeople(numberOne);

                SharedPreferences myOnePrefs = getSharedPreferences(getString(R.string.my_number_one), Context.MODE_PRIVATE);
                SharedPreferences.Editor myOneEditor = myOnePrefs.edit();
                myOneEditor.putInt(getString(R.string.number_one), numOne);
                myOneEditor.apply();

                numVisitedOne.setText(String.valueOf(numOne));
            }
        });


        String strOne = getString(R.string.fact_One);

        RadioButton radioBtnOne = findViewById(R.id.radioButtonOne);

        ActivityLines activityLinesRadioOne = new ActivityLines();

        Context oneContext = ActivityOneLine.this;
        activityLinesRadioOne.radioButtonPopUp(strOne, radioBtnOne, oneContext);

        /*// radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
       RadioButton radioBtnOne = findViewById(R.id.radioButtonOne);
        radioBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityOneLine.this,getString(R.string.fact_One), Toast.LENGTH_LONG).show();
            }
        });*/



        scrollViewOne = findViewById(R.id.scroll_view_one);

        buttonTopOne = findViewById(R.id.oneLineScrollTopButton);
        ActivityLines activityLinesScrollOne = new ActivityLines();
        activityLinesScrollOne.scrollingToTop(buttonTopOne, scrollViewOne);

       /* buttonTopOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //WHEN CLICK ON THE SCROLL TO TOP BUTTON, THIS SCROLLS TO THE TOP OF THE ACTIVITY
                //scrollViewOne.scrollTo(0,0);
                scrollViewOne.fullScroll(ScrollView.FOCUS_UP);
            }
        });*/
    }
}
