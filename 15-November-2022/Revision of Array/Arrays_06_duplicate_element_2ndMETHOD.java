package com.company.Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Arrays_06_duplicate_element_2ndMETHOD {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2};
        int n=arr.length;

        ArrayList<Integer> res=duplicate2(arr,n);
        for (int i=0;i< res.size();i++){
            System.out.print(res.get(i) + " ");
        }
    }
    static ArrayList<Integer> duplicate2(int[] arr,int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] count=new int[n];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        for(int i=0;i<n;i++){
            if(count[i]>1){
                list.add(i);
            }
        }
        if(list.size()==0)
            list.add(-1);

        return list;
    }
}
