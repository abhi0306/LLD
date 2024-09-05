package TicTacToe;

public class Player {

	public String nameString;
	public PlayingPiece playingPiece;
	
	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public PlayingPiece getPlayingPiece() {
		return playingPiece;
	}

	public void setPlayingPiece(PlayingPiece playingPiece) {
		this.playingPiece = playingPiece;
	}

	public Player(String name, PlayingPiece playingPiece) {
		this.nameString=name;
		this.playingPiece=playingPiece;
		// TODO Auto-generated constructor stub
	}
	
	
}
