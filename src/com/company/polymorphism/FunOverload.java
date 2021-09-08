package com.company.polymorphism;


public class FunOverload {

    // change no. of arguments.
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){    // fun add has three arguments a, b and c.
        return a + b + c;
    }

    // change data type.
    float add(float a, float b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        FunOverload fo = new FunOverload();
        System.out.println(fo.add(1.0f,2.0f));
    }
}
