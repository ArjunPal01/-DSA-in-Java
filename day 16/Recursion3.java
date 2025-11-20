public class Recursion3 {
    public static void printBinString(int n, int lastplace, String str) {

        //base case
        if(n == 0) { //n=0 pr empty space print ho jayega:
            System.out.println(str);
            return;
        }
        
        //kaam
       // if(lastplace == 0) {
            //sit 0 on chair of n
           // printBinString(n-1, 0, str.append(0));
           // printBinString(n-1, 0, str.append(1));
       // } else {
          //   printBinString(n-1, 0, str.append(0));
       // }

       //code ko small and beautifully bhi likh skte hai:

        printBinString(n-1, 0, str+"0");
        if(lastplace == 0) {
            printBinString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        printBinString(3, 0, "");
    }
}