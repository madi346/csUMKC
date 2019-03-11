package com.example.projectnewyorksubway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityJLine extends AppCompatActivity {
RadioButton radioBtnJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jline);

        // radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
        radioBtnJ = (RadioButton)findViewById(R.id.radioButtonJ);
        radioBtnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityJLine.this,"The J line was one of " +
                        "the original elevated lines in Brooklyn", Toast.LENGTH_LONG).show();
            }
        });
    }
}
