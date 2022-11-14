package com.company.Revision;

public class POTD_Find_Pattern {
    public static void main(String[] args) {
        String s="abcdrtbwerrcokokokd";
        String w="bcd";

        System.out.println(Pattern(s,w))    ;
    }
    static int Pattern(String s,String w) {

        int cnt = 0;
        char[] str1 = s.toCharArray();
        char[] str2 = w.toCharArray();
        while (true) {
            int i = 0;
            int j = 0;
            while (i < s.length() && j < w.length()) {
                if (str1[i] == str2[j]) {
                    str1[i] = '$';
                    i++;
                    j++;
                } else {
                    i++;
                }

            }
            if (j == w.length()) {
                cnt++;
            } else {
                return cnt;
            }
        }

    }
}
