package com.company.typecasting;

public class TypeCast {
    public static void main(String[] args) {
        // explicit type casting
        // double -> float -> long -> int -> char -> short -> byte
        double d = 166.66;
        long l = (long) d;
        float f = l;
        int i = (int) f;
    }
}
