package com.example.projectnewyorksubway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityFourLine extends AppCompatActivity {
RadioButton radioBtnFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_line);

        // radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
        radioBtnFour = (RadioButton)findViewById(R.id.radioButtonFour);
        radioBtnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityFourLine.this,"The 4 line goes from " +
                        "Utica Avenue to Woodlawn", Toast.LENGTH_LONG).show();
            }
        });
    }
}
