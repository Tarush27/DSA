package apisero;

public class ArrayLeftShift {
    public static void main(String ...args){
        int []a = {1,2,3,4,5};
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        int d =3;
        for (int i = 0;i<d;i++){
            int temp,i1 = 0;
            temp = a[0];
            for (i1=0;i1< a.length-1;i1++){
                a[i1] = a[i1+1];
            }
            a[i1] = temp;
        }
        for (int i = 0;i< a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
