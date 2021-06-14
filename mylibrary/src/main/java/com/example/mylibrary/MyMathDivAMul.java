package com.example.mylibrary;

public class MyMathDivAMul {

    public static int division(int a, int b){

        if(b==0){
            throw new IllegalArgumentException("Div by zero error");
        }

        return a/b;
    }

    public static int multi(int a, int b){
        return a*b;
    }

}
