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

public class ActivityQLine extends AppCompatActivity {
//RadioButton radioBtnQ;

   private int numberQ = 0;

    private TextView numVisitedQ; //the number of people that have been to the Q line before
   // private Button btnQ;

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

                numberQ += 1;

                SharedPreferences myQPrefs = getSharedPreferences(getString(R.string.my_number_Q), Context.MODE_PRIVATE);
                SharedPreferences.Editor myQEditor = myQPrefs.edit();
                myQEditor.putInt(getString(R.string.number_Q), numberQ);
                myQEditor.apply();

                numVisitedQ.setText(String.valueOf(numberQ));
            }
        });



        // radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
        RadioButton radioBtnQ = findViewById(R.id.radioButtonQ);
        radioBtnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityQLine.this,getString(R.string.fact_q), Toast.LENGTH_LONG).show();
            }
        });
    }
}
