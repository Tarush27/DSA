package oops;

class vehicle
{
    int wheels;
    int headLights;


    vehicle(int wheels){
        this.wheels = wheels;
        headLights = 2;
    }
}
public class MyConstructor {

    MyConstructor(){
        System.out.println("hello");

    }
    public static void main(String[] args)
    {
        vehicle car = new vehicle(4);
        System.out.println(car.wheels);

    }
}
