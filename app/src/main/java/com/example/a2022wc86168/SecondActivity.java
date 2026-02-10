package com.example.a2022wc86168;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvEmail_VP;
    Button btnEmail_VP, btnBack_VP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvEmail_VP = findViewById(R.id.tvEmail_VP);
        btnEmail_VP = findViewById(R.id.btnEmail_VP);
        btnBack_VP = findViewById(R.id.btnBack_VP);

        btnEmail_VP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEmail_VP.setText("vinit@example.com");
            }
        });

        btnBack_VP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
