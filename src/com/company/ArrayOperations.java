package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static boolean isSorted(int a[])
    {
        int n = a.length;
        for (int i = 0;i<n-1;i++)
        {
            if (a[i] > a[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
       /* Scanner s = new Scanner(System.in);
        int a[] = {4,3,2,1};
        int n = a.length;
        int b[] = new int[n];
        for (int i = n-1,j=0;i>=0;i--,j++)
        {
            b[j] = a[i];
        }
        for (int i = 0;i< b.length;i++)
        {
            a[i] = b[i];
        }
        System.out.println("resultant array is : ");
        for (int i = 0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        */

        /*int a[] = {5,4,3,2,1};
        for (int i=0,j=a.length-1;i<j;i++,j--)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println("Reversed array is : ");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
         */


        // array input
       /* int c[] = {6,3,8,5,9};
        // number of times the array is to be rotated
        int n = 2;
        System.out.print("Original Array is : ");
        for (int i = 0;i< c.length;i++)
        {
            System.out.println(c[i] + " ");
        }
        for (int i = 0;i<n;i++)
        {
            int j;
            int temp = c[0];
            for (j = 0;j< c.length-1;j++)
            {
                c[j] = c[j+1];
            }
            c[j] = temp;
        }
        System.out.println("Array after left rotation is : ");
        for (int i = 0;i< c.length;i++)
        {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        */
        /*int d[] = {6,3,8,5,9};
        int n = 2;
        System.out.print("Original Array is : ");
        for (int i = 0;i< d.length;i++)
        {
            System.out.print(d[i] + " ");
        }
        for (int i = 0;i<n;i++)
        {
            int j;
            int temp = d[d.length-1];
            for (j = d.length-1;j>0;j--)
            {
                d[j] = d[j-1];
            }
            d[0] = temp;
        }
        System.out.println("Array after right rotation is : ");
        for (int i = 0;i< d.length;i++)
        {
            System.out.print(d[i] + " ");
        }
        System.out.println();
         */
        Scanner s = new Scanner(System.in);
        System.out.print("enter size : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.print("enter elements : ");
        for (int i = 0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println(isSorted(a));
    }
}
