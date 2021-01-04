package com.company;

import java.util.Scanner;

public class ArrayFrequency {
    public static void main(String[] args){
        int a[] = new int[]{1,2,2,3,3,4,5};
        int f[] = new int[a.length];
        int v = -1;
        for(int i = 0;i< a.length;i++){
            int c = 1;
            for (int j = i+1;j<a.length;j++){
                if (a[i] == a[j]){
                    c++;
                    f[j] = v;
                }
            }
            if(f[i] != v){
                f[i] = c;
            }
        }
        System.out.println("Element | Frequency");
        for (int i=0;i<f.length;i++){
            if(f[i] != v){
                System.out.println(" " + a[i] + " " + f[i]);
            }
        }
    }
}
