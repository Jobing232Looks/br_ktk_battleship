
public class DestroyedAreas {
	
	private int topLeftCornerX;
	private int topLeftCornerY;
	private int bottomRightCornerX;
	private int bottomRightCornerY;

	//will be null if no ship was destroyed in attack
	private Player shipBelongsToPlayer = null;
	
	//will be null if no ship was destroyed in attack
	private Ship anyShipDestroyed = null;
	
	public boolean firingRequestInvalid(int x, int y) {
		boolean withinAreaX = x>=topLeftCornerX && x<=bottomRightCornerX;
		boolean withinAreaY = y>=topLeftCornerY && y<=bottomRightCornerY;

		return withinAreaX && withinAreaY;
	}
}
