package com.company.Arrays;

public class Arrays_28_Smallest_subarray_with_sum_greater_than_x {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 0, 19};
        int n=arr.length;
        int x=51;

        System.out.println(smallest_Subarray(arr,n,x));
    }

    static int smallest_Subarray(int[] arr,int n,int x) {
        int l = 0;
        int min = Integer.MAX_VALUE;

        int start = 0;
        int end = 0;
        int sum=0;
        while (end < n) {
            while (sum <= x && end < n) {
                sum += arr[end];
                end++;
            }
            while (sum > x && start < n) {
                min = Math.min(min, end - start);
                sum -= arr[start];
                start++;
            }
        }
        if(min>n){
            return min;
        }
        return min;
    }
}
