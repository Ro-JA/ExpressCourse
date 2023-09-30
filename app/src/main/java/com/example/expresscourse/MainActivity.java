package com.example.expresscourse;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private TextView mInfoTextView;
    private EditText mInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mInfoTextView = findViewById(R.id.textView);
        mInputEditText = findViewById(R.id.editText);
    }

    final String TAG = "ExpresCourse";

    public void onClick(View view) {
        int x = 3;
        x *= x;
        Log.i(TAG, Integer.toString(x));
        x *= x;
        Log.i(TAG, Integer.toString(x));
        x *= x;
        Log.i(TAG, Integer.toString(x));
        x *= x;
        Log.i(TAG, Integer.toString(x));
        x *= x;
        Log.i(TAG, Integer.toString(x));
        x *= x;
        Log.i(TAG, Integer.toString(x));
        x *= x;
        Log.i(TAG, Integer.toString(x));
        x *= x;
        Log.i(TAG, Integer.toString(x));
        x *= x;
        Log.i(TAG, Integer.toString(x));
        x *= x;
        Log.i(TAG, Integer.toString(x));

    }
}