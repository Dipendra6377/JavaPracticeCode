package com.company.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Pair{
    long first=0;
    long second=0;

    public Pair(long first,long second){
        this.first=first;
        this.second=second;
    }

}
public class Arrays_21_Find_all_pairs_with_a_given_sum {
    public static void main(String[] args) {
        long[] a ={1, 2, 4, 5, 7};
        long[] b={5, 6, 3, 4, 8};
        long n=a.length;
        long m=b.length;
        long x=8;

        Pair[] res=pair(a,b,n,m,x);
        for (Pair i:res) {
            System.out.print(i.first + " " + i.second);
            System.out.println();
        }

    }
    static Pair[] pair(long[] a,long[] b,long n,long m,long x){
        ArrayList<Pair> list=new ArrayList<>();
        HashSet<Long> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(b[i]);
        }

        Arrays.sort(a);
        for(int j=0;j<m;j++){
            if(set.contains(x-a[j])){
                list.add(new Pair(a[j],x-a[j]));
            }
        }
        return list.toArray(new Pair[list.size()]);
    }
}
