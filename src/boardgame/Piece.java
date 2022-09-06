package boardgame;

public class Piece {

    protected Position position;   //so classes do msm package ou subclasses
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

}
