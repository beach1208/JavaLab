package FlowControl;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int half = Integer.valueOf(scan.nextLine());
        for(int line = 1; line <= half; line++) {
            // space
            int spaces = half - line;
            for(int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            // num backwards
            for(int nums = half - spaces; nums > 0; nums--) {
                System.out.print(nums);
            }
            // num forwards
            for(int nums = 2; nums <= half - spaces; nums++) {
                System.out.print(nums);
            }
            System.out.println();
        }

        for(int line = half-1; line >= 0; line--) {
            // space
            int spaces = half - line;
            for(int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            // num backwards
            for(int nums = half - spaces; nums > 0; nums--) {
                System.out.print(nums);
            }
            // num forwards
            for(int nums = 2; nums <= half - spaces; nums++) {
                System.out.print(nums);
            }
            System.out.println();
        }

    }
}
