package com.company.Arrays_Medium_Level;

import java.util.Stack;

public class Arrays_10_stock_span_problem_OPTIMIZATION {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int n=arr.length;

        int[] res=stock(arr,n);
        for(int i:res)
            System.out.print(i + " ");
    }
    static int[] stock(int[] arr,int n){
        Stack<Integer> st=new Stack<>();
        int[] sol=new int[n];
        st.push(0);

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
                st.pop();

            if(st.isEmpty()){
                sol[i]=i+1;
            }
            else{
                sol[i]=i-st.peek();
            }
            st.push(i);
        }
        return sol;
    }
}
