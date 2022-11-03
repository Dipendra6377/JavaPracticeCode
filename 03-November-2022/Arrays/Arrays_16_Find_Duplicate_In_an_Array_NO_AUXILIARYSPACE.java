package com.company.Arrays;

import java.util.ArrayList;

public class Arrays_16_Find_Duplicate_In_an_Array_NO_AUXILIARYSPACE {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,3};
        int n=arr.length;

        ArrayList<Integer> res=new ArrayList<>();
        res=Duplicate(arr,n);

        for(int i=0;i< res.size();i++){
            System.out.print(res.get(i) +" ");
        }
    }
    static ArrayList<Integer> Duplicate(int[] arr,int n){
        ArrayList<Integer> ans = new ArrayList<>();


        for(int i=0;i<n;i++){
            int index=arr[i]%n;
            arr[index]+=n;
        }

        for (int i=0;i<n;i++){
            if(arr[i]/n>1){
                ans.add(i);
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;

    }
}
