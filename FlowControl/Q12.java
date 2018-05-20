package FlowControl;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();


        for (int number = 1; number <= num; number++){
            System.out.println("Number is "+ number + " and cube of " + number + " is: " + number*number*number);
        }



    }
}
