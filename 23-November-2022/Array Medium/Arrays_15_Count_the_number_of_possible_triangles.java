package com.company.Arrays_Medium_Level;

import java.util.Arrays;

public class Arrays_15_Count_the_number_of_possible_triangles {
    public static void main(String[] args) {
        int[] arr={6, 4, 9, 7, 8};
        int n=arr.length;

        System.out.println(possible_triangle(arr,n));
    }
    static int possible_triangle(int[] arr,int n){
        int count=0;

        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            int k=i-1;
            int j=0;

            while(j<k){
                if(arr[j]+arr[k]>arr[i]){
                    count+=k-j;
                    k--;
                }
                else
                    j++;
            }
        }
        return count;
    }
}
