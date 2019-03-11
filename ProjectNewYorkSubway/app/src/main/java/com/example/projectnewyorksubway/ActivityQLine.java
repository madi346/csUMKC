package com.example.projectnewyorksubway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityQLine extends AppCompatActivity {
RadioButton radioBtnQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qline);

        // radioGroupD = (RadioGroup)findViewById(R.id.rGroupD);
        radioBtnQ = (RadioButton)findViewById(R.id.radioButtonQ);
        radioBtnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityQLine.this,"The Avenue Q musical uses the " +
                        "logo for the Q NYC subway line", Toast.LENGTH_LONG).show();
            }
        });
    }
}
