package com.company.Revision;

public class Arrays_07_Peak_Element_O_logn {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,5};
        int n=arr.length;
        System.out.println(peak02(arr,n));
    }

    static int peak02(int[] arr,int n){
        int i=0;
        int j=n-1;

        while(i<j){
            int mid=(i+j)/2;
            if(arr[mid]>arr[mid+1])
                i=mid;

            else
                j=mid+1;
        }
        return i;
    }

}
