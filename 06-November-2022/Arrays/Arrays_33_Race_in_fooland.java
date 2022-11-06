package com.company;



import java.util.Arrays;

class Pair{
        int first=0;
        int second=0;
public Pair(int first,int second){
        this.first=first;
        this.second=second;
        }
        }

public class Arrays_33_Race_in_fooland {
    public static void main(String[] args) {

            Pair[] arr=new Pair[5];
            arr[0]=new Pair(0,0);
            arr[0].first=1;
            arr[0].second=3;
            arr[1]=new Pair(0,0);
            arr[1].first=5;
            arr[1].second=8;
            arr[2]=new Pair(0,0);
            arr[2].first=8;
            arr[2].second=13;
            arr[3]=new Pair(0,0);
            arr[3].first=14;
            arr[3].second=15;
            arr[4]=new Pair(0,0);
            arr[4].first=9;
            arr[4].second=12;

            for(int i=0;i<5;i++){
                System.out.print("("+arr[i].first + ","+ arr[i].second + ")");
            }
        System.out.println();
            int track=20;
            int n=5;

            System.out.println(race(arr,n,track));

        }
        static public int race(Pair[] arr,int n,int track){
            boolean[] ok=new boolean[track];
            Arrays.fill(ok,true);

            for(int i=0;i<n;i++){
                int s=arr[i].first-1;
                int e=arr[i].second-1;

                for(int j=s;j<=e;j++){
                    if(ok[j]){
                        ok[j]=false;
                    }
                }
            }
            System.out.println(Arrays.toString(ok));
            int count=0;
            for(int i=0;i<track;i++){
                if (ok[i]==true){
                    count++;
                }
            }
            return count;
    }
}
