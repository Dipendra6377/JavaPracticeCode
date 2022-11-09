package com.company.Arrays;


//Boom numbers are numbers consisting only of digits 2 and 3.
// Given an integer K, display the K-th Boom number.



import java.util.LinkedList;
import java.util.Queue;

public class Arrays_47_kth_boom_number {
    public static void main(String[] args) {
        long k=7;

        boomboom(k);
    }
    static void boomboom(long k){
        Queue<String> q = new LinkedList<String>();

        long count=0;
        q.add("");

        while(k>=count){
            String s1=q.poll();

            String s2=s1;

            s1=s1+"2";
            q.add(s1);
            count++;
            if(count==k){
                System.out.println(s1);
                break;
            }
            s2=s2+"3";
            q.add(s2);
            count++;

            if(count==k){
                System.out.println(s2);
                break;
            }
        }
        return;
    }
}
