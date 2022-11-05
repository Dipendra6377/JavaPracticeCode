package com.company.Arrays;

import java.util.HashMap;

public class Arrays_26_Frequencies_of_Limited_Range_Array_Elements {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};
        int n=arr.length;

        Frequency(arr,n);

        for (int x:arr){
            System.out.print(x+" ");
        }
    }
    static void Frequency(int[] arr,int n){
        //int a[]=new int[5];
        HashMap<Integer,Integer> map=new HashMap<>();


        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(i+1)){
                arr[i]=map.get(i+1);
            }
            else{
                arr[i]=0;
            }
        }
    }
}
