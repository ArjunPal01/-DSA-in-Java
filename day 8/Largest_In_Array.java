import java.util.*;

public class Largest_In_Array {
    public static int getlargestt(int numbers[]) {
        int largestt = Integer.MIN_VALUE; // -infinity

        for(int i=0; i<numbers.length; i++) {
            if(largestt < numbers[i]) {
                largestt = numbers[i];
            }
        }
        return largestt;

    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("Larrgest number is : " + getlargestt(numbers));

    }
}

//my mistake: -infinity ka syntax galat kr diya tha buddy
//Integer.MIN.VALUE → wrong
//Integer.MIN_VALUE → correct