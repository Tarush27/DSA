package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int i,n;
        // user input
        System.out.println("enter the no. of elements to enter in the array : ");
        n = s.nextInt();
        int[] A = new int[n];
        System.out.println("enter the array elements");
        for (i=0;i<n;i++) {
            A[i] = s.nextInt();
        }
        // user input of key to be searched
        int key = 0,flag=0;
        System.out.print("enter the key element to be found :");
        key = s.nextInt();
        // code for linear search
        for (i=0;i< A.length;i++)
        {
            if (key == A[i])
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if (flag == 1)
        {
            System.out.println(key + " found at index " + i);
        }
        else
        {
            System.out.println("key not found");
        }
    }
}
