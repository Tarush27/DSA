package com.company.polymorphism;

class Animal {}
class Dog3 extends Animal {
    static void method(Animal a){
        if (a instanceof Dog3){   // <- down casting using instance of operator.
            Dog3 d = (Dog3) a;
            System.out.println("yes");
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog3();
        Dog3.method(a);
    }
}


