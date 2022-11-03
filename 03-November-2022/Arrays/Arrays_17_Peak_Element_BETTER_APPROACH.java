package com.company.Arrays;


// Time complexity O(N)
public class Arrays_17_Peak_Element_BETTER_APPROACH {
    public static void main(String[] args) {
        int arr[] = {1,13};
        int n=arr.length;

        System.out.println(Peak(arr,n));
    }
    static int Peak(int [] arr,int n){
        int l=0;int h=n-1;

        while(l<=h){
            int mid=(l+h)>>1;

            if((mid==0 || arr[mid]>=arr[mid-1]) && ((mid==n-1) || arr[mid]>=arr[mid+1])){
                return mid;
            }
            if(mid>0 &&arr[mid]<arr[mid-1] ){
                h=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return -1;
    }
}
