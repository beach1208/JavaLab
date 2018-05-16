package Lab3;

public class Knight extends ChessPiece{
    public static final  int KNIGHT_IMPORTANCE = 2;

    public Knight(){
        super(KNIGHT_IMPORTANCE);

    }

    /**
     *
     * @return overriding super class string
     */

    @Override
    public String toString() {
        return "Knight value " + getImportance();
    }

    @Override
    public void move() {
        System.out.println("like an L");
    }
}
