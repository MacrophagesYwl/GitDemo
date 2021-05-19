package com.example.gitdemo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

        mTextView.setText(String.valueOf(number));
        mButtonAdd.setOnClickListener(v -> mTextView.setText(String.valueOf(++number)));
        mButtonSud.setOnClickListener(v -> mTextView.setText(String.valueOf(--number)));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.zero:
                mTextView.setText(String.valueOf(number = 0));
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(NUMBER, number);
    }
}