package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumber {
    public static int getSecondSmallestNumber(int a[]){
        Arrays.sort(a);
        return a[1];
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter array elements : ");
        for(int i = 0;i<n;i++){
            a[i] = s.nextInt();
        }
        System.out.println("Second Smallest element is : " + getSecondSmallestNumber(a));
    }
}
