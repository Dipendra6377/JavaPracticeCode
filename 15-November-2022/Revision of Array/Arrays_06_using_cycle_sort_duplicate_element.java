package com.company.Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Arrays_06_using_cycle_sort_duplicate_element {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2};
        int n=arr.length;

        ArrayList<Integer> res=duplicate(arr,n);
        for (int i=0;i< res.size();i++){
            System.out.print(res.get(i) + " ");
        }
    }
    public static void cyclicSort(int[] arr) {
        int i=0;
        while(i< arr.length){
            int index=arr[i];

            if(arr[i]!=arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else
                i++;
        }
    }
    static ArrayList<Integer> duplicate(int[] arr,int n){

        cyclicSort(arr);//it will put the array element in their respective indexes

//        for (int i:arr)
//            System.out.println(i);
        // new array : 3 1 2 3 2

        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<n;i++){
            if(arr[i]!=i)
                set.add(arr[i]);
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        if(list.size()==0)
            list.add(-1);

        Collections.sort(list);
        return list;
    }
}
