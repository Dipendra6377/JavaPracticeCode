package com.company.Revision;

import java.util.HashMap;
import java.util.HashSet;

public class Arrays_14_key_pair_optimization {
    public static void main(String[] args) {
        int[] arr={1, 4, 45, 6, 10, 8};
        int n=arr.length;
        int k=10;

        System.out.println(key(arr,n,k));
    }
    static boolean key(int[] arr,int n,int k){
        HashSet<Integer> map=new HashSet<>();

        for(int i=0;i<n;i++){
            int temp=k-arr[i];

            if(map.contains(temp))
                return true;

            map.add(arr[i]);
        }
        return false;
    }
}
