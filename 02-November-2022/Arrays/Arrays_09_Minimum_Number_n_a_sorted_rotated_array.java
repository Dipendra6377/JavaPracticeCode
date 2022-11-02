package com.company.Arrays;

public class Arrays_09_Minimum_Number_n_a_sorted_rotated_array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        int n = arr.length;
        int l=0;
        int h =n-1;

        System.out.println(minimum(arr,n,l,h));
    }
    static int minimum(int[] arr,int n,int l ,int h){
         while(l<h){
             int mid=(l+h)/2;
             if(arr[mid]<arr[mid-1]&& mid>l){
                 return arr[mid];
             }

             else if(mid>0 && arr[mid]>arr[mid+1] && mid<h){
                 return arr[mid+1];
             }

             if(arr[h]>arr[mid]){
                 h=mid-1;
             }
             else
                 l=mid+1;
         }
         return arr[0];
    }
}
