package com.company.Arrays;

import java.util.Arrays;

public class Arrays_23_Two_Pairs {
    public static void main(String[] args) {
        int[] arr={4,1,8,6,45,10};
        int n= arr.length;
        int x=16;

        System.out.println(Pairs(arr,n,x));
    }

    static int Pairs(int[] arr,int n,int x){
        Arrays.sort(arr);
        int i=0;int j=n-1;

        while(i<j){
            if(arr[i]+arr[j]==x){
                return 1;
            }
            if(arr[i]+arr[j]>x){
                j--;
            }
            else{
                i++;
            }
        }
        return -1;
    }

}
