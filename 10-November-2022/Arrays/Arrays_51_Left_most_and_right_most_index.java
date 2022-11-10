package com.company.Arrays;

import java.util.ArrayList;

public class Arrays_51_Left_most_and_right_most_index {
    public static void main(String[] args) {
        long[] arr={1, 3, 5, 5, 5, 5, 67, 123, 125};
        long x=5;

        pairs ans=search(arr,x);

        System.out.println(ans.first +" " + ans.second);
    }
    static public pairs search(long[] v,long x){
        long leftind= getLeftIndex(v,x);
        long rightind=getRightIndex(v,x);

        return new pairs(leftind,rightind);
    }
    static long getLeftIndex(long[] arr,long x){
        long i=0;
        long j= arr.length-1;
        long start=-1;

        while(i<=j){
            long m=(i+j)/2;

            if(arr[(int)m]==x){
                start=m;
                j=m-1;
            }
            else if(arr[(int)m]<x){
                i=m+1;
            }
            else {
                j=m-1;
            }
        }
        return start;
    }
    static long getRightIndex(long[] arr,long x){
        long i=0;
        long j= arr.length-1;
        long end=-1;

        while(i<=j){
            long m=(i+j)/2;

            if(arr[(int)m]==x){
                end=m;
                i=m+1;
            }
            else if(arr[(int)m]>x){
                j=m-1;
            }
            else {
                i=m+1;
            }
        }
        return end;
    }
}
