package com.company.Arrays;

import java.util.Arrays;

public class Arrays_45_form_a_Triangle {
    public static void main(String[] args) {
        int[] arr={5,4,3,1,2};  //sum of two side of triangle is always greater than third side
        int n=arr.length;

        System.out.println(triangle(arr,n));
    }

    static int triangle(int[] arr,int n){
        int count=0;
        Arrays.sort(arr);

        for(int i=n-1;i>=2;i--){
            int l=0;
            int r=i-1;

            while(l<r){
                if(arr[l]+arr[r]>arr[i]){
                    count+=(r-l);
                    r--;
                }
                else
                    l++;
            }
        }
        return count;
    }
}
