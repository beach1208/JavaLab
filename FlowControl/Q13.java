package FlowControl;

import java.util.Scanner;

public class Q13 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();


            for (int number = 0; number <= num; number++){
                System.out.println(num + "X" + number + "=" + num*number);
            }



        }
}

