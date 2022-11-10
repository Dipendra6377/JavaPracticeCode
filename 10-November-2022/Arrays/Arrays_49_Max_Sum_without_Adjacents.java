package com.company.Arrays;

import java.util.Arrays;

public class Arrays_49_Max_Sum_without_Adjacents {
    public static void main(String[] args) {
        int[] arr={5,5,10,100,10,5};
        int n=arr.length;

        System.out.println(sum(arr,n));
    }
    static int sum(int[] arr,int n){
        int[] dp=new int[n];
        Arrays.fill(dp,-1);

        return sum_without_adjacent(arr,n-1,dp);
    }

    static int sum_without_adjacent(int[] arr,int n,int[] dp){
        if(n==0)
            return arr[0];

        if(n==-1)
            return 0;

        if(dp[n]!=-1)
            return dp[n];

        int pick=arr[n]+sum_without_adjacent(arr,n-2,dp);

        int notpick=sum_without_adjacent(arr,n-1,dp);

        return dp[n]=Math.max(pick,notpick);
    }
}
