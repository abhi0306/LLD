package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import TicTacToe.Board.Pair;

public class Game {
	Deque<Player> players;
	Board board;
	public void setGame() {
		players= new LinkedList<>();
		
		PieceX pieceX = new PieceX();
		Player p1 = new Player("p1", pieceX);
		
		PieceO pieceO = new PieceO();
		Player p2 = new Player("p2", pieceO);
		
		players.add(p1);
		players.add(p2);
		board = new Board(3);
	}
	public boolean isThereWinner(int row, int column, PieceType pieceType) {
		if(row>=board.size || column>= board.size || row < 0 || column<0 )
			return false;
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<board.size;i++) {

            if(board.board[row][i] == null || board.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<board.size;i++) {

            if(board.board[i][column] == null || board.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<board.size;i++,j++) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=board.size-1; i<board.size;i++,j--) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

	public String startGame() {
		boolean nowinner = true;
		while(nowinner) {
			Player playerTurn = players.removeFirst();
			board.printBoard();
			List<Pair<Integer, Integer>> freeSpaceList = board.getFreeCells();
			if(freeSpaceList.isEmpty())
			{
				nowinner=false;
				continue;
			}
			System.out.println("Player "+playerTurn.getNameString()+" Enter row column");
			int row,column;
			Scanner scanner = new Scanner(System.in);
			row = scanner.nextInt();
			column = scanner.nextInt();
			
			boolean checkPiece = board.addPiece(row, column, playerTurn.playingPiece);
			if(!checkPiece) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(row, column, playerTurn.playingPiece.pieceType);
            if(winner) {
            	System.out.println("winner "+playerTurn.nameString);
                return playerTurn.nameString;
            }

		}
		return "tie";
	}
	
}
