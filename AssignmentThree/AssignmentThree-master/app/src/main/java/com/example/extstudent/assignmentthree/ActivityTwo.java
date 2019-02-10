package com.example.extstudent.assignmentthree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    private Button buttonActivity1 = null;
    private Button buttonActivity3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        // Initialize widgets
        this.buttonActivity1 = (Button)findViewById(R.id.buttonActivity1);
        this.buttonActivity3 = (Button)findViewById(R.id.buttonActivity3);

        // Create button callbacks
        this.buttonActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this,
                        com.example.extstudent.assignmentthree.MainActivity.class);
                startActivity(intent);
            }
        });

        this.buttonActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this,
                        com.example.extstudent.assignmentthree.ActivityThree.class);
                startActivity(intent);
            }
        });
    }
}