public class Print_Subarray {
    public static void printSubarrays(int numbers[]) {
        int TS = 0;
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) { //j=i+1 nhi rkha bcz hame single element wala subarray bhi print karana tha buddy
                
                int end = j;
                for(int k=i; k<=end; k++) { //my mistake : k ko 0 se initiate kr rha tha
                    System.out.print(numbers[k] + " "); //subarray
                }
                TS++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Total subarrays = " + TS);

    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);

    }

}
//concept use : nested loop
//yaha pat 3 loops banenge
//same as pair, waha par ham first and last ko lekar pairing
// and yaha first and last wale element ko lo and unke bich ke saare elements ko print krwa do,,iske liye loop 3 use ho rha h...
