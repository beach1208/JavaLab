package Lab3;

/**
 * @author Nagisa Kojima
 */

public abstract class ChessPiece {
    protected int importance;

    public ChessPiece(int importance) {
        this.importance = importance;
    }


    public abstract void move();

    /**
     *
     * @return getting int importance
     */
    public int getImportance() {
        return importance;
    }

    /**
     *
     * @param importance setting int importance
     */
    public void setImportance(int importance) {
        this.importance = importance;
    }

    /**
     *
     * @param obj check if two objects are same
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return  (importance == ((ChessPiece)obj).importance);
    }

    /**
     *
     * @return  returning toString method
     */

    @Override
    public String toString() {
        return "Chesspiece value " + importance;
    }


}
