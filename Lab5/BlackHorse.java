package Lab5;

public class BlackHorse implements Horse{
    private String name;
    private int weight;
    private String country;

    public BlackHorse(String name, int weight, String country) {
        this.name = name;
        this.weight = weight;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Black horse is: " + name + " Weight: " + weight;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }
}
