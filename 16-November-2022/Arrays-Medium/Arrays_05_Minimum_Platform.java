package com.company.Arrays_Medium_Level;

import java.util.Arrays;

public class Arrays_05_Minimum_Platform {
    public static void main(String[] args) {
        int[] arr={900,940,950, 1100, 1500, 1800};
        int[] dep={910, 1200, 1120, 1130, 1900, 2000};
        int n=arr.length;

        System.out.println(platform(arr,dep,n));
    }

    static int platform(int[] arr,int[] dep,int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform=1;
        int maxplatform=1;
        int pf1=1;int pf2=0;

        while(pf1<arr.length && pf2< dep.length){

            if(arr[pf1]>dep[pf2]){

                platform--;
                pf2++;
            }
            else{
                platform++;
                pf1++;
            }
            maxplatform=Math.max(platform,maxplatform);
        }
        return maxplatform;
    }
}
