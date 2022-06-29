
public class Ship {
	private String id;
	private int x;
	private int y;
	private int size;
	private boolean isActive;
	
	//for internal reference , range
	private int topLeftCornerX;
	private int topLeftCornerY;
	private int bottomRightCornerX;
	private int bottomRightCornerY;
	
	public Ship(String id, int x, int y, int size) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.size = size;
		this.isActive = true;
		
		this.topLeftCornerX = size/2 - x;
		this.topLeftCornerY = size/2 - y;

		this.bottomRightCornerX = size/2 + x;
		this.bottomRightCornerY = size/2 + y;
	}

	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	

	public int getTopLeftCornerX() {
		return topLeftCornerX;
	}


	public void setTopLeftCornerX(int topLeftCornerX) {
		this.topLeftCornerX = topLeftCornerX;
	}


	public int getTopLeftCornerY() {
		return topLeftCornerY;
	}


	public void setTopLeftCornerY(int topLeftCornerY) {
		this.topLeftCornerY = topLeftCornerY;
	}


	public int getBottomRightCornerX() {
		return bottomRightCornerX;
	}


	public void setBottomRightCornerX(int bottomRightCornerX) {
		this.bottomRightCornerX = bottomRightCornerX;
	}


	public int getBottomRightCornerY() {
		return bottomRightCornerY;
	}


	public void setBottomRightCornerY(int bottomRightCornerY) {
		this.bottomRightCornerY = bottomRightCornerY;
	}


	public boolean isOverlapping(Ship shipRequestingToAdd) {
		
		
		
		return false;
	}
	
	
}
