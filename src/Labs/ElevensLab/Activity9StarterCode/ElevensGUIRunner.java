 package Labs.ElevensLab.Activity9StarterCode;


 import Labs.ElevensLab.Activity8StarterCode.Board;
 import Labs.ElevensLab.Activity8StarterCode.ElevensBoard;

 import java.util.List;

/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class ElevensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 *
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ElevensBoard();
			CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
