package FlowControl;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
                System.out.println(2*i-1);
                sum = sum + 2 * i - 1;
            }
        System.out.println("The Sum of odd Natural Number up to  " + num + " terms is: "  + sum);
        }

}

