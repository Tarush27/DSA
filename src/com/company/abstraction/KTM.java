package com.company.abstraction;

public class KTM extends Bike{
    @Override
    void run() {
        System.out.println("bike runs");
    }

    public static void main(String[] args) {
        Bike b = new KTM();  // factory method returns the instance of ktm class.
        b.run();
        gear();
    }
}
