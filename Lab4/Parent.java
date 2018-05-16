package Lab4;

import java.util.Objects;

public class Parent extends Employee implements Comparable {
    private int numberOfHoursSpentPerWeekWithKids;
    final static double OVERTIME_PAY_RATE = -2.0;

    /**
     *
     * @param name construct string name
     * @param numberOfHoursSpentPerWeekWithKids construct int number of hours
     */
    public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
        super(name);
        this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
    }

    public Parent(String name) {
        super(name);

    }

    /**
     *
     * @return number og hours
     */
    public int getNumberOfHoursSpentPerWeekWithKids() {
        return numberOfHoursSpentPerWeekWithKids;
    }

    /**
     *
     * @return over time pay rate
     */
    @Override
    public double getOverTimePayRate() {
        return -2.0;
    }

    /**
     *
     * @return dress code from enum class
     */
    @Override
    public DressCode getDressCode() {
        return DressCode.ANYTHING;
    }

    /**
     *
     * @return if salary is paid or not
     */
    @Override
    public boolean isPaidSalary() {
        return false;
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
        return "care";
    }

    /**
     *
     * @param o compare different objects  of employees
     * @return integer
     */
    @Override
    public int compareTo(Object o) {
        if(this.numberOfHoursSpentPerWeekWithKids > ((Parent)o).numberOfHoursSpentPerWeekWithKids){
            return 1;
        }else if(this.numberOfHoursSpentPerWeekWithKids < ((Parent)o).numberOfHoursSpentPerWeekWithKids){
            return -1;
        }else{
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
        if(this.numberOfHoursSpentPerWeekWithKids == ((Parent)obj).numberOfHoursSpentPerWeekWithKids){
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

        return Objects.hash(numberOfHoursSpentPerWeekWithKids);
    }
}
