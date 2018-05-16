package Assignment2and3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        for(int year = y + 1; year <= 10000; year++) {
            String year_str = String.valueOf(year);
//            if (checkIfDistinct(year_str)) {
//                System.out.println(year_str);
//                break;
//            }
            HashSet<String> set = new HashSet<>(Arrays.asList(year_str.split("")));
            if (set.size() == year_str.length()) {
                // distinct digits
                System.out.println(year_str);
                break;
            }
        }
    }
//    public static boolean checkIfDistinct(String y) {
//        for(int i = 0; i < y.length(); i++) {
//            for(int j = i + 1; j < y.length(); j++) {
//                if (y.substring(i, i+1).equals(y.substring(j, j+1))) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

}



