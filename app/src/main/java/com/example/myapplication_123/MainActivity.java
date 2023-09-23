package com.example.myapplication_123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore = (TextView) findViewById(R.id.tv_score);
        Log.e("demo","I am executed on onCreateMethod");
    }
    public void showToast(View view){
        String msg = "The current score is " + tvScore.getText().toString();
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT); // Corrected the syntax
        toast.show();
    }


    public void increaseScore(View view){
        int score = Integer.parseInt(tvScore.getText().toString());
        ++score;
        tvScore.setText(score+"");

    }
}