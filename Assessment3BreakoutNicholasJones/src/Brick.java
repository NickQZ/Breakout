import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	
	public Brick(int x, int y) {
		// Set x and y using the parameter the same as x and y on board
		this.x = x;
		this.y = y;
		
		// Set the width and height of the brick using Settings.BRICK_WIDTH/HEIGHT
		setWidth(Settings.BALL_WIDTH);
		setHeight(Settings.BRICK_HEIGHT);
	}

	public boolean isBroken() {
		return broken;	// Return the correct variable
	}
	public void setBroken(boolean broken) {
		// Set the broken variable using the parameter given
		this.broken = broken; // Assign value 
		
	}
	
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}
