package com.company.Arrays;

public class Arrays_35_Light_bulb_faulty_wire {
    public static void main(String[] args) {
        int arr[] ={1,0,0,1};
        int n=arr.length;

        System.out.println(fualty(arr,n));
    }

    static int fualty(int[] arr,int n){

        int state =0;
        int count=0;

        for(int i=0;i<n;i++){
            if(state==arr[i]){
                if(state==0)
                    state=1;
                else
                    state=0;
                count++;
            }
        }
        return count;
    }
}
