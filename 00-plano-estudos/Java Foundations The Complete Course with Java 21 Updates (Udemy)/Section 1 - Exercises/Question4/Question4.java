public class Question4 {
    public static void main(String[] args) {
        String[][] ticTacToe = new String[3][3];
        ticTacToe[0][0] = "O";
        ticTacToe[0][1] = "X";
        ticTacToe[0][2] = "X";
        ticTacToe[1][0] = "X";
        ticTacToe[1][1] = "O";
        ticTacToe[1][2] = "O";
        ticTacToe[2][0] = "X";
        ticTacToe[2][1] = "O";
        ticTacToe[2][2] = "O";

        System.out.println(ticTacToe[2][2]);
    }
}
