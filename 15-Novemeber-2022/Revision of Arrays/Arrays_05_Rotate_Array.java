package com.company.Revision;

import java.util.Scanner;

public class Arrays_05_Rotate_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;

        Scanner sc=new Scanner(System.in);
//        System.out.println("enter k");
//        int k=sc.nextInt();
        int k=2;

        rotate(arr,n,k);
        System.out.println();
        for (int i:arr){
            System.out.print(i + " ");
        }
    }

    static void rotate(int[] arr,int n,int k){

        k=k%n;  // for k greater than n
        sub_rotate(arr,0,k-1);
//        for (int i:arr)
//            System.out.print(i + " ");
        sub_rotate(arr,k,n-1);
        sub_rotate(arr,0,n-1);
    }
    static void sub_rotate(int[] arr,int i,int j){
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

}


//Input:
//N = 5, D = 2
//arr[] = {1,2,3,4,5}
//Output: 3 4 5 1 2
//Explanation: 1 2 3 4 5  when rotated
//by 2 elements, it becomes 3 4 5 1 2.