package pbljlab.surprise_test1;

public class Box {
    double h,w,d;

    Box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
        v=h*w*d;
        System.out.println("Volume of cone is : ");
        return v;
    }

    public static void main(String[] args) {

        Box bc = new Box(8.5,80.3,9.6);
        System.out.println(bc.volume());

    }

}

