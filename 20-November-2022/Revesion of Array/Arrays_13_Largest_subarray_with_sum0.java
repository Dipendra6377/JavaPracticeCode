package com.company.Revision;

import java.util.HashMap;

public class Arrays_13_Largest_subarray_with_sum0 {
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23};
        int n=arr.length;

        System.out.println(subarray(arr,n));
    }
    static int subarray(int[] arr,int n){
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0)
                max=i+1;

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                max=Math.max(max,i-map.get(sum));

            }
        }
        return max;
    }
}
