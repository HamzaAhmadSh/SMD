package com.example.hamza.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickConstraint(View view) {
        Intent i = new Intent(this, SignUpConstraint.class);
        startActivity(i);
    }

    public void onClickRelative(View view) {
        Intent i = new Intent(this, SignUpRelative.class);
        startActivity(i);
    }
}
