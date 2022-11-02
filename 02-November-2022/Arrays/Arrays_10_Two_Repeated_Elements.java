package com.company.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays_10_Two_Repeated_Elements {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,3,4};
        int n=4;

        System.out.println(repeat_Element(arr,n));
    }
    static HashSet<Integer> repeat_Element(int[] arr,int n){
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n+2;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i], map.get(arr[i])+1 );
            }
        }
        for (int x:arr){
            if(map.get(x)==2){
                set.add(x);
            }
        }
        return set;
    }
}
