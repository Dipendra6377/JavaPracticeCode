package com.company.Revision;

public class Arrays_20_Longest_Common_Prefix_in_an_Array {
    public static void main(String[] args) {
        String[] st= {"geeksforgeeks", "geeks", "geek",
                "geezer"};
        int n= st.length;

        System.out.println(longest(st,n));
    }

    static String longest(String[] st,int n){

        String res="";
        boolean flag=true;
        for(int i=0;i<st[0].length();i++){
            char ch= st[0].charAt(i);
            //System.out.print(ch+" ");
            for(int j=1;j<n;j++){
                if(i>=st[j].length()||ch!=st[j].charAt(i)) {
                    flag=false;
                    break;
                }
            }
            if(flag==false)
                break;
            else
                res+=ch;
        }
        if(res=="")
            return "-1";
        return res;
    }
}
