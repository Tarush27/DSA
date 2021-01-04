package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static int getThirdLargestElement(int[] a)
    {
        int n = a.length;
        int temp = 0;
        for(int i = 0; i< n; i++){
            for(int j = i+1; j< n; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[n - 3];
    }
    public static int getSecondLargestElement(int[] a)
    {
        int n = a.length;
        int temp = 0;
        for(int i = 0; i< n; i++){
            for(int j = i+1; j< n; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[n - 2];
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
        System.out.println("Third Largest element is : " + getThirdLargestElement(a));
        System.out.println("Second Largest element is : " + getSecondLargestElement(a));
    }
}
