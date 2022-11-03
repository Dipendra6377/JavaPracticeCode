package com.company.Arrays;

public class Arrays_20_Transition_Point {
    public static void main(String[] args) {
        int arr[] ={0,1,1,1,1,1};
        int n=arr.length;

        System.out.println(Point(arr,n));
    }
    static int Point(int[] arr,int n){
        int l=0;
        int h=n-1;
        if(arr[0]==1){
            return 0;
        }

        while(l<h){
            int mid=(l+h)/2;

            if(mid<n-1 && arr[mid]==0 && arr[mid+1]==1){
                return mid+1;
            }
            if(mid>0 && arr[mid]==1 && arr[mid-1]==0){
                return mid;
            }

            else if(arr[mid]==0){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}
