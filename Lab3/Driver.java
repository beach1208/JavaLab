package Lab3;

public class Driver {
    public static void main(String[] args) {

        ChessPiece kn = new Knight();
        ChessPiece bis = new Bishop();
        ChessPiece rok = new Rock();
        ChessPiece qu = new Queen();
        ChessPiece kin = new King();
        ChessPiece paw = new Pawn(bis);
        ChessPiece paw2 = new Pawn(rok);

        ChessPiece paw3 = new Pawn(qu);

        paw.move();
        paw.move();
        paw.move();
        paw.move();
        paw.move();
        paw.move();
        paw.move();
        paw.move();



        kn.move();
        bis.move();
        rok.move();
        qu.move();
        kin.move();




        System.out.println(paw.equals(paw2));
    }
}
