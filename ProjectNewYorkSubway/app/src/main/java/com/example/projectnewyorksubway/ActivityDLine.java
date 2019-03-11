package com.example.projectnewyorksubway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityDLine extends AppCompatActivity {
//RadioGroup radioGroupD;
RadioButton radioBtnD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dline);

       // radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
        radioBtnD = (RadioButton)findViewById(R.id.radioButtonD);
        radioBtnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityDLine.this,"A character in Seinfeld uses" +
                        "the D train to get to Coney Island", Toast.LENGTH_LONG).show();
            }
        });
    }
}
