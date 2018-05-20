package Day6Exercise;

public class ReadingMaterials_Super {
    protected int pages;
    protected String name;
    protected double price;
    protected int year;

    public ReadingMaterials_Super(int pages,String name, double price, int year) {
        this.pages = pages;
        this.name = name;
        this.price = price;
        this.year = year;
    }


    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
//        System.out.println(pages);
        return pages;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void printInfo(){
        System.out.println("This book name is + " +   name + " "+   pages   + " pages " +  ","  + " Price is $ " +  price + " published " +  year );
    }

}



//    Design and implement a set of classes that define
//        various types of reading material: books, novels, magazines, technical journals, textbooks, and so on.
//        Include data values that describe various attributes(states) of the material,
//        such as the number of pages and the names of the primary characters.
//        Include methods that are named appropriately for each class and
//        that print an appropriate message. Create a driver class to instantiate and exercise several of the classes.

//Reading materials の何ページ目にどのセクションがあって、そのセクションの価格、年数などをだす