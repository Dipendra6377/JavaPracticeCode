package com.company.Arrays_Medium_Level;

public class Arrays_07_Medium_Rearrange_array_alternatively {
    public static void main(String[] args) {
        long[] arr={1,2,3,4,5,6};
        int n=arr.length;

        rearrange(arr,n);

        for(long x:arr)
            System.out.print(x+ " ");
    }

    static void rearrange(long[] arr,int n){
        long m=arr[n-1]+1;

        int maxi=n-1;
        int mini=0;
        boolean flag=true;

        for(int i=0;i<n;i++){
            if(flag){
                long val=arr[maxi]%m;
                arr[i]=arr[i]+val*m;
                maxi--;

            }
            else{
                long val=arr[mini]%m;
                arr[i]+=val*m;
                mini++;
            }
            flag=!flag;
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/m;
        }
    }
}
