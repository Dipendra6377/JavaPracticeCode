package com.company.Arrays;

public class Arrays_41_Left_oUT_candies {
    public static void main(String[] args) {
        int n=4;
        int m=11;

        System.out.println(candies(n,m));
    }
    static int candies(int n,int m){

        m=m%((n*(n+1))/2);
        int i=0;

        while(m-i>=0){
            m-=i;
            i++;
        }
        return m;
    }
}


//Input:
//N = 4, M = 11
//Output: 0
//Explanation: You first give 1 candy to 1st student,
//2 to 2nd , 3 to 3rd , 4 to 4th then again 1 to first.
//All candies are finished with none left out.