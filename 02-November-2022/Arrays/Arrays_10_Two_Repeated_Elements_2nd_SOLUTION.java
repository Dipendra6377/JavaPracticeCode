package com.company.Arrays;

public class Arrays_10_Two_Repeated_Elements_2nd_SOLUTION {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,3,4};
        int n=4;
        Arrays_10_Two_Repeated_Elements_2nd_SOLUTION obj = new Arrays_10_Two_Repeated_Elements_2nd_SOLUTION();
        int res[] =obj.repeat_Element(arr,n);
        System.out.println(res[0] + " " +res[1]);
    }
    static int[] repeat_Element(int[] arr,int n){
        int j =0;
        int size = arr.length;

        int[] out = new int[2];

        for(int i =0; i<size; i++){

            arr[(arr[i]%size)]+=size;

            /*arr[i]%size gives the actual number which was earlier stored in ACTUAL ARRAY*/
            //arr[i] is now arr[i]+frequency*(size)

            if(arr[arr[i]%size] / size ==2) out[j++]=(arr[i]%size);
        }


        return out;
    }
}
