package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview = findViewById(R.id.TITLE);
        TextView textView2 = findViewById(R.id.textView);
        EditText plaintext = findViewById(R.id.FIRST);
        EditText plaintext2 = findViewById(R.id.SECOND);
        Button button1 = findViewById(R.id.button);
    }
}