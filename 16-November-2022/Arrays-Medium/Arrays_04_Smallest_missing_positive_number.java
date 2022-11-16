package com.company.Arrays_Medium_Level;

public class Arrays_04_Smallest_missing_positive_number {
    public static void main(String[] args) {
        int[] arr={2,3,1,-1};
        int n=arr.length;

        System.out.println(missing_pos(arr,n));
    }

    static int missing_pos(int[] arr,int n){
        //TIME COMPLEXITY  O(N) SPACE COMPLEXITY O(1)
        int i=0;

        while(i<n){
            int ind=arr[i]-1;



                if (arr[i]>0 && arr[i]<n && arr[i] != arr[ind]) {
                    int temp = arr[i];
                    arr[i] = arr[ind];
                    arr[ind] = temp;

                }

            else{
                i++;
            }
        }

        for(int j=0;j<n;j++){
            if(arr[j]!=j+1)
                return j+1;
        }
        return n+1;
    }


}
