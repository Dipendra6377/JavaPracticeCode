package com.company.Revision;

import java.util.HashMap;

public class Arrays_08_count_pairs_with_given_sum {
        public static void main(String[] args) {

                int[] arr={1,1,1,1};
                int n=arr.length;
                int k=2;

                System.out.println(pairs(arr,n,k));
        }

        static int pairs(int[] arr,int n,int k){
                //Time Complexity: O(n), to iterate over the array
                //Auxiliary Space: O(n), to make a map of size n

                HashMap<Integer,Integer> map=new HashMap<>();
                int presum=0;
                int count=0;

                for(int i=0;i<n;i++){
                        presum=k-arr[i];

                        if(map.containsKey(presum)){
                               count+=map.get(presum);
                        }
                        if(map.containsKey(arr[i])){
                                map.put(arr[i],map.get(arr[i])+1);
                        }
                        else{
                                map.put(arr[i],1);
                        }
                }
                return count;
        }
}
