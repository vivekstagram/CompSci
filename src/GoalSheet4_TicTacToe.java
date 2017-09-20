//Vivek Patel
//Play tic-tac-toe using 2 dimensional arrays
//Goal Sheet 4 - Tic-Tac-Toe

import java.util.*;

public class GoalSheet4_TicTacToe {

	private static char[][] grid = new char[3][3];

	private static int player;

	private static Scanner input = new Scanner(System.in);

	private static List<int[]> moveMemory = new ArrayList<int[]>();

	public static void main(String[] args) {

		while (true) {

			setUp();

			for (player = 1; player <= 2; player++) {

				// Place a marker!
				placeMarker(player, grid);

				printBoard(grid);

				// print the current board
				if (isWin())
					break;
				if (gridIsFull()) {
					player = 0;
					break;
				}

				if (player == 2) {
					player = 0;
				}
			}

			// congratulate YouWin
			YouWin(player);

			// restart or exit?
			if (!askToRestart()) {
				System.out.println("thanks for playing!");
				break;
			}

		}

		input.close();
	}

	private static void setUp() {
		resetGrid();
		resetMoveMemory();
		instruction();
	}

	private static void instruction() {

		System.out.println("Welcome to a 2-player tic tac toe game.");
		System.out.println("How to play: In turn, each player will type in 2 numbers ");
		System.out.println("(row and column) where the O or the X will be placed.");
		System.out.println("Player 1 will be an O and Player 2 will an X");
		System.out.println("Example: When player 1 typed in \"2 2\", an O will be placed in row 2 and column 2");
		System.out.println("Note: type \"grid\" to show the current grid");
		System.out.println("");
		printBoard(grid);
	}

	// Populate an empty game board
	private static void resetGrid() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = '-';
			}
		}
	}

	private static void resetMoveMemory() {
		moveMemory.clear();
	}

	// Ask for the location of a players move, and put it there
	private static void placeMarker(int player, char[][] grid) {
		char marker = ' ';

		if (player == 1) {
			marker = 'O';
		} else if (player == 2) {
			marker = 'X';
		}

		int[] move = getPlayerMove(player);

		int row = move[0];
		int column = move[1];

		grid[row][column] = marker;

		updateMoveMemory(row, column);
	}

	// return an array of an size 2 {row, column}
	private static int[] getPlayerMove(int player) {

		int[] move = new int[2];

		while (true) {
			System.out.println("");
			System.out.println("Player " + player + " turn. Select your move:");
			String moveString = input.nextLine();

			if (moveString.equals("grid")) {
				printBoard(grid);
			} else if (isValidInput(moveString)) {
				move = interpretMove(moveString);

				if (!isSpotTaken(move)) {
					break;
				}

			} else {
				System.out.println("invalid move");
			}
		}
		return move;
	}

	private static void updateMoveMemory(int row, int column) {
		int[] myArray = new int[2];
		myArray[0] = row;
		myArray[1] = column;
		moveMemory.add(myArray);
	}

	private static boolean isValidInput(String input) {
		// I love this thing
		StringTokenizer st = new StringTokenizer(input);

		for (int i = 0; i < 2; i++) {
			try {
				int myNumber = Integer.parseInt(st.nextToken());

				if (!(myNumber >= 1 && myNumber <= 3)) {
					return false;
				}
			} catch (NumberFormatException er) {
				return false;
			}
		}

		// We are not playing N-Dimensional tic tac toe here lol
		if (st.hasMoreTokens()) {
			return false;
		}

		return true;
	}

	private static boolean isSpotTaken(int[] move) {
		for (int i = 0; i < moveMemory.size(); i++) {
			if (moveMemory.get(i)[0] == move[0] && moveMemory.get(i)[1] == move[1]) {
				System.out.println("That spot is.... TAKEN ALREADY CHOOSE A DIFFERENT ONE");
				return true;
			}
		}

		return false;
	}

	private static int[] interpretMove(String str) {
		int[] move = new int[2];

		// Fancy way of splitting up a string
		StringTokenizer st = new StringTokenizer(str);

		// Capture the dimensions properly
		for (int i = 0; i < 2; i++) {
			move[i] = Integer.parseInt(st.nextToken());
			move[i]--;
		}

		return move;
	}

	private static void printBoard(char[][] grid) {

		for (int i = 0; i < 3; i++) {

			System.out.println("");

			for (int j = 0; j < 3; j++) {
				System.out.print(grid[i][j] + " ");
			}
		}

		System.out.println("");

	}

	private static boolean isWin() {
		if (checkRow())
			return true;

		if (checkColumn())
			return true;

		if (checkDiagonal())
			return true;

		return false;

	}

	private static boolean checkRow() {
		for (int i = 0; i < 3; i++) {
			if (grid[i][0] == grid[i][1] && grid[i][0] == grid[i][2]) {
				if (grid[i][0] != '-')
					return true; // because char '-' is empty
			}
		}

		return false;
	}

	private static boolean checkColumn() {
		for (int i = 0; i < 3; i++) {
			if (grid[0][i] == grid[1][i] && grid[0][i] == grid[2][i]) {
				if (grid[0][i] != '-')
					return true;
			}
		}

		return false;
	}

	private static boolean checkDiagonal() {

		if ((grid[1][1] == grid[0][0] && grid[1][1] == grid[2][2])
				|| (grid[1][1] == grid[0][2] && grid[1][1] == grid[2][0])) {
			if (grid[1][1] != '-')
				return true;
		}

		return false;
	}

	private static boolean gridIsFull() {
		if (moveMemory.size() == Math.pow(3, 2)) {
			return true;
		}

		return false;
	}

	private static boolean askToRestart() {
		while (true) {
			System.out.println("Type (restart) to play again or type (exit) to quit: ");

			String str = input.nextLine();

			if (str.toLowerCase().equals("restart")) {
				return true;
			} else if (str.toLowerCase().equals("exit")) {
				return false;
			} else {
				System.out.println("Invalid Command");
			}
		}
	}

	private static void YouWin(int player) {
		if (player != 0) {
			System.out.println("PLAYER " + player + " WINS!!!!");
		} else {
			System.out.println("THE MATCH HAS COME TO A DRAW");
		}
	}
}