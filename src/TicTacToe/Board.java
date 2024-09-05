package TicTacToe;

import java.security.interfaces.DSAKeyPairGenerator;
import java.util.ArrayList;
import java.util.List;


public class Board {
	public int size;
	public PlayingPiece[][] board;
	
	public Board(int size) {
		this.size = size;
		board = new PlayingPiece[size][size];
		// TODO Auto-generated constructor stub
	}
	
	public boolean addPiece(int row,int column,PlayingPiece playingPiece) {
		if(row>=size || column>= size || row < 0 || column<0 )
			return false;
		if(board[row][column]!=null)
			return false;
		board[row][column]=playingPiece;
		return true;
	}
	
	public class Pair<K, V> {
	    private K key;
	    private V value;

	    public Pair(K key, V value) {
	        this.key = key;
	        this.value = value;
	    }

	    public K getKey() {
	        return key;
	    }

	    public V getValue() {
	        return value;
	    }
	}
	
	public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }
	

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                   System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }


}
