package com.company.Arrays_Medium_Level;

public class Arrays_06_Maximum_Index {
    public static void main(String[] args) {
        int[] arr={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n=arr.length;

        System.out.println(max_Index(arr,n));
    }

    static int max_Index(int[] arr,int n){
        int max=0;


        int ans=0;

        for(int i=0;i<n;i++){
            int j=n-1;
            while(j>i) {

//                if (arr[j] >= arr[i]) {
//                    ans = j - i;
//
//                }
//
//                max=Math.max(max,ans);
//                j--;

                // ABOVE CODE TAKE MORE TIME SO IT GIVE RUN TIME ERRRORRRRRRRRRRRR
                //IN PLACE OF ABOVE CODE WE CAN REPLACE WITHHHHH

                if(arr[j]>=arr[i]){
                    max=Math.max(max,j-i);
                    break;
                }
                j--;
            }

        }
        return max;
    }
}
