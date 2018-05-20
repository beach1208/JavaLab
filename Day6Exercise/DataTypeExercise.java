package Day6Exercise;
/**
 * @auther Nagisa Kojima
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class DataTypeExercise {
    public static void main(String[] args) {
        //1
        Scanner scan = new Scanner(System.in);
        String fahr = scan.nextLine();

        String result =fahrenheitToCelsius(Integer.valueOf(fahr));
        System.out.println(result);

        //2
        String inches = scan.nextLine();
        String result2 = inchesToMeter(Integer.valueOf(inches));// integer.valueOf(string)
        System.out.println(result2);

        //3
        String number = scan.nextLine();
        String result3 = addnumbers(Integer.valueOf(number));
        System.out.println(result3);

        //4
        String minutes = scan.nextLine();
        String result4 = minutesToYears(Integer.valueOf(minutes));
        System.out.println(result4);

        //5
        double height = scan.nextDouble();
        double weight = scan.nextDouble();
        String result5 = computeBMI(height,weight);
        System.out.println(result5);

        //6
        float distance = scan.nextFloat();
        float hour = scan.nextFloat();
        float minute = scan.nextFloat();
        float second = scan.nextFloat();
        String result6 = computeSpeed(distance,hour,minute,second);
        System.out.println(result6);

        //7
        int num = scan.nextInt();
        String result7 = displayNumber(num);
        System.out.println(result7);

        //8
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String result8 = computeNumbers(num1,num2);
        System.out.println(result8);


    }

    //method
    // 1
    public static String fahrenheitToCelsius(int fahrenheit){
        double celsius = (fahrenheit - 32)/1.8;
        return fahrenheit + " degree Fahrenheit is equal to " + celsius + " in celusius";
    }
    //2
    public static String inchesToMeter(int inches){
        double meters = inches * 0.0254;
        return inches + " inch is " + meters + " in meter";
    }

    //3
    public static String addnumbers(int num){
        int hundred = num % 10;
        int rest = num / 10;
        int ten = rest % 10;
        rest = rest / 10;
        int one = rest % 10;
        int sum = one + ten + hundred;
        return "The sum of all digits in " + num + "is " + sum;
}

    //4
    public static String minutesToYears(int minutes){
        int year = minutes / 525600;
        int rest = minutes % 525600;
        int day = rest / 1440;

        return minutes + " is approximately " + year +" years and " + day + " days";
    }

    //5
    public static String computeBMI(double weight,double height){
        double bmi = weight / (height * height);
//        double rounded = Math.round(BMI * 1000)/1000;
        BigDecimal x = new BigDecimal(bmi);
        x = x.setScale(3, BigDecimal.ROUND_HALF_UP);

        return "Body Mass Index is " + x;
    }

    //6
    public static String computeSpeed(float distance, float hour, float minute, float second){
        float timeInSeconds = (hour *3600) + (minute * 60) + second;
        float mps = distance / timeInSeconds;
        float kph = (distance / 1000.0f) / (timeInSeconds / 3600.0f);
        float mph = kph / 1.609f;
        return " Your speed in meters/second is " + mps + " Your speed in km/h is " + kph + " Your speed in miles/h is " + mph;
    }

    //7
    public static String displayNumber(int num){
        int square = num * num;
        int cube = num * square;
        int fourth = num * cube;
        return " Square: " + square + " Cube: " + cube + " Fourth power: " + fourth;
    }

    //8
    public static String computeNumbers(int num1, int num2){
        int sum = num1 + num2;
        int difference =  num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2;
        int distan = num1 - num2;
        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);

        return "Sum of two integers: " + sum + " Difference of two integers: " + difference +
                " Product of two integers: " + product + " Average of two integers: " + average + " Distance of two integers: " + distan
                +  " Max integer: " + max + " Min integer: " + min;
    }



}
