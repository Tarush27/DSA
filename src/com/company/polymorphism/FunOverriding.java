package com.company.polymorphism;

class Override{
    void run(){
        System.out.println("its a vehicle");
    }
}
class FunOverriding extends Override {
    void run(){
        System.out.println("its a fun");
    }
    public static void main(String[] args) {
        FunOverriding funOverriding = new FunOverriding();
        funOverriding.run();

    }
}
