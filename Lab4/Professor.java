package Lab4;

import java.util.Objects;

public class Professor extends Employee implements Comparable {
    private String teachingMajor;
    final static double OVERTIME_PAY_RATE = 2.0;

    /**
     *
     * @param name construct string name
     * @param teachingMajor construct String teaching major
     */
    public Professor(String name, String teachingMajor) {
        super(name);
        this.teachingMajor = teachingMajor;
    }

    public Professor(String name) {
        super(name);

    }

    /**
     *
     * @return teaching major
     */
    public String getTeachingMajor() {
        return teachingMajor;
    }

    /**
     *
     * @return over time pay rate
     */
    @Override
    public double getOverTimePayRate() {
        return 2.0;
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
        return true;
    }
    /**
     *
     * @return work verb
     */
    @Override
    public String getWorkVerb() {
        return "teach";
    }

    /**
     *
     * @param o compare different objects  of employees
     * @return integer
     */
    @Override
    public int compareTo(Object o) {
        if("Computer System" == ((Professor)o).teachingMajor){
            return 1;
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
        if(this.teachingMajor == ((Professor)obj).teachingMajor){
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
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }

    @Override
    public int hashCode() {

        return Objects.hash(teachingMajor);
    }
}
