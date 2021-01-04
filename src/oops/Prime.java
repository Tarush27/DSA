package oops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n > 0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
        for(int i = 2;i*i<=n;i++)
        {
            if(n%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(n < 2) isPrime = false;
        System.out.println("isPrime " + isPrime);
    }
}
