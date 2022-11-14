package com.company.Revision;

import java.util.HashMap;
import java.util.Scanner;

public class CODECHEF_String_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();


        while(t--!=0) {
            int n = sc.nextInt();
            String str = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();
            if (str.length() % 2 == 1) {
                System.out.println("NO");
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (!map.containsKey(str.charAt(i))) {
                        map.put(str.charAt(i), 1);
                    } else {
                        map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                    }
                }
                boolean flag=true;
                for (Character key:map.keySet()){
                    Integer val=map.get(key);
                    if(val%2!=0){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }

        }
        }
    }
}
