public class Butterfly_Pattern {
    public static void main(String args[]) {
        //1st half
        //outer loop
        int n=4;
        for(int i=1; i<=n; i++) {
            //inner loop
            //star
            for(int j=1; j<=i; j++) {
                System.out.print("*");

            }
            //spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }


        //2nd half
        for(int i=n; i>=1; i--) {
            //inner loop
            //star
            for(int j=1; j<=i; j++) {
                System.out.print("*");

            }
            //spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
        
    }
}
//logic:
//ek line me star+space+star print ho rhe h
//my mistake--baar baar sirf star+space kar rha tha...
//lines increases and spaces decreases to n-i wala logic mind me ana chahiye
//and alsoo mirror image wala concept remember
//ham last wale spaces ko ignore krte hai..