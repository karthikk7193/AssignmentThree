package com.example.extstudent.assignmentthree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonActivity2 = null;
    private Button buttonActivity3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize widgets
        this.buttonActivity2 = (Button)findViewById(R.id.buttonActivity2);
        this.buttonActivity3 = (Button)findViewById(R.id.buttonActivity3);

        // Create button callbacks
        this.buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        com.example.extstudent.assignmentthree.ActivityTwo.class);
                startActivity(intent);
            }
        });

        this.buttonActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        com.example.extstudent.assignmentthree.ActivityThree.class);
                startActivity(intent);
            }
        });
    }
}
