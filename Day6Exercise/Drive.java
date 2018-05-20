package Day6Exercise;

public class Drive {

    public static void main(String[] args) {



        TextBooks tx1 = new TextBooks(500,"Science",100.0,1995);
        tx1.getPages();
        tx1.getName();
        tx1.getPrice();
        tx1.getYear();
        tx1.printInfo();

//        TextBooks tx2 = new TextBooks(234,"Math");
//        tx2.getPages();
//        tx2.printInfo();

        TechnicalJounals tx2 = new TechnicalJounals(600,"Tech J",50.0,2015);
        tx2.getPages();
        tx2.getName();
        tx2.getPrice();
        tx2.getYear();
        tx2.printInfo();

        Magazines tx3 = new Magazines(400,"ELLE",30.0,2017);
        tx3.getPages();
        tx3.getName();
        tx3.getPrice();
        tx3.getYear();
        tx3.printInfo();

        Novels tx4 = new Novels(500,"Harry Potter",120.0,2009);


    }

}
