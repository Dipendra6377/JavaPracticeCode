package com.company.Arrays_Medium_Level;

public class POTD_16_11_2022_Sum_of_Beauty_of_All_Substrings {
    public static void main(String[] args) {
        String str="aaac";

        System.out.println(beauty_String(str));
    }
    static int beauty_String(String s){
        int ans=0;
        int n=s.length();

        for(int size=3;size<=n;size++){
            int i=0;
            int j=size;

            int[] freq=new int[26];
            for(int ind=i;ind<j;ind++){

                freq[s.charAt(ind)-'a']++;
            }
            ans+=beauty(freq);
            while(j<n){

                freq[s.charAt(j)-'a']++;
                freq[s.charAt(i)-'a']--;
                ans+=beauty(freq);
                j++;
                i++;
            }
        }
        return ans;
    }
    static int beauty(int[] freq){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i:freq){
            if(i!=0){
                min=Math.min(min,i);
                max=Math.max(max,i);
            }
        }
        return max-min;
    }
}
