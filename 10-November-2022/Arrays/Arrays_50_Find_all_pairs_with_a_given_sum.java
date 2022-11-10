package com.company.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class pairs{
    long first; long second;
    public pairs(long first,long second){
        this.first=first;
        this.second=second;
    }
}
public class Arrays_50_Find_all_pairs_with_a_given_sum {
    public static void main(String[] args) {
        long[] a={1, 2, 4, 5, 7};
        long[] b={5, 6, 3, 4, 8};
        long n=a.length;
        long m=b.length;
        long sum=9;

        pairs[] output = pairs_with_given_sum(a,b,n,m,sum);
        int size=output.length;

        for(int i=0;i<size;i++){
            System.out.print(output[i].first + " " + output[i].second);
            System.out.println();
        }
    }

    static pairs[] pairs_with_given_sum(long[] a,long[] b,long n,long m,long x){
        ArrayList<pairs> list=new ArrayList<>();
        HashSet<Long> set=new HashSet<>();

        for (long i:b) set.add(i);
        Arrays.sort(a);

        for(long i:a){
            if(set.contains(x-i)){
                list.add(new pairs(i,x-i));
            }
        }
        pairs[] ans=new pairs[list.size()];
        return list.toArray(ans);
    }

}
