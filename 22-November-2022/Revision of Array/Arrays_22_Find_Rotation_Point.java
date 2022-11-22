package com.company.Revision;

public class Arrays_22_Find_Rotation_Point {
    public static void main(String[] args) {
        int[] arr={5,1,2,3,4};
        int n=arr.length;

        System.out.println(rotation(arr,n));
    }

    static int rotation(int[] arr,int n){
        int i=0;
        int j=n-1;

        while(i<=j){
            int mid=(i+j)/2;
            int prev=(mid+n-1)%n;
            int next=(mid+1)%n;
            if((arr[prev]>=arr[mid]) && arr[mid]<=arr[next]){
                return mid;
            }
            if(arr[mid]<=arr[j])
                j=mid-1;
            else if (arr[mid]>=arr[i])
                i=mid+1;
        }
        return 0;
    }
}
