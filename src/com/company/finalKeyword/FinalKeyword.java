package com.company.finalKeyword;


// final class, variable and method.
class FinalKeyword {
    final int speedLimit;

    FinalKeyword() {
        speedLimit = 465;    // <- value of blank final variable initialized inside constructor.
        System.out.println(speedLimit);
    }

    final void run() {
        System.out.println("runs");
    }

    public static void main(String[] args) {
        new FinalKeyword();
    }
}

class Fk extends FinalKeyword {
    static final String name;
    static{
        name = "abc";    // <- static final variable initialized.
    }
    int cube(final int n){
        return n;
    }
    public static void main(String[] args) {
        new Fk().run();
        System.out.println(Fk.name);
        Fk fk = new Fk();
        System.out.println(fk.cube(5));
    }
}

