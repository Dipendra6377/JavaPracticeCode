package com.company.Revision;

import java.util.HashMap;
import java.util.HashSet;

public class Arrays_15_Array_Subset_of_another_array {
    public static void main(String[] args) {
        int[] a={11, 1, 13, 21, 3, 7};
        int[] b={11,3,7,1,1};
        int n=a.length;
        int m=b.length;

        System.out.println(subset(a,b,n,m));
    }
    public static String subset(int[] a,int[] b,int n,int m){
        //TIME COMPLEXITY O(N) SPACE COMPLEXITY O(N)
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
            }
            else{
                map.put(a[i],map.get(a[i])+1);
            }
        }

        for(int i=0;i<m;i++){
            if(!map.containsKey(b[i]))
                return "No";

            if(map.get(b[i])>0)
                map.put(b[i],map.get(b[i])-1);

            if(map.get(b[i])==0)
                map.remove(b[i]);
        }
        return "YES";
    }
}
