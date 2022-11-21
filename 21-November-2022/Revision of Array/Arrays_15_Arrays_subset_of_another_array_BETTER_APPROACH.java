package com.company.Revision;
//Duplicacy of element not allowed 
// Time Complexity: O(mLog(m) + nlog(m)). O(mLog(m)) for sorting and O(nlog(m)) for binary searching each element of one array in another. In the above code, Quick Sort is used and the worst-case time complexity of Quick Sort is O(m2).
//Auxiliary Space: O(n)
public class Arrays_15_Arrays_subset_of_another_array_BETTER_APPROACH {
    public static void main(String[] args) {
            int[] a={11, 1, 13, 21, 3, 7};
            int[] b={11,3,7,1};
            int n=a.length;
            int m=b.length;

            System.out.println(subset(a,b,n,m));
    }

    static boolean subset(int[] a,int[] b,int n,int m){
        Quicksort(a,0,n-1);

        for(int i=0;i<m;i++){
            if(binarySearch(a,0,n-1,b[i])==-1)
                return false;
        }
        return true;
    }

    static int binarySearch(int[] arr,int l,int h,int x){
        if(l<=h){
            int mid=(l+h)/2;
            if ((mid == 0 || x > arr[mid - 1])
                    && (arr[mid] == x))
            return mid;
            else if (x > arr[mid])
                return binarySearch(arr, (mid + 1), h,
                        x);
            else
                return binarySearch(arr, l, (mid - 1), x);
        }
        return -1;
    }
    static int partition(int[] arr,int low,int high){
        int piv = arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<=piv){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    static void Quicksort(int[] arr,int low,int high){

        if(low<high){
            int pivot = partition(arr,low,high);

            Quicksort(arr,0,pivot-1);

            Quicksort(arr,pivot+1,high);
        }
    }
}
