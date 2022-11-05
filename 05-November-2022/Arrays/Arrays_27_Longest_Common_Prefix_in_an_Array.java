package com.company.Arrays;

public class Arrays_27_Longest_Common_Prefix_in_an_Array {
    public static void main(String[] args) {
        String arr[]={"geeksforgeeks","geeksfor","geeks","geek"};
        int n= arr.length;;

        System.out.println(commonPrefix(arr,n));
    }
    static String commonPrefix(String[] arr,int n){
        String res="";
        boolean flag=true;

        for(int i=0;i<arr[0].length();i++){
            char curr=arr[0].charAt(i);
            for(int j=1;j<n;j++){
                if(i>=arr[j].length() || arr[j].charAt(i)!=curr){
                    flag=false;
                    break;
                }
            }

            if(flag==false){
                break;
            }
            else
                res+=curr;
        }
        if(res == ""){
            return "-1" ;
        }
        else{
            return res;
        }
    }
}
