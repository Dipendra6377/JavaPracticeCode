package com.company.Arrays;

import java.util.ArrayList;

public class Arrays_32_plus_one_Work_for_EVERYCASE {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(9);arr.add(9);

        int size=arr.size();

        ArrayList<Integer> res=plus(arr,size);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i) + " ");
        }

    }
    static ArrayList<Integer> plus(ArrayList<Integer> arr,int n){
        ArrayList<Integer> ans=new ArrayList<>();

        if(arr.get(n-1)<9){
            arr.set(n-1,arr.get(n-1)+1);
            return arr;
        }

        int i=n-1;

        while(i>=0){
            if(arr.get(i)==9){
                arr.set(i,0);
                if(i-1==-1){
                    System.out.println("hello");
                    arr.add(0,1);
                    break;
                }

                if(arr.get(i-1)!=9){
                    System.out.println(i-1);
                    arr.set(i-1,arr.get(i-1)+1);
                    break;
                }
                else {
                    i--;
                }

            }

        }

        return arr;
    }
}
