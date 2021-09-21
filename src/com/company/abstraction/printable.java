package com.company.abstraction;

interface printable {
    void print();
    default void hey(){
        System.out.println("sjf");
    }

    static int cube(int x){
        return x + x;
    }
}
class A6 implements printable{

    @Override
    public void print() {
        System.out.println("hello print me");
    }

    public static void main(String[] args) {
        A6 a6 = new A6();
        a6.print();
        a6.hey();
        System.out.println(printable.cube(2));
    }
}
