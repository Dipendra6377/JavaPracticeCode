package com.company.Arrays;


// use sliding window technique
public class Arrays_44_Minimum_Swaps_required_to_group_all_s_together {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1};
        int n=arr.length;

        System.out.println(minimum_swap(arr,n));
    }

    static int minimum_swap(int[] arr,int n){
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1)
                count1++;
        }
        if(count1==0)
            return -1;
        if(count1==n)
            return 0;

        int i=0;int j=0;int ans=Integer.MAX_VALUE;
        int count0=0;

        while(j<n){
            if((j-i+1)<count1) {
                if (arr[j] == 0) {
                    count0++;
                }
                j++;
            }

            else{
                if((j-i+1)==count1){
                    if(arr[j]==0){
                        count0++;
                    }
                    ans=Math.min(ans,count0);

                    if(arr[i]==0)
                        count0--;
                    }
                i++;
                j++;
                }
        }
        return ans;
    }
}
