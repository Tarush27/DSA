package oops.constructor;

public class Bike {
    int id;
    String name;
    int roll;
    Bike(int i,String n){
        id = i;
        name = n;
    }
    Bike(int i,String n,int r){
        id = i;
        name = n;
        roll = r;
    }
    void show(){
        System.out.println(id + " " + name + " " + roll);
    }
    public static void main(String[] args){
        Bike b = new Bike(10,"Tarush");
        Bike b1 = new Bike(20,"Tushar");
        Bike b2 = new Bike(20,"Tushar",2);
        b.show();
        b1.show();
        b2.show();
    }
}
