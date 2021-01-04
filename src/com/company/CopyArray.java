package com.company;

public class CopyArray {
    public static void main(String[] args){
        char[] a = {'a','b','c','d','e','f'};
        char[] b = new char[5];
        System.arraycopy(a,1,b,0,5);//copying the contents of one array to another
        System.out.print(String.valueOf(b));
    }
}
