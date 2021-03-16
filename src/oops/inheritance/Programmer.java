package oops.inheritance;

public class Programmer extends Employee {
    int bonus = 10000;
    public static void main(String[] args){
        Programmer p = new Programmer();
        System.out.println("salary of programmer is : " + p.salary);
        System.out.println("bonus of programmer is : " + p.bonus);
    }
}
