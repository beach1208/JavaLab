package FlowControl;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char a = scan.next().charAt(0);
        if(a == 'a'|| a == 'i' || a == 'u' || a == 'e' || a == 'o'){
            System.out.println("Input letter is Vowel");
        }
        else if((a >= 'a'&& a <='z') || (a >= 'A' && a <= 'Z')){
            System.out.println("Input letter is Consonant");
        }else {
            System.out.println("Error");
        }
    }
}
