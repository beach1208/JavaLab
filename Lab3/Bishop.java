package Lab3;


public class Bishop extends ChessPiece{
    public static final  int BISHOP_IMPORTANCE = 3;
        public Bishop(){
            super(BISHOP_IMPORTANCE);

        }

    /**
     *
     * @return overriding string of superclass
     */
    @Override
        public String toString() {
            return "Bishop value " + getImportance();
        }

        @Override
        public void move() {
            System.out.println("diagonally");
        }
}

