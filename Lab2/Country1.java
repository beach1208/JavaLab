package Lab2;

public class Country1 {

    private String name = "Canada";
    private Province1[] provinces;

    public Country1() {

        this.provinces = new Province1[10];
        this.provinces[0] = new Province1("Ontario", "Toronto", 13);
        this.provinces[1] = new Province1("Quebec", "Quebec City", 8);
        this.provinces[2] = new Province1("British Columbia", "Victoria", 4);
        this.provinces[3] = new Province1("Alberta", "Edmonton", 4);
        this.provinces[4] = new Province1("Manitoba", "Winnipeg", 1);
        this.provinces[5] = new Province1("Saskatchewan", "Regina", 1);
        this.provinces[6] = new Province1("Nova Scotia", "Halifax", (int) 0.9);
        this.provinces[7] = new Province1("New Brunswick", "Fredericton", (int) 0.7);
        this.provinces[8] = new Province1("Newfoundland and Labrador", "St. John's", (int) 0.5);
        this.provinces[9] = new Province1("Prince Edward Island", "Charlottetown", (int) 0.1);

    }

    /**
     * printing all valid provinces
     */
    public void displayAllProvinces() {
        for(Province1 province :this.provinces) {
            System.out.println(province.getDetails());
        }
    }

    /**
     *
     * @param min
     * @param max
     * @return count how many provinces have more than min population and less than max population
     */
    public int howManyHaveThisPopulation(int min, int max) {
        int count = 0;
        for(Province1 province :this.provinces) {
            if (province.getPopulationInMillions() >= min && province.getPopulationInMillions() <= max) {
                count++;
            }
        }
        return count;
    }
}
