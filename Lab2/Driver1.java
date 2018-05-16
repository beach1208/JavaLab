package Lab2;

public class Driver1 {

    public static void main(String[] args) {

        Country1 c = new Country1();
        c.displayAllProvinces();
        int num = c.howManyHaveThisPopulation(6, 13);
        System.out.println(num);
    }
}
