package com.company.useOfStaticKeyword;

public class Count {
    static int newCount = 0; // static variable
    int count = 0;  // instance variable
    Count(){
        count++;
        System.out.println(count);
        newCount++;
        System.out.println(newCount);
    }
    public static void main(String ...args){
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        Count c4 = new Count();
        Count c5 = new Count();
        System.out.println("---");
        Count c6 = new Count();

    }
}
