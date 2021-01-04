package oops.patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number = 1;
        for (int i=0;i<=n;i++)
        {

            for (int j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for (int j=0;j<i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
