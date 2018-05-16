package Lab4;

public interface Employable {
    /**
     *
     * @return Dress code
     */
    public DressCode getDressCode();

    /**
     *
     * @return if its paid or not
     */
    public boolean isPaidSalary();

    /**
     *
     * @return if its post secondary education required
     */
    public boolean postSecondaryEducationRequired();

    /**
     *
     * @return work verb
     */
    public String getWorkVerb();
}
