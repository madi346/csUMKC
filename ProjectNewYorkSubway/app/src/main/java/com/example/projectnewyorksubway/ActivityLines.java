package com.example.projectnewyorksubway;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Toast;

//this class is the methods for each class of subway lines, not for the MAIN ACTIVITY class
public class ActivityLines extends AppCompatActivity {

    public int numberLine = 0;
    protected String strEng = "englishfactplaceholder";
    protected String strFre = "frenchfactplaceholder";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lines);

    }
        //method for incrementing number of people who have been here
        //load how many people have been here
        public int numberOfPeople(int numberLine){

            numberLine += 1;
            return numberLine;
        }


        // method for scroll to top
        public void scrollingToTop (Button buttonTopLine,final ScrollView scrollViewLine){
            buttonTopLine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //WHEN CLICK ON THE SCROLL TO TOP BUTTON, THIS SCROLLS TO THE TOP OF THE ACTIVITY
                    scrollViewLine.fullScroll(ScrollView.FOCUS_UP);
                }
            });
        }


        // method for radio button toast in both English and French
        Context lineContext = ActivityLines.this;
        public void radioButtonPopUp(final String strEng, RadioButton radioBtnLine, final Context
                lineContext, final String strFre){

            radioBtnLine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(lineContext, strEng, Toast.LENGTH_LONG).show();
                    Toast.makeText(lineContext, strFre, Toast.LENGTH_LONG).show();

                }
            });
        }
    }



