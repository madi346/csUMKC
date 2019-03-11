package com.example.projectnewyorksubway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityOneLine extends AppCompatActivity {
RadioButton radioBtnOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_line);

        // radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
        radioBtnOne = (RadioButton)findViewById(R.id.radioButtonOne);
        radioBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityOneLine.this,"In March 2009, the South " +
                        "Ferry station was opened", Toast.LENGTH_LONG).show();
            }
        });
    }
}
