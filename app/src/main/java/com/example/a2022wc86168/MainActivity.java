package com.example.a2022wc86168;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay_VP;
    Button btnName_VP, btnNext_VP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay_VP = findViewById(R.id.tvDisplay_VP);
        btnName_VP = findViewById(R.id.btnName_VP);
        btnNext_VP = findViewById(R.id.btnNext_VP);

        btnName_VP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay_VP.setText("Name: Vinit Pandey");
            }
        });

        btnNext_VP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
