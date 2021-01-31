package com.company;

import java.util.Scanner;

public class ArrayRightShift {
    public static void main(String[] agrs){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i <= a.length-1;i++){
            a[i] = s.nextInt();
        }
        System.out.println("enter number of rotations : ");
        int r = s.nextInt();

        for(int i = 0; i < r; i++){
            int j,last;
            last = a[a.length-1];
            for(j = a.length-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0] = last;
        }
        System.out.println("Resulting array is : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
