package oops;

public class Person1 implements Student1,Youtuber{
    public static void main(String[] args)
    {
        Person1 ob = new Person1();
        ob.study();
        ob.videos();
    }

    @Override
    public void study() {
        System.out.println("studying");
    }

    @Override
    public void videos() {
        System.out.println("watching");
    }
}
