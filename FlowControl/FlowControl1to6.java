package FlowControl;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class FlowControl1to6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1
        String number = scan.nextLine();
        String result1 = positiveOrNegative(Integer.valueOf(number));
        System.out.println(result1);

        //2
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();
        String num3 = scan.nextLine();
        String result2 = threeNumbers(Integer.valueOf(num1), Integer.valueOf(num2), Integer.valueOf(num3));
        System.out.println(result2);

        //3
        String num = scan.nextLine();
        String result3 = floatingNum(Float.valueOf(num));
        System.out.println(result3);

        //4
        String num4 = scan.nextLine();
        String result4 = dayOfWeek(Integer.valueOf(num4));
        System.out.println(result4);

        //5
        String x = scan.nextLine();
        String y = scan.nextLine();
        String result5 = sameFloat(Double.valueOf(x), Double.valueOf(y));
        System.out.println(result5);

        //6
        String year = scan.nextLine();
        String month = scan.nextLine();
        String result6 = yearDays(Integer.valueOf(year), Integer.valueOf(month));
        System.out.println(result6);


    }

    //1
    public static String positiveOrNegative(int num) {
        if (0 < num) {
            return "Number is positive";
        }
        return "Number is negative";
    }

    //2
    public static String threeNumbers(int num1, int num2, int num3) {
        if ((num2 < num1) && (num3 < num1)) {
            return "The greatest: " + num1;
        }
        if ((num1 < num2) && (num3 < num2)) {
            return "The greatest: " + num2;
        }
        if (num1 < num3 && num2 < num3) {

        }
        return "The greatest: " + num3;
    }

    //3
    public static String floatingNum(float num) {
        int large = 1000000;
        int first = 1;
        if (num == 0) {
            return "zero";
        }
        if (num > large) {
            return "large";
        }

        if (num < first) {
            return "small";
        }
        if (num > 0) {
            return "positive number";
        }
        return "negative number";
    }

    //4
    public static String dayOfWeek(int num) {
        if (num == 1) {
            return "Monday";
        } else if (num == 2) {
            return "Tuesday";
        } else if (num == 3) {
            return "Wednesday";
        } else if (num == 4) {
            return "Thursday";
        } else if (num == 5) {
            return "Friday";
        } else if (num == 6) {
            return "Saturday";
        } else if (num == 7) {
            return "Sunday";
        }
        return "nothing";
    }

    //5
    public static String sameFloat(double x, double y) {
//        BigDecimal num1 = new BigDecimal(x);
//        num1 = num1.setScale(3, BigDecimal.ROUND_HALF_UP);
//
//        BigDecimal num2 = new BigDecimal(y);
//        num2 = num2.setScale(3, BigDecimal.ROUND_HALF_UP);
        double x1 = Math.round(x * 1000);
        double y1 = Math.round(y * 1000);

        if (x1 == y1) {
        }
        return "They are the same up to three decimal places";
    }


    //6
    public static String yearDays(int month, int year) {
        int year1 = year;
        month = Calendar.FEBRUARY;
        int day1 = 1;

        Calendar cal = new GregorianCalendar(year1, month, day1);
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return "days " + days;
    }
}








