package FlowControl;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        int col = 1, space, i, j;

        Scanner scan = new Scanner(System.in);
        int line = Integer.valueOf(scan.nextLine());

        for (i = 0; i < line; i++) {
            for (space = 1; space <= line - i; space++) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                if (j == 0) {
                    col = 1;
                } else {
                    col = col * (i - j + 1) / j;
                }
                System.out.print(" " + col);
            }
            System.out.println();
        }


    }

}
