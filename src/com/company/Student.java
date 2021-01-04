package com.company;

public final class Student {
    int rollNo;
    String name;
    {
        rollNo = 4;
    }
    public Student()
    {
        name="Tarush";
    }
    public final void getDesc(){
        System.out.println("Stueden name is : " + name);
    }
}
