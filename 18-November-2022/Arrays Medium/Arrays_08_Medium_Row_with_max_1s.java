package com.company.Arrays_Medium_Level;

import java.util.Scanner;

public class Arrays_08_Medium_Row_with_max_1s {
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
        //      BRUTE FORCE APPROACH  TIME COMPLEXITY 0(M*N)
        //      OPTIMIZATION O[M+N]
        int count=0;
        int ans=-1;
        int max=-1;
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                if(arr[i][j]==1){
                    count++;
                }
            }
            if(max<count){
                max=count;
                ans=i;
            }
            count=0;
        }
        return ans;
    }
}
