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

public class ActivityJLine extends AppCompatActivity {
//RadioButton radioBtnJ;

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

                numberJ += 1;

                SharedPreferences myJPrefs = getSharedPreferences(getString(R.string.my_number_J), Context.MODE_PRIVATE);
                SharedPreferences.Editor myJEditor = myJPrefs.edit();
                myJEditor.putInt(getString(R.string.number_J), numberJ);
                myJEditor.apply();

                numVisitedJ.setText(String.valueOf(numberJ));
            }
        });



        // radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
        RadioButton radioBtnJ = findViewById(R.id.radioButtonJ);
        radioBtnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityJLine.this,getString(R.string.fact_j), Toast.LENGTH_LONG).show();
            }
        });
    }
}
