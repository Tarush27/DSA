package assignments;

import java.util.Scanner;

public class SingleMissingElement {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        /*System.out.print("enter the size : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements : ");
        for (int i = 0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        int sum = 0;
        for (int i = 0;i<n-1;i++)
        {
            sum = sum + a[i];
        }
        int sum1 = n * (n+1) / 2;
        System.out.println("Missing element is : " +(sum1 - sum));
         */
        System.out.print("enter the size : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements : ");
        for (int i = 0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("enter the lower element : ");
        int l = s.nextInt();
        System.out.print("enter the higher element : ");
        int h = s.nextInt();
        int diff = l-0;
        for (int i = 0;i<n-1;i++)
        {
            if (a[i] - i != diff)
            {
                System.out.println("Missing element is : " + (i+diff));
                break;
            }
        }
    }
}
