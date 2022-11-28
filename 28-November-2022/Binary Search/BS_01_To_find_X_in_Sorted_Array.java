public class BS_01_To_find_X_in_Sorted_Array {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=4;

        System.out.println(Binary_Search(arr,n,k));
    }
    static int Binary_Search(int[] arr,int n,int k){
        int i=0;
        int j=n-1;

        while (i<=j){
            int mid=(i+j)/2;

            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                i=mid+1;
            }
            else
                j=mid-1;
        }
        return -1;
    }
}
