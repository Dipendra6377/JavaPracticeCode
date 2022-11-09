package com.company.Arrays;

public class Arrays_48_Regular_Polygon {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1,0,1,0,1,1};
        int n=arr.length;

        System.out.println(polygon(arr,n));
    }
    static int polygon(int[] arr,int n){
        int ind=(int)Math.sqrt(n);

        for(int i=1;i<=ind;i++){
            if(n%i==0){
                if(checkpolygon(arr,n,i) || checkpolygon(arr,n,n/i))
                    return 1;
            }
        }
        return 0;
    }
    static boolean checkpolygon(int[] arr,int n,int side){

        for(int j=0;j<side;j++){

            int val=1;
            for (int k=j;k<n;k+=side){
                val&=arr[k];
            }
            if(val!=0 && n/side>2){
                System.out.println("side of polygon are : " + n/side);
                return true;
            }
        }
        return false;
    }
}
