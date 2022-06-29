import java.util.ArrayList;
import java.util.Iterator;

public class Player {

	private ArrayList<Ship> ships = new ArrayList<Ship>();
	
	private int myTopLeftCornerX;
	private int myTopLeftCornerY;
	private int myBottomRightCornerX;
	private int myBottomRightCornerY;
	
	private int theirTopLeftCornerX;
	private int theirTopLeftCornerY;
	private int theirBottomRightCornerX;
	private int theirBottomRightCornerY; 

	public ArrayList<Ship> getShips() {
		return ships;
	}

	public void setShips(ArrayList<Ship> ships) {
		this.ships = ships;
	}

	public int getMyTopLeftCornerX() {
		return myTopLeftCornerX;
	}

	public void setMyTopLeftCornerX(int myTopLeftCornerX) {
		this.myTopLeftCornerX = myTopLeftCornerX;
	}

	public int getMyTopLeftCornerY() {
		return myTopLeftCornerY;
	}

	public void setMyTopLeftCornerY(int myTopLeftCornerY) {
		this.myTopLeftCornerY = myTopLeftCornerY;
	}

	public int getMyBottomRightCornerX() {
		return myBottomRightCornerX;
	}

	public void setMyBottomRightCornerX(int myBottomRightCornerX) {
		this.myBottomRightCornerX = myBottomRightCornerX;
	}

	public int getMyBottomRightCornerY() {
		return myBottomRightCornerY;
	}

	public void setMyBottomRightCornerY(int myBottomRightCornerY) {
		this.myBottomRightCornerY = myBottomRightCornerY;
	}

	public int getTheirTopLeftCornerX() {
		return theirTopLeftCornerX;
	}

	public void setTheirTopLeftCornerX(int theirTopLeftCornerX) {
		this.theirTopLeftCornerX = theirTopLeftCornerX;
	}

	public int getTheirTopLeftCornerY() {
		return theirTopLeftCornerY;
	}

	public void setTheirTopLeftCornerY(int theirTopLeftCornerY) {
		this.theirTopLeftCornerY = theirTopLeftCornerY;
	}

	public int getTheirBottomRightCornerX() {
		return theirBottomRightCornerX;
	}

	public void setTheirBottomRightCornerX(int theirBottomRightCornerX) {
		this.theirBottomRightCornerX = theirBottomRightCornerX;
	}

	public int getTheirBottomRightCornerY() {
		return theirBottomRightCornerY;
	}

	public void setTheirBottomRightCornerY(int theirBottomRightCornerY) {
		this.theirBottomRightCornerY = theirBottomRightCornerY;
	}

	public boolean addShip(Ship shipToAdd) {
		//check if my area
		for (Iterator iterator = ships.iterator(); iterator.hasNext();) {
			Ship ship = (Ship) iterator.next();
			if(shipToAdd.isOverlapping(ship)) {
				return false;
			}
		};
		ships.add(shipToAdd);
		return true;
	}
	
	public int totalActiveShips() {
	
		int count = 0;
		
		for (Iterator iterator = ships.iterator(); iterator.hasNext();) {
			Ship ship = (Ship) iterator.next();
			if(ship.isActive()) {
				count++;
			}
		};
		
		return count;
	}
	
	
	public int fire() {
		//generate random x,y within the range of player b. 
		//request board if this was fired before. and retry till we get valid value
		return 0;
		
	}
	
	
	
	
}
