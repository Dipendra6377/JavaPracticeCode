import java.util.Arrays;

class Pair{
    int floor;int ceil;

    Pair(){
        this.floor=0;
        this.ceil=0;

    }
    Pair(int floor,int ceil){
        this.floor=floor;
        this.ceil=ceil;
    }
}
public class BS_03_Ceil_The_Floor {
    public static void main(String[] args) {
        int[] arr={5,6,8,9,5,5,6};
        int n=arr.length;
        int x=7;

        Pair ans=Ceil(arr,n,x);
        System.out.println(ans.floor + " " + ans.ceil);
    }

    static Pair Ceil(int[] arr,int n,int x){
        Arrays.sort(arr);
        Pair pair=new Pair(-1,-1);
         pair.floor=Findfloor(arr,0,n-1,x);
         pair.ceil=Findceil(arr,0,n-1,x);

         return pair;
    }

    static int Findfloor(int[] arr,int l,int h,int x){
        if(arr[arr.length-1]<x){
            return arr[arr.length-1];
        }
        while (l<=h){

            int mid=(l+h)/2;
            if(arr[mid]==x){
                return arr[mid];
            }
            if(mid>0 &&arr[mid]>x && arr[mid-1]<x ){
                return arr[mid-1];
            }
            else if(arr[mid]>x){
                h=mid-1;
            }
            else
                l=mid+1;
        }
        return -1;
    }
    static int Findceil(int[] arr,int l,int h,int x){
        if(arr[0]>x){
            return arr[0];
        }
        while (l<=h){

            int mid=(l+h)/2;
            if(arr[mid]==x){
                return arr[mid];
            }
            if(mid>0 &&arr[mid]>x && arr[mid-1]<x ){
                return arr[mid];
            }
            else if(arr[mid]>x){
                h=mid-1;
            }
            else
                l=mid+1;
        }
        return -1;
    }
}
