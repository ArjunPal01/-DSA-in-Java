public class Hollow_rectangle{
    public static void main(String args[]){
        int n=5;
        int totalrows=5;
        int totalcols=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=totalcols; j++){
                if(i==1 || i==totalrows || j==1 || j==totalcols){  //boundary condition
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");

                }

            }
            System.out.println();
        }
        
    }
}