package com.company.abstraction;

public class M extends B {
    @Override
    public void a() {
        System.out.println("am a");
    }

    @Override
    public void b() {
        System.out.println("am b");
    }

    @Override
    public void d() {
        System.out.println("am d");
    }

    public static void main(String[] args) {
        A a1 = new M();
        a1.a();
        a1.b();
        a1.c();
        a1.d();
    }
}
