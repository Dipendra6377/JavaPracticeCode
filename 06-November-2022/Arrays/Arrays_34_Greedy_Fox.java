package com.company.Arrays;
//There are N coins placed on the road where arr[i] is the denomination of ith coin.
// A Fox is looking to collect some of these coins.
// The fox is very greedy and follows a weird pattern of collecting coins:
// the fox collects coins in only increasing order of their denomination since it always
// craves for more money and all the coins it collects are contiguous.
// The fox wants to maximize the amount of money it collects.


//Unfortunately, the Fox is greedy but not intelligent enough to find the solution and asks you for help.
// Find the maximum amount of money the fox can collect.


public class Arrays_34_Greedy_Fox {
    public static void main(String[] args) {

        int[] arr={2, 1, 4, 7, 3, 6};
        int n=arr.length;


        System.out.println(greedy(arr,n));
    }
    static int greedy(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        int sum=arr[0];
        for (int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                sum+=arr[i];
            }
            else{
                max=Math.max(sum,max);
                sum=arr[i];
            }
        }//fuck remind this ok you fucker
        return Math.max(sum,max);  //its important how??  {561,358,461} if used only max it will show output as 561 but max is 819.
    }
}


//Input:
//N=6
//arr[] = {2, 1, 4, 7, 3, 6}
//Output: 12
//Explanation: Contiguous Increasing subarray
//             {1, 4, 7} = 12.