package com.company.aic;

public class AnonymousDemo {
    public static void main(String[] args) {
        Age age = () -> System.out.println(Age.x);
        age.getAge();
    }
}
