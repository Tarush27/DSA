package com.company.abstraction;

abstract class Bike {
    abstract void run();

    public Bike() {
        System.out.println("bike is created");
    }

    public static void gear(){
        System.out.println("gear changed");
    }
}
