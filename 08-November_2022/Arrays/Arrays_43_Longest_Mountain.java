package com.company.Arrays;

public class Arrays_43_Longest_Mountain {
    public static void main(String[] args) {

        int[] arr={2,3,2,4,4,6,3,2};
        int n= arr.length;

        System.out.println(mountain(arr,n));
    }
    static int mountain(int[] arr,int n ){

        int res=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int l=i;int r=i;

                while(l>0 && arr[l]>=arr[l-1])
                    l--;

                while(r<n-1 && arr[r]>=arr[r+1])
                    r++;

                res=Math.max(res,r-l+1);

            }
        }
        return res;
    }
}


//2 1 4 7 3 2 5
//longest mountain is of length 5
//1 4 7 3 2