package com.company;

import java.util.Scanner;

public class ArrayLeftShift {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i <= a.length-1;i++){
            a[i] = s.nextInt();
        }
        System.out.println("enter the no. of rotations : ");
        int n1 = s.nextInt();

        for(int i=0;i<n1;i++){
            int temp,j=0;
            temp = a[0];
            for(j=0;j < a.length-1;j++){
                a[j] = a[j+1];
            }
            a[j] = temp;
        }
        System.out.println("Resulting array is : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
