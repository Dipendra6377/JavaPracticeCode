package com.company.Revision;

public class Arrays_16_First_Reapeating_Element_Second_APP
{
    public static void main(String[] args) {
        int[] arr={1,5,3,4,3,5,6};
        int n=arr.length;

        repeating(arr,n);
    }

    static void repeating(int[] arr,int n){
        int k = 0;

        // max = maximum from (all elements & n)
        int max = n;
        for (int i = 0; i < n; i++)
            if (max < arr[i])
                max = arr[i];

        // Array a is for storing
        // 1st time occurrence of element
        // initialized by 0
        int[] a = new int[max + 1];

        // Store 1 in array b
        // if element is duplicate
        // initialized by 0
        int[] b = new int[max + 1];
        for (int i = 0; i < n; i++) {

            // Duplicate element found
            if (a[arr[i]] != 0) {
                b[arr[i]] = 1;
                k = 1;
                continue;
            }
            else
                // storing 1st occurrence of arr[i]
                a[arr[i]] = i + 1;
        }
        for(int x:a)
            System.out.print(x+" ");
        System.out.println();
        for (int x:b)
            System.out.print(x+ " ");
        System.out.println();

        if (k == 0)
            System.out.println(
                    "No repeating element found");
        else {
            int min = max + 1;

            // trace array a & find repeating element
            // with min index
            for (int i = 0; i < max + 1; i++)
                if (a[i] != 0 && min > a[i] && b[i] != 0)
                    min = a[i];
            System.out.print(arr[min - 1]);
        }
        System.out.println();
    }
}
