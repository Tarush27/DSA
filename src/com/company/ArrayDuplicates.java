package com.company;

import java.util.Scanner;

public class ArrayDuplicates {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements : ");
        for(int i = 0;i<n;i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(a[i] == a[j]){
                    System.out.println("Duplicates are " + a[j] + " ");
                }
            }
        }
    }
}
