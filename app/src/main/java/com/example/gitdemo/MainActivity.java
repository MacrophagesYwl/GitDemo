package com.example.gitdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.TextView;

import java.security.Key;

public class MainActivity extends AppCompatActivity {
    private static String NUMBER = "number";
    private int number = 0;
    private Button mButtonAdd, mButtonSud;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonAdd = findViewById(R.id.buttonAdd);
        mTextView = findViewById(R.id.textView);
        mButtonSud = findViewById(R.id.buttonSub);

        number = savedInstanceState != null ? savedInstanceState.getInt(NUMBER):0;


        mTextView.setText(String.valueOf(number));
        mButtonAdd.setOnClickListener(v -> mTextView.setText(String.valueOf(++number)));
        mButtonSud.setOnClickListener(v -> mTextView.setText(String.valueOf(--number)));

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(NUMBER,number);
    }
}