package oops.patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("* ");

        for (int i=2;i<=n-1;i++)
        {
            System.out.print("* ");
            for (int k=1;k<=i-2;i++)
            {
                System.out.print(" ");
            }
        }
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}
