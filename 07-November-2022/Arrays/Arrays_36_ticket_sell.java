package com.company.Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class Arrays_36_ticket_sell {
    public static void main(String[] args) {
        int[] arr={4,3,6,4,2};
        int n=arr.length;
        int k=3;

        System.out.println(ticket(arr,n,k));
    }

    static int ticket(int[] arr,int n,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i:arr)
            pq.add(i);

//        while(!pq.isEmpty()){
//            System.out.print(pq.peek() + " ");
//            pq.poll();
//        } 2 3 4 4 6 to reverse the order for max number to come on top
        // use Collections.reverseOrder();
        int s=0;
        while(k>0){
            int temp=pq.poll();
            s+=temp;
            pq.add(temp-1);
            k--;
        }
        return s%1000000007;
    }
}


//Input: N = 5, K = 3
//A = {4, 3, 6, 2, 4}
//Output: 15
//Explaination: Consider 0 based indexing.
//For first two turns the 2nd seller sells. that is 6 when he sell 1 ticket left 5
//so 5 is greater than all number so seller 2 will sell again so remaining ticket 4
//6+5=11
//For the third turn either 0th or 2nd
//Now 4 is greater number seller 0 and 2 has price 4 ticket 
//seller can sell. So the total becomes
//6 + 5 + 4 = 15.