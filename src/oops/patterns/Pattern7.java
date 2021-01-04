package oops.patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 2*n-1;
        for (int i=0;i<r;i++)
        {
            if (i <= n-1)
            {
                for (int j=0;j<=i;j++)
                {
                    System.out.print("* ");
                }
            }
            else{
                for (int j=0;j<r-i;j++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
