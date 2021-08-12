package pbljmst;

import java.util.Arrays;

public class Main {
    public static void main(String ...args){
        int[] a = new int[5];
        for (int i = 5;i>0;i--){
            a[5-i] = i;
            Arrays.fill(a,1,4,8);
        }
        for (int i = 0;i<5;i++){
            System.out.print(a[i]);
        }
    }
}
