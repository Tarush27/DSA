package com.company;

public class TwoDArray {
    public static void main(String[] args){
        int r,c,i=0,j=0;
        int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
        if(i != j){
            System.out.println("Not a square matrix");
        }
        r = a.length;
        c = a[0].length;
        System.out.println("Lower Triangular Matrix & Upper Triangular Matrix : ");
        for(i = 0;i<r;i++){
            for(j=0;j<c;j++){
                if(j > i){
                    System.out.print("0 ");// lower triangular matrix
                }
                else if(i>j){
                    System.out.print("0 ");// upper triangular matrix
                }
                else{
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
