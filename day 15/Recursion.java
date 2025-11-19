public class Recursion {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.print(n); //base case
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 4));
    }

    public static void printInc(int n) {
        if(n==1) {
            System.out.print(n);
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    //which fn. calls before that matters like inc and dec. same ho jayega nhi to


    public static int calcSum(int n) {
        if(n==1) {  //base case 
            return 1;
        }
        int snm1 = calcSum(n-1); //assume ki ye kaise bhi hame mil hi jayega:
        int sn = n + snm1;
        return sn;
    }

    public static int fibonacci(int n) {
        if(n == 1 || n == 0) {
            return n;
        }

        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    public static boolean isSorted(int arr[], int i) { //int i means..uss index par uski value
        if(i = arr.length-1) { //base case condition..
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i);
    } //if fn. is sorted o/p is true:
}
//till q.5 , next: