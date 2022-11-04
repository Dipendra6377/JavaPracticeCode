package com.company.Arrays;

import java.util.HashMap;

public class Arrays_22_Maximum_Subarray_With_Sum0 {
    public static void main(String[] args) {
         int[] arr={15,-2,2,-8,1,7,10,23};
         int n=arr.length;

        System.out.println(Subarray(arr,n));
    }
    static int Subarray(int[] arr,int n){
        int max=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,-1);  //{-1,1,-1,1}  as you its coreect output is 4 bit if we dont use this line its outpur will be 2
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else {
                max=Math.max(max,i-map.get(sum));
                map.put(sum,map.get(sum));
            }
        }

        return max;
    }
}
