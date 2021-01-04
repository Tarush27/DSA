package oops;

public class TableFrom1To20 {
    public static void main(String[] args)
    {
        for (int i=1;i<=10;i++)
        {
            int tableOf = i;
            for (int j=1;j<=20;j++)
            {
                System.out.println(tableOf * j + " ");
            }
        }
        System.out.println();
    }
}
