package com.company.typecasting;

public class SuperSubCast {
    public static void main(String[] args){
        Person p = new Person();
        Student s = new Student();
        GradStudent gs = new GradStudent();

        Person p1 = new Student();
        Person p2 = new GradStudent();

        Student s1 = new GradStudent();
//        Student s2 = (Student) new Person();
        Person p3 = new Student();
        Student s4 = (Student)p3;
        System.out.println(s4);

//        GradStudent gs1 = new Person();
//        GradStudent gs2 = new Student();
    }
}
