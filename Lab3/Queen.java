package Lab3;

public class Queen extends ChessPiece {
    public static final  int QUEEN_IMPORTANCE = 9;
    public Queen (){
        super(QUEEN_IMPORTANCE);

    }

    /**
     *
     * @return super class string
     */
    @Override
    public String toString() {
        return "Queen value "+ getImportance();
    }

    @Override
    public void move() {
        System.out.println("like a bishop or a rook");
    }
}
