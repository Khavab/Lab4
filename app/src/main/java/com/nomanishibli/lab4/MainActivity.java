package com.nomanishibli.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPage1(View view) {
        setContentView(R.layout.activity_main);
    }

    public void goToPage2(View view) {
        setContentView(R.layout.activity_main2);
    }

    public void goToPage3(View view) {
        setContentView(R.layout.activity_main3);
    }

    public void goToPage4(View view) {
        setContentView(R.layout.activity_main4);
    }

    public void goToPage5(View view) {
        setContentView(R.layout.activity_main5);
    }

    public void goToPage6(View view) {
        setContentView(R.layout.activity_main6);
    }
}
