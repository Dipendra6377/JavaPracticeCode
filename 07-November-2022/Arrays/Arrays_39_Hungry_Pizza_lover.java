package com.company.Arrays;

import java.util.ArrayList;
import java.util.Collections;

class pair implements Comparable<pair>{
    int a;
    int b;
    public pair(int a,int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public int compareTo(pair o) {
        if(this.a==o.a){
            return 0;
        }
        else if(this.a<o.a){
            return -1;
        }
        else {
            return 1;
        }
    }
}
public class Arrays_39_Hungry_Pizza_lover {
    public static void main(String[] args) {

        int n=5;
        int[][] arr=new int[n][2];
        arr[0][0]=4;  arr[0][1]=1;
        arr[1][0]=6;  arr[1][1]=2;
        arr[2][0]=7;  arr[2][1]=6;
        arr[3][0]=8;  arr[3][1]=1;
        arr[4][0]=1;  arr[4][1]=3;

        for(int i=0;i<n;i++){
            System.out.print("(" + arr[i][0] + "," + arr[i][1] + ")");
        }
        ArrayList<Integer> res=permute(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(res.get(i) + " ");
        }
    }
    public static ArrayList<Integer> permute(int[][] arr,int n){
        ArrayList<pair> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(new pair((arr[i][0]+arr[i][1]),i+1));
        }

        Collections.sort(list);
        System.out.println();
        for(pair i:list){
            ans.add(i.b);
        }
        return ans;
    }
}
