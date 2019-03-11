package com.example.projectnewyorksubway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityELine extends AppCompatActivity {
RadioButton radioBtnE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eline);


        radioBtnE = (RadioButton)findViewById(R.id.radioButtonE);
        radioBtnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityELine.this,"The E line is one of the" +
                        "most used services in the NYC subway system", Toast.LENGTH_LONG).show();
            }
        });
    }
}
