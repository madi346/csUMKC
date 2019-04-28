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

public class ActivityJLine extends ActivityLines {
//RadioButton radioBtnJ;
    private ScrollView scrollViewJ;
    private Button buttonTopJ;

    private int numberJ = 0;

    private TextView numVisitedJ; //the number of people that have been to the J line before
    //private Button btnJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jline);


        numVisitedJ = findViewById(R.id.totalNumJ);
        Button btnJ = findViewById(R.id.btnHereJ);

        //load how many people have been here
        SharedPreferences myJPrefs = this.getSharedPreferences(getString(R.string.my_number_J), Context.MODE_PRIVATE);
        numberJ = myJPrefs.getInt(getString(R.string.number_J), 0);

        //must .setText to update the number of people
        numVisitedJ.setText(String.valueOf(numberJ));

        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //numberJ += 1;
                ActivityLines activityLinesNumJ = new ActivityLines();
                int numJ = activityLinesNumJ.numberOfPeople(numberJ);


                SharedPreferences myJPrefs = getSharedPreferences(getString(R.string.my_number_J), Context.MODE_PRIVATE);
                SharedPreferences.Editor myJEditor = myJPrefs.edit();
                myJEditor.putInt(getString(R.string.number_J), numJ);
                myJEditor.apply();

                numVisitedJ.setText(String.valueOf(numJ));
            }
        });


        String strJ = getString(R.string.fact_j);

        RadioButton radioBtnJ = findViewById(R.id.radioButtonJ);

        ActivityLines activityLinesRadioJ = new ActivityLines();

        Context jContext = ActivityJLine.this;
        activityLinesRadioJ.radioButtonPopUp(strJ, radioBtnJ, jContext);

        /*// radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
        RadioButton radioBtnJ = findViewById(R.id.radioButtonJ);
        radioBtnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityJLine.this,getString(R.string.fact_j), Toast.LENGTH_LONG).show();
            }
        });*/



        scrollViewJ = findViewById(R.id.scroll_view_j);

        buttonTopJ = findViewById(R.id.jLineScrollTopButton);
        ActivityLines activityLinesScrollJ = new ActivityLines();
        activityLinesScrollJ.scrollingToTop(buttonTopJ, scrollViewJ);

        /*buttonTopJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //WHEN CLICK ON THE SCROLL TO TOP BUTTON, THIS SCROLLS TO THE TOP OF THE ACTIVITY
                //scrollViewJ.scrollTo(0,0);
                scrollViewJ.fullScroll(ScrollView.FOCUS_UP);
            }
        });*/
    }
}
