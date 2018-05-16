package Lab2;

/**
 * @author Nagisa Kojima
 */
public class Province1 {
    public final static int DEFAULT_POPULATION_MILLIONS = 4;
    public final static String DEFAULT_PROVINCE = "British Columbia";
    public final static String DEFAULT_CAPITAL = "Victoria";
    private String name;
    private String capital;
    private int populationInMillions;

    public Province1() {
        this.name = DEFAULT_PROVINCE;
        this.capital = DEFAULT_CAPITAL;
        this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
    }

    public Province1(String name, String capital, int populationInMillions) {
        if (isValidPopulation(populationInMillions) && isValidProvince(name) && isValidCapitalCity(capital)) {
            this.name = name;
            this.capital = capital;
            this.populationInMillions = populationInMillions;
        } else {
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
        }

    }


    /**
     * check if parameter city is in array of capitals. if its in, return true, if not return false.
     * @param city
     * @return
     */
    private boolean isValidCapitalCity(String city) {
        String[] capitals = {
                "Toronto",
                "Quebec City",
                "Victoria",
                "Edmonton",
                "Winnipeg",
                "Regina",
                "Halifax",
                "Fredericton",
                "St. John's",
                "Charlottetown"
        };
        for(String capital: capitals) {
            if (city.equals(capital)) {
                return true;
            }
        }
        return false;

    }

    /**
     *
     * @param province check if parameter of province is in provinces array. if its, return true, if not return false.
     * @return
     */
    private boolean isValidProvince(String province) {
        String[] provinces = {
                "Ontario", "ON",
                "Quebec", "QC",
                "British Columbia", "BC",
                "Alberta", "AB",
                "Manitoba", "MB",
                "Saskatchewan", "SK",
                "Nova Scotia", "NS",
                "New Brunswick", "NB",
                "Newfoundland and Labrador", "NL",
                "Prince Edward Island", "PE",
                "Northwest Territories", "NT",
                "Nunavut", "NU",
                "Yukon", "YT"
        };
        int i = 0;
        while (i < provinces.length) {
            if (provinces[i].equals(province)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /**
     * check if population is valid population. if its valid, return true, if not return false.
     * @param population
     * @return
     */

    private boolean isValidPopulation(int population) {
        if (population >= 4 && population <= 38){
            return true;
        }
        return false;
    }
    /**
     *
     * @return getting summary of all information
     */
    public String getDetails() {
        return "The capital of " + this.name + " (pop. " + this.populationInMillions + " millions) is " + this.capital;
    }

    public String getName() {
        return name;
    }
    /**
     *
     * @param  name setter
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     * @return getter capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     *
     * @param capital setter
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     *
     * @return population getter
     */
    public int getPopulationInMillions() {
        return populationInMillions;
    }

    /**
     *
     * @param populationInMillions setter
     */
    public void setPopulationInMillions(int populationInMillions) {
        this.populationInMillions = populationInMillions;
    }
}
