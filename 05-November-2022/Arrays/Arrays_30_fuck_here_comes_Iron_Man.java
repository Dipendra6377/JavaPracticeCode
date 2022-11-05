package com.company.Arrays;

//Jarvis is weak in computing palindromes for Alphanumeric characters.
//While Ironman is busy fighting Thanos, he needs to activate sonic punch but Jarvis is stuck in computing palindromes.
//You are given a string S containing alphanumeric characters. Find out whether the string is a palindrome or not.
//If you are unable to solve it then it may result in the death of Iron Man.

public class Arrays_30_fuck_here_comes_Iron_Man {
    public static void main(String[] args) {

        String s ="I am :IronnorI Ma, i";
        System.out.println(IronMAN(s));
    }
    static boolean IronMAN(String str){
        str=str.toLowerCase();
        str=str.replaceAll("\\W","");

        int i=0;
        int j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
//â€‹Input : S = "I am :IronnorI Ma, i"
//Output : YES
//Explanation:
//Ignore all the symbol and whitespaces S = "IamIronnorIMai".
//Now, Check for pallandrome ignoring uppercase and lowercase
//english letter.