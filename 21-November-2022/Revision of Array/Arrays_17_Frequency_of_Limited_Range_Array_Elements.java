package com.company.Revision;

public class Arrays_17_Frequency_of_Limited_Range_Array_Elements {
    public static void main(String[] args) {
        int[] arr={2,3,2,3,4};
        int n=arr.length;
        int p=5;

        frequency(arr,n,p);

        for (int i:arr)
            System.out.print(i+ " ");
    }

    static void frequency(int[] a,int n,int p ){
        p=p+1;

        for(int i=0;i<n;i++){
            if(a[i]%p<=n){
                a[(a[i]-1)%p]+=p;
            }
        }
        for(int i=0;i<n;i++){
            a[i]/=p;
        }
    }
}
