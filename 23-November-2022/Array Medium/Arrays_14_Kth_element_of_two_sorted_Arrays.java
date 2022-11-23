package com.company.Arrays_Medium_Level;

public class Arrays_14_Kth_element_of_two_sorted_Arrays {
    public static void main(String[] args) {
        int[] a={100, 112, 256, 349, 770};
        int[] b={72, 86, 113, 119, 265, 445, 892};
        int n=a.length;
        int m=b.length;
        int k=7;

        System.out.println(kth_element(a,b,n,m,k));
    }

    static int kth_element(int[] a,int[] b,int n,int m,int k){
        int i=0;
        int j=0;
        int count=1;
        int ans=-1;

        while(i<n &&j<m){
            if(count==k){
                ans=Math.min(a[i],b[j]);
                break;
            }
            if(a[i]==b[j]){
                i++;
                j++;
            }
            if(b[j]<a[i]){

                j++;
            }
            else{
                i++;}

            count++;

        }
        if(ans!=-1)
            return ans;
        while(i<n){
            if(count==k) {
                ans = a[i];
                break;
            }
            i++;
            count++;
        }
        while(j<m){
            if(count==k) {
                ans = b[j];
                break;
            }
            j++;
            count++;
        }
        return ans;
    }
}
