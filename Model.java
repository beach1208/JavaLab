package Lab1;

/**
 * @author Nagisa Kojima
 */
public class Model {
    private String firstName;
    private String lastName;
    private int heightInches;
    private double doubleWeightKg;
    private boolean canTravel;
    private boolean smoker;
    static String occupation = "modeling";

    public static final int INCHES_PER_FOOT = 12;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

   //constructor

    public Model(){

    }

    public Model(String firstName,
            String lastName,
            int heightInches,
            double doubleWeightKg,
            boolean canTravel,
            boolean smoker){
        setFirstName(firstName);
        setFirstName(lastName);
        setWeight(doubleWeightKg);
        setHeight(heightInches);
        setCanTravel(canTravel);
        setCanSmoke(smoker);
        ;
    }

    public Model(String firstName,
                 String lastName,
                 int heightInches,
                 double doubleWeightKg){
        setFirstName(firstName);
        setFirstName(lastName);
        setWeight(doubleWeightKg);
        setHeight(heightInches);
        setCanTravel(canTravel);
        setCanSmoke(smoker);

    }
    /**
     *
     * @param canTravel set boolean if model canTravel is true or not
     */
    public final void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     *
     * @param smoker set boolean if model is smoker or not
     */
    public final void setCanSmoke(boolean smoker) {
        this.smoker = smoker ;
    }

    /**
     *
     * @param firstName set the first name of model which is more then 3 and less than 20 characters
     */
    public final void setFirstName(String firstName) {
        if((firstName!= null) && (firstName.length() >= 3) && (firstName.length() <= 20)) {
            this.firstName = firstName;
        }
    }

    /**
     *
      * @param lastName set the last name of model which is more than 3 and less then 20 characters
     */
    public final void setLastName(String lastName) {
        if((lastName!= null) && (lastName.length() >= 3) && (lastName.length() <= 20)) {
            this.lastName = lastName;
        }
    }

    /**
     *
     * @param kilograms convert pounds to kilogram
     */
    public final void setWeight(long kilograms){
        if((kilograms != 0.0) && (36.2874 <= kilograms ) && (kilograms <= 127.006)){
            this.doubleWeightKg = kilograms * 2.20462;
        }
    }

    /**
     *
     * @param pounds set model weight which is more than 80 and less than 200 pounds
     */
    public final void setWeight(double pounds){
        if((pounds != 0.0) && (80 <= pounds ) && (pounds <= 280)){
            this.doubleWeightKg = pounds;
        }
    }

    /**
     *
     * @param feet check if model height is taller than 2 feet and shorter than 7 feet
     * @param inches check if model height is taller than 24 inches and shorter than 84 inches
     */
    public final void setHeight(int feet, int inches){
        if((inches != 0) && (24 <= inches ) && (inches <= 84)){
            this.heightInches = inches;
        }else if((feet != 0) && (2 <= feet) && (feet <= 7)){
            this.heightInches = feet * 12;
        }
    }

    /**
     *
     * @param inches check if model height is taller than 24 inches and shorter than 84 inches
     */
    public final void setHeight(int inches) {
        if ((inches != 0) && (24 <= inches) && (inches <= 84)) {
            this.heightInches = inches;
        }
    }


    /**
     *
     * @return Convert height in Feet and Inches*/
    public String getHeightInFeetAndInches(){
        return String.valueOf(heightInches);
    }

    /**
     *
     * @return getting model's weight*/
    public long getWeightKg() {
            return (long)this.doubleWeightKg;
    }

    /**
     *
     * @return getting model's first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     *
     * @return getting model's last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     *
     * @return getting the information if model can travel
     */
    public boolean getCanTravel() {
        return this.canTravel;
    }

//    /**
//     *
//     * @return
//     */
//    public boolean isCanTravel() {
//        return this.canTravel;
//    }

    /**
     *
     * @return getting the information if model can smoke
     */
    public boolean isSmoker() {
        return this.smoker;
    }

    /**
     *
     * @return a person's occupation is set to model which is constant
     */
    public static String getOccupation(){
        return occupation;
    }

    /**
     * print About model which is first name, last name, height,weight, if a model travel or smoke and hour rate of salary
     */
    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches() + " inches");
                System.out.println("Weight: " + Math.round(getWeightKg()) + " pounds");
        System.out.println("Hourly rate: " + calculatePayDollarsPerHour());
        if(canTravel == true){
            System.out.println("Does travel ");
        }else{
            System.out.println("Does not travel ");
        }
        if(smoker == true){
            System.out.println("Does smoke ");
        }else{
            System.out.println("Does not smoke ");
        }
    }

    /**
     *
     * @return check if model body type and if she smokes and travel anc caluculate how much she gets per hour
     */
    public int calculatePayDollarsPerHour(){
        int temp = 0;
        if((heightInches >= TALL_INCHES) && (doubleWeightKg <= THIN_POUNDS) && (canTravel == false) && (smoker == false) ){
            return temp = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        else if((heightInches >= TALL_INCHES) && (doubleWeightKg <= THIN_POUNDS) && (canTravel == true) && (smoker == false)){
            return temp = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        else if((heightInches >= TALL_INCHES) && (doubleWeightKg <= THIN_POUNDS) && (canTravel == true) && (smoker == true)){
            return temp = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        else if((heightInches >= TALL_INCHES) && (doubleWeightKg <= THIN_POUNDS) && (canTravel == false) && (smoker == true)){
            return  temp = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }

        if((heightInches <= TALL_INCHES) && (doubleWeightKg >= THIN_POUNDS) && (canTravel == false) && (smoker == false)){
            return temp = BASE_RATE_DOLLARS_PER_HOUR;
        }
        else if((heightInches <= TALL_INCHES) && (doubleWeightKg >= THIN_POUNDS) && (canTravel == true) && (smoker == false)){
            return  temp = BASE_RATE_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        else if((heightInches <= TALL_INCHES) && (doubleWeightKg >= THIN_POUNDS) && (canTravel == true) && (smoker == true)){
            return  temp =BASE_RATE_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        else if((heightInches <= TALL_INCHES) && (doubleWeightKg >= THIN_POUNDS) && (canTravel == false) && (smoker == true)) {
            return temp = BASE_RATE_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return temp;
    }

    /**
     *
     * @return converting height to feet and inches
     */
    public String convertHeightToFeetInches(){
        int inches1 = heightInches % 12;
        int feet1 = heightInches / 12;
        return feet1 + "feet" + inches1 + "inches";
    }

    /**
     * print more details About model which is first name, last name, height,weight, if a model travel or smoke and hour rate of salary
     * and covert height to display as feet and inches
     */
    public void displayModelDetails(){
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + convertHeightToFeetInches());
        System.out.println("Weight: " + Math.round(getWeightKg()) + " pounds");
        System.out.println("Hourly rate: $ " + calculatePayDollarsPerHour());
        if(canTravel == true){
            System.out.println("yep");
        }else{
            System.out.println("nope");
        }
        if(smoker == true){
            System.out.println("yep");
        }else{
            System.out.println("nope ");
        }
    }

    /**
     *
     * @return converting height to cm
     */
    public double convertHeightCm() {
        return heightInches * 2.54;
    }

    /**
     *
     * @return converting weight to kg
     */
    public double convertWeightKg(){
        return doubleWeightKg / 2.20462;
    }

    /**
     *
     * @param metricUnits if metricUnits = true, this method is going to overload previous methods which is same name as displayModeldetails.
     *                    This method is going to overload height inches to cm and pounds to kg.
     */

    public void displayModelDetails(boolean metricUnits){
        if(metricUnits == true) {
            System.out.println("Name: " + getFirstName() + " " + getLastName());
            System.out.println("Height: " + Math.round(convertHeightCm()));
            System.out.println("Weight: " + Math.round(convertWeightKg()) + " kg");
            System.out.println("Hourly rate: $ " + calculatePayDollarsPerHour());
            if(canTravel == true){
                System.out.println("Travel: yep");
            }else{
                System.out.println("Travel: nope");
            }
            if(smoker == true){
                System.out.println("Smoke: yep");
            }else{
                System.out.println("Smoke: nope ");
            }
        }


    }

}

