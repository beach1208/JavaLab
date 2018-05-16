package Assignment2and3;

import java.util.Scanner;

public class Drive {
    public static void main(String[] args) {
        MyCalculator c1 = new MyCalculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("I implemented: AdvancedArithmetic: ");
        int input = scan.nextInt();

        System.out.println(c1.divisor_sum(input));
    }
}
