package com.example.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int number = 0;
    private Button mButtonAdd;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonAdd = findViewById(R.id.buttonAdd);
        mTextView = findViewById(R.id.textView);

        mTextView.setText(String.valueOf(number));
        mButtonAdd.setOnClickListener(v ->{
            mTextView.setText(String.valueOf(++number));
        });
    }
}