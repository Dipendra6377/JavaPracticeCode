package com.company.Arrays_Medium_Level;

public class Arrays_09_The_celebrity_problem {
    public static void main(String[] args) {
        int[][] arr={{0,1,0},{0,0,0},{0,1,0}};

        int n=3;


        System.out.println(celebrity(arr,n));
    }
    static int celebrity(int[][] arr,int n){
        // BRUTE FORCE APPROACH
        //TIME COMPLEXITY O(N*N)  SPACE COMPLEXITY  O(N)

        int[] howManyKnowsCelebrity=new int[n]; //celebrity ko kitne janta h
        int[] whoknowsClebrity=new int[n];     // kon kon celebrity ko janta h
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                if(arr[i][j]==1){
                    howManyKnowsCelebrity[j]++;
                    whoknowsClebrity[i]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(howManyKnowsCelebrity[i]==n-1 && whoknowsClebrity[i]==0)
            //celebrity ko n-1 log jante h mtlb usko chodke (2log) lkin wo kisi ko nhi janta (0 log)
            {
                return i;
            }
        }
        return -1;
    }
}
