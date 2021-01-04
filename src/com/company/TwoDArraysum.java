package com.company;

import java.util.Scanner;

public class TwoDArraysum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // taking user input for rows,columns
        System.out.println("enter dimensions");
        int r = sc.nextInt();
        int c = sc.nextInt();
        // declaring of arrays a and b
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        //user input of array a
        System.out.println("enter array a");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                 a[i][j] = sc.nextInt();
            }
        }
        // user input of array b
        System.out.println("enter array b");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        // declaration and storing sum in array d
        int d[][] = new int[r][c];
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                d[i][j] = a[i][j] + b[i][j];
            }
        }
        // printing the contents of array d
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

    }
}
