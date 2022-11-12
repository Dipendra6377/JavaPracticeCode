package com.company.Arrays;

public class Arrays_54__Maximum_distance_Between_geeks_and_his_friends {
    public static void main(String[] args) {
        int[] arr={19561 ,11914 ,43943 ,77769 ,28181 ,65979 ,3181 ,88813 ,29068, 83680, 56585, 20229, 39106, 90465 ,95210 ,98951 ,25326 ,20277 ,4321};
        int n=arr.length;
        System.out.println(foud(arr,n));
    }
    static int foud(int[] A,int N){
        int point_right=0;
        int point_left=0;
        int ans=0;

        while(point_right<N){
            if(point_right<(N-1) && A[point_right+1]>=A[point_right]){
                point_right+=1;
            }
            else if(point_left>0 && A[point_left-1]>=A[point_left]){
                point_left-=1;
            }
            else{
                point_right+=1;
                point_left=point_right;
            }
            ans=Math.max(ans,point_right-point_left);
        }
        return ans;
    }
}
