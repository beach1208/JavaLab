package Assignment2and3;

public class MyCalculator implements AdvancedArithmetic {
    public MyCalculator() {
    }

    @Override
    public int divisor_sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if(n >= 1000){
            System.out.println("Input number have to be less than 1000");
        }else if(n % i == 0) {
                total += i;
            }
        }
        return total;
    }
}
