package Lab4;

import java.util.Objects;

public class HockeyPlayer extends Employee implements Comparable{
    private int numberOfGoals;
    final static double OVERTIME_PAY_RATE = 0.0;

    /**
     *
     * @param name construct string name
     * @param numberOfGoals construct int number of goals
     */
    public HockeyPlayer(String name, int numberOfGoals) {
        super(name);
        this.numberOfGoals = numberOfGoals;
    }

    public HockeyPlayer(String name) {
        super(name);

    }

    /**
     *
     * @return number of goals of hockey player
     */
    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    /**
     *
     * @return over time pay rate
     */
    @Override
    public double getOverTimePayRate() {
        return 0.0;
    }

    /**
     *
     * @return dress code from enum class
     */
    @Override
    public DressCode getDressCode() {
        return DressCode.FANCY;
    }

    /**
     *
     * @return if salary is paid or not
     */
    @Override
    public boolean isPaidSalary() {
        return true;
    }

    /**
     *
     * @return if post second education is required or not
     */
    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    /**
     *
     * @return work verb
     */
    @Override
    public String getWorkVerb() {
        return "play";
    }

    /**
     *
     * @param o compare different objects  of employees
     * @return integer
     */
    @Override
    public int compareTo(Object o) {
        if(this.numberOfGoals > ((HockeyPlayer)o).numberOfGoals){
            return 1;
        }
        else if(this.numberOfGoals < ((HockeyPlayer)o).numberOfGoals){
            return - 1;
        }
        else {
            return 0;
        }
    }

    /**
     *
     * @param obj
     * @return true or false by checking if object is equal to another object
     */
    @Override
    public boolean equals(Object obj) {
        if(this.numberOfGoals == ((HockeyPlayer)obj).numberOfGoals){
            return true;
        }
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }else{
            return false;
        }
    }

    /**
     *
     * @return hashcode
     */
    @Override
    public int hashCode() {

        return Objects.hash(numberOfGoals);
    }
}
