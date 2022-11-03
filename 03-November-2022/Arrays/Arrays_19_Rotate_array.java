package com.company.Arrays;

public class Arrays_19_Rotate_array {
    public static void main(String[] args) {
        int[] arr={40,13, 27, 87, 95, 40 ,96 ,71, 35, 79, 68, 2 ,98, 3 ,18, 93, 53, 57, 2 ,81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76 ,10 ,28 ,68, 57, 98, 54, 87 ,66, 7, 84, 20, 25, 29, 72, 33 ,30 ,4 ,20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};
        int n=arr.length;
        int d=78;

        rotate_BC(arr,n,d);
        for (int x:arr){
            System.out.print(x +" ");
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void rotate_BC(int[] arr,int n,int d){
        if(d>n){
            d=d%n;
            // SURE TO ADD THIS TEST CASES MIGHT NOT RUN IF IT IS NOT INCLUDED
        }
        int i=0;int j=d-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        int k=d;int l=n-1;
        while(k<l){
            swap(arr,k,l);
            k++;l--;
        }

        int x=0;int y=n-1;

        while(x<y){
            swap(arr,x,y);
            x++;
            y--;
        }
    }
}
