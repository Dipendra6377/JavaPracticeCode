package com.company.Arrays;


//The elements should follow the following order ! # $ % & * @ ^ ~ .
public class Arrays_01_Medium_Nuts_and_Bolts_Problem {
    public static void main(String[] args) {
        char[] bolts={'@', '%', '$','#', '^'};
        char[] nuts={'%', '@', '#', '$', '^'};
        int n=bolts.length;

        now_i_am_screw_driver(bolts,nuts,n);

        for (int i=0;i<n;i++)
            System.out.print(bolts[i] + " ");

        System.out.println();
        for (int j=0;j<n;j++)
            System.out.print(nuts[j] + " ");

    }

    static void now_i_am_screw_driver(char[] bolts,char[] nuts,int n){
        // time complexity O(N^2)

        char ch[]=new char[9];
        ch[0]='!';
        ch[1]='#';
        ch[2]='$';
        ch[3]='%';
        ch[4]='&';
        ch[5]='*';
        ch[6]='@';
        ch[7]='^';
        ch[8]='~';


        int k=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<n;j++){
                if(ch[i]==nuts[j]){
                    bolts[k]=ch[i];
                    k++;
                    break;
                }
            }
        }

        for(int i=0;i<n;i++){
            nuts[i]=bolts[i];
        }
    }
}
