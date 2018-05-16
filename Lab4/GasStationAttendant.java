package Lab4;

import java.util.Objects;

public class GasStationAttendant extends Employee implements Comparable{
    private double numberOfDollarsStolenPerDay;
    final static double OVERTIME_PAY_RATE = 1.5;

    /**
     *
     * @param name constructor of super class String name parameter
     * @param numberOfDollarsStolenPerDay constructor of Gas Station Attendant parameter
     */

    public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {
        super(name);
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    public GasStationAttendant(String name) {
        super(name);

    }

    /**
     *
     * @return number of dollars stolen per day
     */
    public double getNumberOfDollarsStolenPerDay() {
        return numberOfDollarsStolenPerDay;
    }

    /**
     *
     * @return over time pay rate
     */
    @Override
    public double getOverTimePayRate() {
        return 1.5;
    }

    /**
     *
     * @return Dress code from enum class
     */
    @Override
    public DressCode getDressCode() {
        return DressCode.UNIFORM;
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
     * @return if post secondary education is true or false
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
        return "pump";
    }

    /**
     *
     * @param o compare different objects  of employees
     * @return
     */

    @Override
    public int compareTo(Object o) {
        if(this.numberOfDollarsStolenPerDay > ((GasStationAttendant)o).numberOfDollarsStolenPerDay){
            return 1;
        }else if(this.numberOfDollarsStolenPerDay < ((GasStationAttendant)o).numberOfDollarsStolenPerDay){
            return - 1;
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
        if(this.numberOfDollarsStolenPerDay == ((GasStationAttendant)obj).numberOfDollarsStolenPerDay){
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

        return Objects.hash(numberOfDollarsStolenPerDay);
    }
}
