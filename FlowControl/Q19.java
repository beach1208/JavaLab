package FlowControl;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int a = 0;
        int b = 0;

        for(int row = 1; row <= input;row++)
        {
            if(row % 2 == 0) {
                 a = 1;
                 b = 0;
            } else {
                 a = 0;
                 b =1;
            }

            for(int col =1; col <= row; col++)
                if( col % 2 == 0)
                    System.out.print(a);
                else
                    System.out.print(b);
            System.out.println(" ");
        }
    }
}
