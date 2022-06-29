import java.util.ArrayList;

public class Board implements RequestsToBoard{

	/*
	 * Ship(Position, Size) ->
	 *  - active or not
	 * 
	 *   -for a given size and co-ordinate, is it being overlapped?
	 * might need helper method for checking given position and size
	 *   - range of its own area
	 * 
	 * Player, (Ships it has , range of co-ordinate of own. range of co-ordinates where it can fire) 
	 * Player will fire on a location on board, 
	 * 
	 * board will come back and tell if success or not or invalid
	 * and board will hold result of the firing,
	 * 
	 * Board(Size) -> 
	 *  init the game
	 *  	-> initialise size of the board, 
	 *  	-> initialise the size of each player's area
	 *  	
	 *  addShip()
	 *       -> pass this request to the player, 
	 *           -> Player will check against existing ships if it can be added in a valid way
	 *           -> Adds it to his list of ships if it can be added without issue
	 *  start game   
	 *       -> Random coordinate fire
	 *             -> Board checks if this fire is valid, Attack-Record(contains coordinates of hits and misses) checks its own records for player b losses
	 *             -> if valid , records the loss of that particualr ship 
	 *                 -> mark ship is active false
	 *                 -> player updates it record of active ships
	 *                 -> If any player reaches 0 first. Game ends and notifies board. 
	 *             
	 * 
	 * total board size is NxN
	 *  
	 * 2 players, each is NxN/2
	 * Player has Ships, 
	 * each ship is 
	 * it has a position, size, 
	 * 
	 * ships can touch each other but not overlap
	 * 
	 * Firing is random on other players board side NxNx2
	 * 
	 * position is written in x,y
	 * 
	 * we should have a list of where all it has been fired 
	 * (in our eg. SH1, though at 2,2 , it covers area 0,0 -> 0,4 -> 4,0 -> 4,4),
	 * whole ara goes 
	 * 
	 * 
	 * Suppose if ship is larger than its designated board area
	 * - should not allow to add
	 * 
	 * user promp required for 
	 * 
	 * 
	 * 
	 */
	
	private ArrayList<DestroyedAreas> destroyedAreas = new ArrayList<DestroyedAreas>();
	
	public static void main(String[] args) {
		
	}
	
	@Override
	public boolean isFireRequestValid(Player requestingPlayer, int x, int y) {
		boolean isXinRightFiringArea = 
				x >= requestingPlayer.getTheirTopLeftCornerX()
				&& x <= requestingPlayer.getTheirBottomRightCornerX();
		boolean isYinRightFiringArea = y >= requestingPlayer.getTheirTopLeftCornerY()
				&& y <= requestingPlayer.getTheirBottomRightCornerY();
		

		
		
		
		return false;
	}
	
}
