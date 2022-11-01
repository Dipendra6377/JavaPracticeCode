package com.company.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Arrays_07_Third_Largest_element {
    public static void main(String[] args) {
        int []arr={4,2,3,1,5};
        int n=arr.length;

        System.out.println(third(arr,n));
    }
    static int third(int[] arr,int n){
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
            else{
                map.put(arr[i],map.get(arr[i]) );
            }
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])+1==n-2){
                return arr[i];
            }
        }
        return -1;
    }
}
