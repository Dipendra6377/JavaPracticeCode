package com.company.Revision;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_03_leader_in_array {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int n=arr.length;

        ArrayList<Integer> res= oh_leader_chan(arr,n);

        for(int i=0;i< res.size();i++){
            System.out.print(res.get(i) + " ");
        }
    }
    static ArrayList<Integer> oh_leader_chan(int[] arr, int n){
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(max);
            }

        }
        Collections.reverse(list);
        return list;
    }
}
