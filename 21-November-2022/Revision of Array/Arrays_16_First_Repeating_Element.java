package com.company.Revision;

import java.util.HashMap;


// Time Complexity: O(n)
// Auxilliary Space: O(n)
public class Arrays_16_First_Repeating_Element {
    public static void main(String[] args) {
        int[] arr={1,5,3,4,3,5,6};
        int n=arr.length;

        System.out.println(repeating(arr,n));
    }
    static int repeating(int arr[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();

        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i+1);
            }
            else{
                min=Math.min(min,map.get(arr[i]));
            }
        }
        if(min==Integer.MAX_VALUE){
            min=-1;
        }
        return min;
    }
}
