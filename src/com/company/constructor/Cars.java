package com.company.constructor;

public class Cars {
    int id;
    String name;

    // constructor overloading.
    Cars() {    // <- no args constructor.
        // do some stuff...
        System.out.println(id + " " + name);
    }

    void show() {
        System.out.println(id + " " + name);
    }

    // parametrized constructor.
    Cars(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // copy constructor.
    Cars(Cars c) {
        id = c.id;
        name = c.name;
    }

    void disp() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Cars cars = new Cars();   // <- if no constructor used, then default constructor invoked.
        cars.show();
        Cars cars1 = new Cars(1, "Tarush");  // <- parameterized constructor.
        cars1.disp();
        Cars cars2 = new Cars(3, "Tushar");
        Cars cars3 = new Cars(cars2);
        cars2.disp();
        cars3.disp();

        // copy data without constructor.
        Cars cars4 = new Cars(4, "Ajay");
        Cars cars5 = new Cars();

        cars5.id = cars4.id;
        cars5.name = cars4.name;
        cars4.disp();
        cars5.disp();
    }

}
