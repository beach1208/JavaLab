package Lab4;

/**
 * Author @Nagisa Kojima
 */
public abstract class Employee implements Employable {
    protected String name;

    /**
     *
     * @param name constructor of Employee class
     */
    public Employee(String name) {
        this.name = name;
    }

    /**
     *
     * @return method of getting over time pay Rate
     */
    public abstract double getOverTimePayRate();

    /**
     *
     * @param name setting employee name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return employee name
     */

    public String getName() {
        return name;
    }


}
