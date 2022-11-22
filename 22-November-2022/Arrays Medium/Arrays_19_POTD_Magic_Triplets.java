package com.company.Revision;

public class Arrays_19_POTD_Magic_Triplets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n=arr.length;

        System.out.println(magic(arr,n));
    }
    static int magic(int[] arr,int n){
        int count=0;
        for(int i=0;i<n;i++){
            int left_side_smaller=0;
            int right_side_greater=0;

            for(int j=0;j<i;j++){
                if(arr[j]<arr[i])
                    left_side_smaller++;
            }

            for(int k=i;k<n;k++){
                if(arr[k]>arr[i])
                    right_side_greater++;
            }
            count+=left_side_smaller*right_side_greater;
        }
        return count;
    }
}
