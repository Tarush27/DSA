package oops.inheritance.single_inheritance;

public class Animal {
    // base class
    void eat(){
        System.out.println("animal eats");
    }
}
class Dog extends Animal{
    // derived class
    void bark(){
        System.out.println("dog barks");
    }
}
class Main{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}