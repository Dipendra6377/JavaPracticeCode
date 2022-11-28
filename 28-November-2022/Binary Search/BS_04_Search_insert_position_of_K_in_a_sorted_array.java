public class BS_04_Search_insert_position_of_K_in_a_sorted_array {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int n=arr.length;
        int x=7;

        System.out.println(insert(arr,n,x));
    }

    static int insert(int[] arr,int n,int x){
        int i=0;
        int j=n-1;

        while (i<=j){
            int mid=(i+j)/2;
            if(arr[n-1]<x){
                return n;
            }

            if(arr[mid]==x){
                return mid;
            }
            if(mid<n-1 && arr[mid]<x && arr[mid+1]>x){
                return mid+1;
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
