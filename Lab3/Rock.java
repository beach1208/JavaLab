package Lab3;

public class Rock extends ChessPiece {
    public static final  int ROCK_IMPORTANCE = 5;

    public Rock (){
        super(ROCK_IMPORTANCE);

    }

    /**
     *
     * @return super class string
     */

    @Override
    public String toString() {
        return "Rock value " + getImportance();
    }

    @Override
    public void move() {
        System.out.println("horizontally or vertically");
    }
}
