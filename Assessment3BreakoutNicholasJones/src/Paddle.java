import java.awt.Graphics;

public class Paddle extends Sprite {

    private int xVelocity;

    public Paddle() {
        // Set width to Settings.PADDLE_WIDTH
        setWidth(Settings.PADDLE_WIDTH);

        // Set height to Settings.PADDLE_HEIGHT
        setHeight(Settings.PADDLE_HEIGHT);

        // Call resetPosition
        resetPosition();
    }

    public void resetPosition() {
        // Set initial position x and y (use INITIAL_PADDLE_X/Y)
        x = Settings.INITIAL_PADDLE_X;
        y = Settings.INITIAL_PADDLE_Y;
    }

    public void update() {
        x += xVelocity;

        // Ensure paddle stays within the left boundary
        if (x <= 0) {
            x = 0;
        }

        // Ensure paddle stays within the right boundary
        if (x + Settings.PADDLE_WIDTH >= Settings.WINDOW_WIDTH) {
            x = Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH;
        }
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
    }

    public void setXVelocity(int vel) {
        // Set x velocity
        xVelocity = vel;
    }
}
