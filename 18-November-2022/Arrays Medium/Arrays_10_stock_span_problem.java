package com.company.Arrays_Medium_Level;

import java.util.Stack;

public class Arrays_10_stock_span_problem {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int n=arr.length;

        int[] res=stock(arr,n);
        for(int i:res)
            System.out.print(i + " ");
    }
    static int[] stock(int[] arr,int n){
        // TIME COMPLEXITY O(N^2) SPACE COMPLEXITY O(N)
        int[] sol=new int[n];

        Stack<Integer> st=new Stack<>();
        sol[0]=1;
        int ans=0;
        //int k=0;
        //st.push(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]) {
                st.push(arr[i]);
                sol[i]=1;
            }

            else{
                int j=i-1;
                int k=0;
                //System.out.println(j);
                while (j>=0 && arr[j]<=arr[i]){
                    j--;
                    //System.out.println("j2 " + j);
                    k++;

                }
                //st.push(ele);
                ans=i-j;
                sol[i]=ans;
            }




            st.push(arr[i]);

        }
        return sol;
    }
}
