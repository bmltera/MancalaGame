/**
 * MancalaTester tests the mancala game.
 * 
 * @author Matrix
 *
 */
public class MancalaTester {

	/**
	 * Creates a MancalaModel and MancalaMenu
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		MancalaModel model = new MancalaModel();
		MenuFrame menuFrame = new MenuFrame(model);
	}
}
