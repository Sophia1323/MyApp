package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogIn, btnSubmit;
    private static final String TAG = "Sophia";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogIn = findViewById(R.id.btnLogIn);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(this);
        btnLogIn.setOnClickListener(this);
    }

    
    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick: ");
        Log.d(TAG, "onClick: ");
    }
}