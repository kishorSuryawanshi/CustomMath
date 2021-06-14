package com.example.myutils;

import com.example.mylibrary.MyMathDivAMul;

public class MyMathSumASub {

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int div(int a, int b){
        return MyMathDivAMul.division(a,b);
    }

    public static int mul(int a, int b){
        return MyMathDivAMul.multi(a,b);
    }

}
