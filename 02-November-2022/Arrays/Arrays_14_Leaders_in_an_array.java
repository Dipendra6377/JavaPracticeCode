package com.company.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_14_Leaders_in_an_array {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int n=arr.length;

        ArrayList<Integer> res=new ArrayList<>();
        res =Leader(arr,n);

        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
    static ArrayList<Integer> Leader(int[] arr,int n){
        ArrayList<Integer> ans=new ArrayList<>();

        int max=Integer.MIN_VALUE;

        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){

                max=Math.max(max,arr[i]);
                ans.add(max);
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        Collections.reverse(ans);
        return ans;

    }
}
