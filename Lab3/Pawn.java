package Lab3;

public class Pawn extends ChessPiece{
    public static final  int PAWN_IMPORTANCE = 1;

    private boolean hasBeenPromoted;
    ChessPiece newPiece;
    private int counter = 0;




    public Pawn(ChessPiece newPiece){
        super(PAWN_IMPORTANCE);
        this.hasBeenPromoted = false;
        this.newPiece = newPiece;
    }

    /**
     *
     * @param newPiece impletementing promote method if Pawn subclass moves 8 times
     */
    public void promote(ChessPiece newPiece){
        if(newPiece.importance != 1000 && newPiece.importance != 1 ){
            this.setImportance(newPiece.getImportance());
            hasBeenPromoted = true;
        }


    }

    /**
     *
     * @return superclass string
     */

    @Override
    public String toString() {
        return "Pawn value " + getImportance();
    }

    @Override
    public void move() {
        System.out.println("forward 1");
        counter++;
        if(counter == 8){
            promote(newPiece);
        }

    }
}
