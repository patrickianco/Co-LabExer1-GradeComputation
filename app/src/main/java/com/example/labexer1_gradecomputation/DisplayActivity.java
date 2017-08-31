package com.example.labexer1_gradecomputation;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        TextView raView = (TextView) findViewById(R.id.raView);
        TextView transView = (TextView) findViewById(R.id.transView);

        String ra = intent.getStringExtra("finalRA");
        String transmuted = intent.getStringExtra("finalTrans");

        if(transmuted == "Failed"){
            transView.setTextColor(Color.parseColor("#f90018"));
        }
        else{
            transView.setTextColor(Color.parseColor("#08ba05"));
        }

        raView.setText(ra);
        transView.setText(transmuted);
    }

    public void goBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
