package com.example.custommath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myutils.MyMathSumASub;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       int sum =  MyMathSumASub.sum(10,10);
    }
}