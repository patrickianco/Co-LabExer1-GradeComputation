package com.example.labexer1_gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void computeGrade(View view){
        //Declare the intent
        Intent intent = new Intent(this, DisplayActivity.class);

        EditText quiz1 = (EditText) findViewById(R.id.quiz1);
        EditText quiz2 = (EditText) findViewById(R.id.quiz2);
        EditText sw = (EditText) findViewById(R.id.seatworks);
        EditText labExer = (EditText) findViewById(R.id.labExer);
        EditText majorExams = (EditText) findViewById(R.id.majorExams);

        int quiz1Value = Integer.parseInt(quiz1.getText().toString());
        int quiz2Value = Integer.parseInt(quiz2.getText().toString());
        int swValue = Integer.parseInt(sw.getText().toString());
        int labExerValue = Integer.parseInt(labExer.getText().toString());
        int majorExamsValue = Integer.parseInt(majorExams.getText().toString());
        double RA = 0;

        RA = quiz1Value*.10 + quiz2Value * .10 + swValue * .10 + labExerValue * .40 + majorExamsValue * .30;

        String computed = Double.toString(RA);
        String transmuted = "";

        if(RA < 60){
            transmuted = "Failed";
        }
        else if(RA >= 60 && RA <=65){
            transmuted = "3.0";
        }
        else if(RA >=66 && RA <=70){
            transmuted = "2.75";
        }
        else if(RA >= 71 && RA <= 75){
            transmuted = "2.50";
        }
        else if(RA >= 76 && RA <= 80){
            transmuted = "2.25";
        }
        else if(RA >= 81 && RA <= 85){
            transmuted = "2.0";
        }
        else if(RA >= 86 && RA <= 90){
            transmuted = "1.75";
        }
        else if(RA >= 91 && RA <= 92){
            transmuted = "1.50";
        }
        else if(RA >= 93 && RA <= 94){
            transmuted = "1.25";
        }
        else if(RA >= 95 && RA <= 100){
            transmuted = "1.00";
        }

        intent.putExtra("finalRA", computed);
        intent.putExtra("finalTrans", transmuted);

        startActivity(intent);
    }
}
