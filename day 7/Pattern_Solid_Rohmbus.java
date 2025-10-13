public class Pattern_Solid_Rohmbus{
    public static void main (String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            //inner loop
            //for spaces
            for(int j=1; j<=n-i ; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=n; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
   

