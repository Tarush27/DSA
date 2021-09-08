package com.company.polymorphism;

class Bike {
    String name = "harley davidson";
    void run(){
        System.out.println("bike runs");
    }

}
class Splendor extends Bike{
    String name = "ktm";
    void run(){
        System.out.println("Splendor runs");
    }

    public static void main(String[] args) {
        Bike b = new Splendor();   // <- upcasting
        b.run();
        System.out.println(b.name);   // data members are not overridden.
        System.out.println(b instanceof Splendor);
    }
}

