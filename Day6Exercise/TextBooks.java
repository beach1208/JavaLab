package Day6Exercise;

public class TextBooks extends ReadingMaterials_Super {

    public TextBooks(int pages,String name, double price, int year) {
        super(pages,name,price,year);

    }
//    //overrode
//    public TextBooks(int pages, String name){
//        super(pages,name,0,0);
//
//    }
//
//    @Override
//    public int getPages() {
//        System.out.println(super.getPages()+20);
//        return (super.getPages()+20);
//    }
}
