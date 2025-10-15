public class Pairs_Array {
    public static void printpairs(int numbers[]) {
         int TP = 0; 
        for(int i=0; i<numbers.length; i++) { //i=0 means 0 index wala number
           
            int current = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ") ");
                TP++;

            }
            System.out.println();

        }
        System.out.println("Total pairs = " + TP);

    }

    public static void main (String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printpairs(numbers);

    }

}

//(1,2) and (2,1) both are same pairs buddy..
