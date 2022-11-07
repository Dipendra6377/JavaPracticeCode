package com.company.Arrays;

public class Arrays_37_you_and_your_fucking_books {
    public static void main(String[] args) {
            int[] arr={3,2,2,3,2,2,2,3};
            int n=arr.length;

            int k=2;

        System.out.println(books(arr,n,k));
    }
    static int books(int[] arr,int n,int k){
        int max_book=0;
        int prev_max_book=0;
        for(int i=0;i<n;i++){

            if(arr[i]<=k){
                prev_max_book=prev_max_book+arr[i];
                if(prev_max_book>max_book){
                    max_book=prev_max_book;
                }
            }
            else {
                prev_max_book=0;
            }
        }
        return max_book;
    }
}
