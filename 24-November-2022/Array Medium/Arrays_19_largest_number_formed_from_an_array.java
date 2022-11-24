package com.company.Arrays_Medium_Level;

import java.util.Arrays;

public class Arrays_19_largest_number_formed_from_an_array {
    public static void main(String[] args) {
        String[] arr={"3", "30", "34", "5", "9"};

        System.out.println(longest_number(arr));
    }
    static String longest_number(String[] arr){

        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));

        String ans="";

        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
}
