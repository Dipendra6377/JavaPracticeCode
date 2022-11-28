public class BS_02_Floor_In_Sorted_Array
{
    public static void main(String[] args) {
        int[] arr={1,2,8,10,11,12,19};
        int n=arr.length;
        int x=20;

        System.out.println(floor(arr,n,x));

    }
    static int floor(int[] arr,int n,int x){
        int i=0;
        int j=n-1;
        if(arr[n-1]<=x)
            return n-1;

        while(i<=j){
            int mid=(i+j)/2;

            if((mid>0 &&arr[mid]>=x && arr[mid-1]<x) ){
                return mid;
            }

            else if(arr[mid]>x){
                j=mid-1;
            }
            else
                i=mid+1;
        }
        return -1;
    }
}
