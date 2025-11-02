import java.util.*;

class Sorting {
    //it is basically an arrangement of data

    //bubble sort

    public static void bubblesorting(int arr[]) {
        //bade wale ko piche push krte jana hai by swaping with adjacent element
        for(int turn=0; turn<arr.length-1; turn++) {
            //inner loop me hame o se n-1-turn tak jakar just swap karana h
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void SelectionSort(int arr[]) {
        for(int i=0; i<arr.length-2; i++) { //outer loop turn count krega
            int minpos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minpos] > arr[j]) {
                    minpos = j;

                }

            }
             //swap
                    int temp = arr[minpos];
                    arr[minpos] = arr[i];
                    arr[i] = temp;
        }
    }

    public static void InsertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) { //my mistake: arr.length-1 liya tha jiss se last wala element as it is print ho rha tha
            int curr = arr[i];
            int prev = i-1;
            //find the pos and run a while loop

            while (prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
                
            }

            //insert that element
            arr[prev+1] = curr;  //doubt, like why taking prev+1, i think prev lena chahiye tha

         
            
        }
    }

    public static int Compare(int a, int b) {
        return b; //array reverse wala logic ase hi hai,,which is in inbuilt sort..
        //a < b -ve 
        //a == b 0
        //a < b +ve
         //reverse me like b-a kr diya:


    }

    public static void CountSort(int arr[]) {
        //firstly find range
        int largest = Integer.MIN_VALUE; //innitiate krna:
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        //count var. bana kr usko update krna h
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting kr abb
        int j = 0;
        for(int i=0; i<count.length; i++) {  //my mistake: arr.lenth tak se loop run kr rha tha, origianl array ka size to 5 hoga na but count ka 6 hoga bcz wo 0 se start hota hai:
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
                
            }
        }

    }

     public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        //call any function:
       // CountSort(arr);
       // printArr(arr);

    }

}

//that's it buddy 
//KEEP LEARNING AND KEEP SMILING: