class Kadane_Algo {
    public static void KadaneAlgo(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<number.length; i++) {
            cs = cs + number[i];

            if (cs < 0) {
                cs = 0;
            }
            
            ms = Math.max(ms , cs);

        }
        System.out.println("Max subarray sum is : " + ms);
        
        
    } 
    public static void main (String args[]) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        KadaneAlgo(number);
    }

}//output : 7
//this is optimised method buddy to find sum of subarray
//TC less and also it takes less space in memory so SC is less...
//only one loop and 2 variable buddy...so optimised method..
