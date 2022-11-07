package com.company.Arrays;

import java.util.HashMap;

public class Arrays_40_Words_with_Maximum_Frequency {
    public static void main(String[] args) {
        String s="the devil in sky";
        int n=s.length();

        System.out.println(maximum_freq(s,n));
    }
    static String maximum_freq(String s,int n){
        String arr[] =s.split(" ");

        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int max=0;
        for(String val:arr){
            if(map.get(val)>max){
                max=map.get(val);
            }
        }
        String str="";
        for(String val:arr){
            if(map.get(val)==max){
                str=val;
                break;
            }
        }
        return str +" " + max;
    }
}
