package FlowControl;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());

        for(int line = input; line > 0; line--) {
            // space (input - line)
            for(int sp = input - line; sp > 0; sp--) {
                System.out.print(" ");
            }
            for(int at = 0; at < line; at++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
