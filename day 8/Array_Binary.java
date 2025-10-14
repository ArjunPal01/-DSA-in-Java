public class Array_Binary {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1; //index 0 se start hai na so, end me hum -1 kr rhe h
        //this is process buddy : remember this

        while(start <= end) {
            int mid = (start + end)/2;

            //comparisons
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) { //right
                start = mid+1;

            }else { //left
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 12;
        int index = binarySearch(numbers, key); //fn. ko call kro and uske sath hi index var ka data type declare kr do
         if(index == -1)  {   //bhai if ke andar variable ka data type declare nhi krte hai
            System.out.println("NOT found");
        } else {
            System.out.println("Index for key is : " + binarySearch(numbers, key));
        }
       
    }
}