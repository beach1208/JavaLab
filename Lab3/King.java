package Lab3;

public class King extends ChessPiece {
    public static final  int KING_IMPORTANCE = 1000;

    public King(){
        super(KING_IMPORTANCE);

    }

    /**
     *
     * @return super class String
     */

    @Override
    public String toString() {
        return "King value " + getImportance();
    }

    @Override
    public void move() {
        System.out.println("one square");
    }
}
