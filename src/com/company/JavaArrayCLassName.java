package com.company;

public class JavaArrayCLassName {
    public static void main(String[] args){
        int a[] = {3,4,5};
        Class c = a.getClass();// to fetch the class of the array
        var name = c.getName();// to fetch the name of the class
        System.out.print(name);
    }
}
