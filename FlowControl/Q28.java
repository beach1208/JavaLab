package FlowControl;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 < num2 && num2 < num3 && num1 < num3){
            System.out.println("Increasing order");
        }
        else if(num1 > num2 && num2 > num3 && num1 > num3){
            System.out.println("Decreasing order");

        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
