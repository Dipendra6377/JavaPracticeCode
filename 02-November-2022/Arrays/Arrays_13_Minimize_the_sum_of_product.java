package com.company.Arrays;

import java.util.Arrays;

public class Arrays_13_Minimize_the_sum_of_product {
    public static void main(String[] args) {
        int[] a={6, 1, 9, 5, 4};
        int[] b={3, 4, 8, 2, 4};
        int n=a.length;

        System.out.println(Minimum_product(a,b,n));
    }
    static int Minimum_product(int[] a,int[] b,int n){
        Arrays.sort(a);

        Arrays.sort(b);

        int i=0;
        int j=n-1;
        int prod=0;

        while(i<n && j>=0){
            prod=prod+a[i]*b[j];
            i++;
            j--;
        }
        return prod;
    }
}
