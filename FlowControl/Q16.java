package FlowControl;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();


        for(int row = 1; row <= rows; row++){
            for(int col = 5; col > row; col--){
                System.out.print(row);

            }
            System.out.println();
        }
    }
}
