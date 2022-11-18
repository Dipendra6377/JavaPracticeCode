package com.company.Arrays_Medium_Level;

public class Arrays_09_OPTIMIZATION_Celebrity_problem {
    public static void main(String[] args) {
        int[][] arr={{0,1,0},{0,0,0},{0,1,0}};

        int n=3;


        System.out.println(celebrity(arr,n));
    }
    static int celebrity(int[][] arr,int n){
        int celebrity=0;

        for(int i=0;i<n;i++){
            if(arr[celebrity][i]==1){
                celebrity=i; // phle hm dekhenge ki kya celebrity --> i ko pehechanta h ==1
                //to celebrity i ho gya kyuki usko jante h
            }
        }

        for(int i=0;i<n;i++){
            //celebrity i ke equal nhi hona chahiye kyuki celebrity khud ko pehenchanega na ki wo kon h
            if(celebrity!=i && (arr[celebrity][i]==1 || arr[i][celebrity]==0)){
                // phir dekhenge ki agr celebrity i ko pehenchata h or i h jo celebrity ko nhi janta h
                // to return -1
                return -1;
            }
        }
        return celebrity;
    }
}
