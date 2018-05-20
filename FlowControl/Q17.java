package FlowControl;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.valueOf(scan.nextLine());

        int num = 1;
        for(int row = 1; row <= rows; row++){
            for(int col = 0; col < row; col++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        scan.close();
    }
}
