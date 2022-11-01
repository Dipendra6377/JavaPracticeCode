package com.company.Arrays;

import java.util.HashMap;

public class Arrays_05_First_Element_to_Occur_Ktimes {
    public static void main(String[] args) {
        int arr[] = {1,7,4,5,4,7,8};
        int n= arr.length;
        int k=2;

        System.out.println(OccurKtimes(arr,n,k));
    }
    static int OccurKtimes(int[] arr,int n,int k ){
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1 );
            }
            if(map.get(arr[i])==k){
                return arr[i];
            }
        }

        return -1;
    }
}
