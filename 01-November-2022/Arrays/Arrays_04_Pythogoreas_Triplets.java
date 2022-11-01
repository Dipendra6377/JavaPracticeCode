package com.company.Arrays;

import java.util.HashMap;

public class Arrays_04_Pythogoreas_Triplets {
    public static void main(String[] args) {
        int[] arr ={12,3,5,2,13};
        int n= arr.length;

        System.out.println(Triplets(arr,n));
    }
    static boolean Triplets(int arr[],int n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int sq=(int)Math.pow(arr[i],2);

            if(!map.containsKey(sq)){
                map.put(sq,1);
            }
            else {
                map.put(sq, map.get(sq)+1);
            }
        }

        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int a=(int)Math.pow(arr[i],2);
                int b=(int)Math.pow(arr[j],2);
                int sum=a+b;

                if(map.containsKey(sum)){
                    return true;
                }
            }
        }
        return false;
    }
}
