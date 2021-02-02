package chessboard;

public class RockDestination {

    public static void main(String[] args) {
        isDestinationMovePossible(8,8,8,4);
        isDestinationMovePossible(3,2,2,4);
    }

//    Check if a Rook can reach the given destination in a single move

    public static void isDestinationMovePossible(int current_row, int current_col,
                                             int destination_row, int destination_col){
        String isDetinationPossible;
        isDetinationPossible = (current_row == destination_row || current_col == destination_col)?"POSSIBLE":"NOT POSSIBLE";

        System.out.println(isDetinationPossible);
    }

}
