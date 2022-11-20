package com.company.Revision;

public class Arrays_10_Transition_element {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,1};
        int n=arr.length;

        System.out.println(transition(arr,n));
    }

    static int transition(int[] arr,int n){

        int i=0;
        int j=n-1;
        if(arr[0]==1)
            return 0;

        while(i<=j){
            int mid=(i+j)/2;

            if(arr[mid]==1 ){
                if(arr[mid-1]==0) {
                    //System.out.println("hello");
                    return mid;
                }

                else
                    j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return -1;
    }
}
