package com.company.Arrays;

import java.util.HashMap;

public class Arrays_25_First_Occurence_of_Repeating_Element {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;

        System.out.println(Repeating(arr,n));
    }
    static int Repeating(int[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i+1);
            }
            else
            {
                min=Math.min(min,map.get(arr[i]));
            }
        }
        if(min==Integer.MAX_VALUE){
            min=-1;
        }
        return min;
    }
}
