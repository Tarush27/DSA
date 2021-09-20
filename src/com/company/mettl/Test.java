package com.company.mettl;

public class Test {
    public static void main(String ...args){
        String str = "Hello world is the basic program to start with";
        String replace = "Hello";
        String replaceTo = "Hey";
        int pos = str.indexOf(replace);
        int len = replace.length();
        String output = str.substring(0,pos) + replaceTo + str.substring(pos + len);
        System.out.println(output);
    }
}
