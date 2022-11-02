package com.company.Arrays;

public class Arrays_08_Searching_in_an_array_where_adjacent_differ_by_at_most_k {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,6};
        int n=arr.length;
        int k=1;
        int x=6;

        System.out.println(search(arr,n,k,x));
    }
    static int search(int[] arr,int n,int k,int x){
        int i=0;
        int ans=-1;
        while(i<n){
            if(arr[i]==x){
                ans= i;
                break;
            }
            int y=Math.max(1,Math.abs(arr[i]-x)/k);
            i=i+y;

        }
        return ans;
    }
}
