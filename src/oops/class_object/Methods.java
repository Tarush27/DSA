package oops.class_object;

public class Methods {
    public static void main(String[] args){
        Methods m = new Methods();
        m.sum(1,2);// instance method
        sum(4,5,6);// static method
    }
    static int sum(int a, int b,int c){
        int s = a+b+c;
        return s;
    }
    int sum(int a, int b){
        int s = a+b;
        return s;
    }
}
