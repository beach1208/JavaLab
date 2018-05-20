package FlowControl;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        System.out.println("Input number: " + num);
        System.out.println("The first n natural numbers are:");

        for(int i = 1; i <= num; i++){
            System.out.println(i);
            sum+= i;
        }


        System.out.println("The Sum of Natural Number up to " + num + " terms: " + sum);
    }
}
