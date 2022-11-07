package com.company.Arrays;
//Largest Sum Contiguous Subarray (Kadane’s Algorithm)
public class Arrays_38_Kadanes_Algorithm {
    public static void main(String[] args) {
        int[] arr={-2, -3, 4, -1, -2, 1, 5, -3};
        int n=arr.length;

        kadane(arr,n);
    }

    static void kadane(int[] arr,int n){
        int curr_sum=0;
        int prev_sum=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        int s=0;
        for(int i=0;i<n;i++){
            curr_sum+=arr[i];

            if(curr_sum>prev_sum){
                prev_sum=curr_sum;
                start=s;
                end=i;
            }
            else if(curr_sum<0){
                curr_sum=0;
                s=i+1;
            }
        }
        System.out.println("total largest sum of contiguous element :-" + prev_sum);
        System.out.println("starting index :-" +start);
        System.out.println("ending index :-" +end);
    }
}
