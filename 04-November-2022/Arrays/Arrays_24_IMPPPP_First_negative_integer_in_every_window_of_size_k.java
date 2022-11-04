package com.company.Arrays;

import java.util.ArrayDeque;
import java.util.Queue;

public class Arrays_24_IMPPPP_First_negative_integer_in_every_window_of_size_k {
    public static void main(String[] args) {
        long[] arr={12,-1,-7,8,-15,30,16,28};
        int n=arr.length;
        int k=3;

        long[] res=negative_window(arr,n,k);

        for (int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    static long[] negative_window(long[] arr,int n,int k){
        Queue<Integer> q =new ArrayDeque<>();

        for(int i=0;i<=n-k;i++){
            int a=0;
            int count=0;

            for (int j=i;j<i+k;j++) {
                if (arr[j] < 0) {
                    a = (int) arr[j];
                    count++;
                    break;
                }
            }
                if (count == 1) {
                    q.add(a);
                }
                else{
                    q.add(0);
                }
            }
        //System.out.println(q);
        long[] ans=new long[q.size()];
        int i=0;
        while (!q.isEmpty()){
            ans[i]=(long)q.poll();
            i++;
        }
        return ans;

    }
}
