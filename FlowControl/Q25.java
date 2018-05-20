package FlowControl;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        char a = 65; // A: 65
        Scanner scan = new Scanner(System.in);

        int half = Integer.valueOf(scan.nextLine());
        for(int line = 1; line <= half; line++) {
            int spaces = half-line;
            for(int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for(char ch = a; ch < a + (half-spaces); ch++) {
                System.out.print(ch);
            }

            for(int ch = a + (half-spaces) - 1; ch > a; ch--) {
                System.out.print(((char)(ch - 1)));
            }
            System.out.println();
        }

        for(int line = half - 1; line > 0; line--) {
            int spaces = half-line;
            for(int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for(char ch = a; ch < a + (half-spaces); ch++) {
                System.out.print(ch);
            }

            for(int ch = a + (half-spaces) - 1; ch > a; ch--) {
                System.out.print(((char)(ch - 1)));
            }
            System.out.println();
        }
    }


}
