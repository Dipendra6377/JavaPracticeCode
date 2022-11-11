package com.company.Arrays;

public class Arrays_53_facing_the_sun {
    public static void main(String[] args) {
        int[] arr={468, 335, 501 ,170 ,725 ,479 ,359 ,963 ,465 ,706 ,146, 282, 828 ,962, 492 ,996 ,943, 828 ,437 ,392 ,605 ,903 ,154 ,293 ,383 ,422 ,717 ,719 ,896 ,448 ,727 ,772 ,539 ,870 ,913 ,668 ,300 ,36 ,895 ,704 ,812 ,323};
        int n =arr.length;

        System.out.println(facing(arr,n));
    }
    static int facing(int[] arr,int n){
        //int count1=1;
        int count2=1;

        int k=arr[0];
        for(int i=0;i<n;i++){
//            if(arr[i]>arr[i-1]){
//                count1++;
//                System.out.print(arr[i]+ "  ");
//            }
            if(arr[i]>k){
                k=arr[i];
                count2++;
                //System.out.println(arr[i]+ "  ");
            }
        }
        return count2;
    }
}
