package com.example.swapers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultTextView = findViewById(R.id.resultTextView);

        Intent intent = getIntent();
        if (intent != null) {
            String result = intent.getStringExtra("result");
            resultTextView.setText(result);
        }
    }
}
