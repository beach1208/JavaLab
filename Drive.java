package Lab1;

public class Drive {
    public static void main(String[] args) {
        Model usermodel = new Model();

        usermodel.setFirstName("Susan");
        usermodel.setLastName("Smith");
        usermodel.setHeight(70);
        usermodel.setWeight(120.0);
        usermodel.setCanTravel(true);
        usermodel.setCanSmoke(false);


        usermodel.getFirstName();
        usermodel.getLastName();
        usermodel.getHeightInFeetAndInches();
        usermodel.getWeightKg();
        usermodel.getCanTravel();

//        System.out.println(usermodel.getFirstName());
//        System.out.println(usermodel.getLastName());
//        System.out.println(usermodel.getHeightInFeetAndInches());
//        System.out.println(usermodel.getWeightKg());
//        System.out.println(usermodel.getCanTravel());
        usermodel.printDetails();
        usermodel.displayModelDetails(true);
    }
}
