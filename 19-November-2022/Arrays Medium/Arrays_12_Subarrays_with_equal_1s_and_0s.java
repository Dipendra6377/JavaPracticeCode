package com.company.Arrays_Medium_Level;

import java.util.HashMap;

public class Arrays_12_Subarrays_with_equal_1s_and_0s {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,1,1};
        int n=arr.length;

        System.out.println(equal(arr,n));
    }
    static int equal(int[] arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                arr[i]=-1;
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                count++;
            }

            if(!map.containsKey(sum)){
                map.put(sum,1);
            }
            else {
                count+=map.get(sum);
                map.put(sum, map.get(sum)+1);
            }
        }
        return count;
    }
}
