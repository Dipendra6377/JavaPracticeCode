package com.company.Arrays_Medium_Level;

import java.util.Arrays;

public class Arrays_13_Smallest_Positive_Integer_that_can_not_be_represented_as_Sum {
    public static void main(String[] args) {
        int[] arr={1, 10, 3, 11, 6, 15};
        int n=arr.length;

        System.out.println(smallest_pos_int(arr,n));
    }
    static int smallest_pos_int(int[] arr,int n){
        int target=1;
        int res=0;

        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            if(arr[i]<=target){
                res=arr[i];
                target=res+1;
            }
            else
                return target;
        }
        return target;
    }
}
