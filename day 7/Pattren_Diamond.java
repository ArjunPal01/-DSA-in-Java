public class Pattren_Diamond {
    public static void main (String args[]) {
        int n=4;
        //1st half
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        //spaces
        for(int i=n; i>=1; i--) {
            //inner loop
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}