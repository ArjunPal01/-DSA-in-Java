public class Half_pyramid{
  public static void main(String args[]){
    int n=5;

    for (int i=1; i<=n; i++){ //outer loop
      //for inner loop
      //spaces
      for (int j=1; j<=n-i; j++){
        System.out.print(" ");

      }
      //stars
      for (int j=1; j<=i ; j++){
        System.out.print("*");

      }
      System.out.println();
      

    }
  }

}