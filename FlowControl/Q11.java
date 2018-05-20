package FlowControl;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();
        int sum = 0;
        double average = 0;

        for (int i = 1; i <= num5; i++){
            sum+= i;
            average = sum / num5;

            System.out.println(i);

        }
        System.out.println("The sum of 5 is "+ sum);
        System.out.println("The average is " + average);

    }
}
