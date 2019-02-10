package com.example.extstudent.assignmentthree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityThree extends AppCompatActivity {

    private Button buttonActivity1 = null;
    private Button buttonActivity2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        // Initialize widgets
        this.buttonActivity1 = (Button)findViewById(R.id.buttonActivity1);
        this.buttonActivity2 = (Button)findViewById(R.id.buttonActivity2);

        // Create button callbacks
        this.buttonActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityThree.this,
                        com.example.extstudent.assignmentthree.MainActivity.class);
                startActivity(intent);
            }
        });

        this.buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityThree.this,
                        com.example.extstudent.assignmentthree.ActivityTwo.class);
                startActivity(intent);
            }
        });
    }
}