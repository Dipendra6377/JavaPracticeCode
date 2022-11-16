package com.company.Arrays_Medium_Level;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codechef_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int[] arr=new int[2*n];

            for(int i=0;i<2*n;i++){
                arr[i]=sc.nextInt();
            }

            HashMap<Integer,Integer> map=new HashMap<>();

            for(int j=0;j<2*n;j++){
                if(!map.containsKey(arr[j])){
                    map.put(arr[j],1 );
                }
                else{
                    map.put(arr[j],map.get(arr[j])+1);
                }
            }
            int flag=0;
            for(Map.Entry<Integer,Integer> x:map.entrySet()){
                if(x.getValue()>=3){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
