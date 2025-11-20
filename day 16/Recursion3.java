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

    public static int pairfriends(int n) {

        if(n == 1 || n == 2) { //base case
            return n;
        }
        //choices
        //single
        int fnm1 = pairfriends(n-1);
        
        //pair
        int fnm2 = pairfriends(n-2);
        int pairways = (n-1)*fnm2;

        //total ways
        int totways = fnm1 + pairways;
        return totways; //java will allow us to run fn. directly in return fn.

        //return pairfriends(n-1) + (n-1)*pairfriends(n-2);  so we can directly whole code in one line...smart na

        //ooh buddy this bracket shows me error..bracket thoda dhyan se use karo
      //agar bracket ki wajah se error aa rha ho to last me barcket add kr lene ka
      //so it's almost solve 90% problem..
    }
      

      public static int tillingProblem(int n) {  //2 * n (floor size)
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }
        //we have choices buddy:
        //kaam
        //vertical choices
        int fnm1 = tillingProblem(n-1);

        //horizontal choices 
        int fnm2 = tillingProblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
       // return tillingProblem(n-1) + tillingProblem(n-2);  directly write this line instead of whole code:
      }

    public static void main(String args[]) {
       System.out.println(tillingProblem(3));
    }
}
