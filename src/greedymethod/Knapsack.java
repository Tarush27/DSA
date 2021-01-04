package greedymethod;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack{

    private double weight;
    private double profit;
    private double cost;

    public Knapsack(double weight, double profit)
    {
        super();
        this.weight = weight;
        this.profit = profit;
        this.cost = new Double(profit / weight);
    }

    public double getProfit() {
        return profit;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public static void knapsack(int W[], int P[], int M, int n){
        Knapsack[] pack = new Knapsack[n];
        for (int i=0;i<n;i++){
            pack[i] = new Knapsack(W[i],P[i]);
        }
        Arrays.sort(pack, new Comparator<Knapsack>() {
            @Override
            public int compare(Knapsack knapsack, Knapsack t1) {
                return 0;
            }
        });
        int remain = M;
        double result = 0d;
        int i=0;
        boolean stop = false;
        while(!stop){
            if (pack[i].getWeight() <= remain){
                remain -= pack[i].getWeight();
                result += pack[i].getWeight();
                System.out.println("pack" + i + "weight" + pack[i].getWeight() + "profit" + pack[i].getProfit());
            }
        }
        if (pack[i].getWeight() > remain){
            i++;
        }
        if (i == n)
        {
            stop = true;
        }
        System.out.println("Total Value is : " + result);
    }
    public static void main(String[] args)
    {
        int W[] = new int[]{10,20,30,40};
        int P[] = new int[]{5,15,25,35};
        int M=15;
        int n = P.length;
        knapsack(W,P,M,n);

    }
}
