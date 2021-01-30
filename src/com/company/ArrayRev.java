package com.company;

import java.util.Scanner;

public class ArrayRev {

    public static void reverse1(int a[],int b[]){
        int i = 0,j=0;
        for(i= a.length-1,j=0;i>=0;i--)
        {
            b[j] = a[i];
            j++;
        }
        for(i=0;i <= a.length-1;i++){
            a[i] = b[i];
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        System.out.println("Enter the array elements in A: ");
        for(int i = 0;i<n;i++){
            A[i] = s.nextInt();
        }
        reverse1(A,B);
        System.out.println("Resulting array B is : ");
        for (int i=0;i<n;i++){
            System.out.print(B[i] + " ");
        }
    }
}
