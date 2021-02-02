package chessboard;

public class KnightsAttakingPawns {

    public static void main(String[] args) {

        int[][] knights = { { 0, 4 }, { 4, 5 }, { 1, 4 }, { 3, 1 } };

        int[] pawn = new int[]{2, 3};

        // Stores total count of knights
        int M = knights.length;

        System.out.println(cntKnightsAttackPawn(
                knights, pawn, M));
    }

//    Count Knights that can attack a given pawn in an N * N board

    static int cntKnightsAttackPawn(int knights[][],
                                    int pawn[], int M)
    {
        int knightsCounter = 0;
        int[][] knightsCopy = knights;
        int[] pawnCopy = pawn;

        for(int index = 0; index < M; index++){

            int row = knightsCopy[index][0] - pawnCopy[0];
            int column = knightsCopy[index][1] - pawnCopy[1];

            if ((Math.abs(row) == 1 && Math.abs(column) == 2)
                || (Math.abs(row) == 2) && Math.abs(column) == 1){

                knightsCounter ++;
            }

        }

        return knightsCounter;
    }


}
