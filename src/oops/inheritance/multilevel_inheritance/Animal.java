package oops.inheritance.multilevel_inheritance;

public class Animal {
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class Cat extends Dog{
    void mou(){
        System.out.println("cat meaus");
    }
}
class Main{
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.mou();
        cat.bark();
        cat.eat();
    }
}
