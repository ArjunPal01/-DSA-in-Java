public class DividenConquer {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }

    public static void quickSort(int arr[], int si, int ei) {
        if(si >= ei) {  //base case
            return;
        }
        //last element:
        int pivotindex = partition(arr, si, ei);
        quickSort(arr, si, pivotindex-1); //left
        quickSort(arr, pivotindex+1, ei); //right
    }

    public static int partitionn(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; //make place smaller than pivot

        for(int j=si; j<ei; j++) { //j si  se start hoga, na ki j=0
            if(arr[j] <= pivot) {
                i++;  //pivot se value kam hai to i ko jagah banani pdegi:
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //now set the pivot at right location
        i++;
        int temp = pivot;  //pivot is at arr[ei]
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    //TC= 0(nlogn)
    //sc= 0(n)
}