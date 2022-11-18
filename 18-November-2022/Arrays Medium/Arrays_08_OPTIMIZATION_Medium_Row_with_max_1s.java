package com.company.Arrays_Medium_Level;

import java.util.Scanner;

public class Arrays_08_OPTIMIZATION_Medium_Row_with_max_1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];

        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }
//        for (int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(row_With_max(arr,n,m));
    }
    static int row_With_max(int[][] arr,int n,int m){
        //To solve in O(N + M) start from the top right corner of the matrix and keep track of the index of the row which has maximum 1s.
        //Go left if you encounter 1
        //Go down if you encounter 0
        //Stop when you reach the last row or first column.


        //TIME COMPLEXITY  O(M+N)
        int row=-1;
        int column=m-1;

        for(int i=0;i<n;i++){
            for(int j=column;j>=0;j--){
                if(arr[i][j]==1){

                    row=i;

                    column--;
                }
                else
                    break;
            }
        }
        return row;
    }
}
