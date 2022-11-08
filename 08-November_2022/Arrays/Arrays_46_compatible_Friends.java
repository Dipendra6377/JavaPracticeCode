package com.company.Arrays;

public class Arrays_46_compatible_Friends {
    public static void main(String[] args) {
        int[] a1={5,3,1,2,4};
        int[] a2={3,1,2,4,5};

        int n=a1.length;

        System.out.println(compatibility(a1,a2,n));
    }
    static int compatibility(int[] a1,int[] a2,int n ){
        int count=0;
        for (int i=0;i<n;i++){
            int j=i+1;
            while(a1[i]!=a2[i]){
                count++;
                int temp=a1[j];
                a1[j]=a1[i];
                a1[i]=temp;

            }
        }
        return count;
    }
}
//Input : N=5
//        a1[] = {3, 1, 2, 4, 5}
//        a2[] = {3, 2, 4, 1, 5}
//Output : 2
//Explanation : Compatibility difference is two
//              because first ranks movie 1 before
//              2 and 4 but other ranks it after.