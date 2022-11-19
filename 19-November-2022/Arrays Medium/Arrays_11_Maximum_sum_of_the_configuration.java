package com.company.Arrays_Medium_Level;

public class Arrays_11_Maximum_sum_of_the_configuration {
    public static void main(String[] args) {
        int[] arr={8,3,1,2};
        int n=arr.length;

        System.out.println(confi(arr,n));
    }
    static int confi(int[] arr,int n){

        //TIME COMPLEXITY O(N)
        int sum=0;
        int sumof_0th_rotation=0;

        for(int i=0;i<n;i++){
            sumof_0th_rotation+=i*arr[i];
            sum+=arr[i];
        }
        int max=sumof_0th_rotation;
        int sumof_ith_rotationsum=sumof_0th_rotation;
        for(int i=0;i<n-1;i++){
            int s_ith=sumof_ith_rotationsum+sum-n*arr[n-1-i];

            if(s_ith>max)
                max=s_ith;

            sumof_ith_rotationsum=s_ith;
        }
        return max;
    }
}
