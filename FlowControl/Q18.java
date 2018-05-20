package FlowControl;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());
        int num = 1;
        for(int line = 1; line <= input; line++) {
            // spaces
            for(int space = 0; space < (input - line); space++){
                System.out.print(" ");
            }
            // content
            for(int content = 0; content < line; content++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num++;
        }
    }
}
