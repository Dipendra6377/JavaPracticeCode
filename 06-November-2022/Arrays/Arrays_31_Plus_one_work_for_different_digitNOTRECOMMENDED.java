package com.company.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_31_Plus_one_work_for_different_digitNOTRECOMMENDED {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);

        int n=list.size();

        plus(list,n);
    }
    static void plus(ArrayList<Integer> arr,int n){
        ArrayList<Integer> ans  = new ArrayList<>();
        int no=0;
        for(int i=0;i<n;i++){
            no+=Math.pow(10,(n-i)-1)*arr.get(i);
        }
        no=no+1;

        for(int i=0;i<n;i++){
            int num=no%10;
            ans.add(num);
            no=no/10;
        }
        Collections.sort(ans);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) +" ");
        }
    }
}
