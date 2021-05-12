import javax.swing.*;
import java.awt.*;

public class Player extends JLabel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String name;
    String collor;
    int r;
    int g;
    int b;
    boolean hit;

    public Player(String name, int x, int y, int r, int g, int b) {
        this.name = name;
        this.r = r;
        this.g = g;
        this.b = b;

        this.setBackground(new Color(r, g, b));
        this.setBounds(x, y, 50, 50);
        this.setOpaque(true);
        this.setIcon(new ImageIcon("icons\\player.png"));

    }

    public static void bounce() {
        for (JLabel target : GameFunctions.walls) {
            if (target.getBounds().intersects(GameFunctions.player.getBounds()) && GameFunctions.padBounce == false) {
                if (GameFunctions.dirX > 0) {
                    GameFunctions.newX = (target.getX() - 55);
                    GameFunctions.dirX = 0;
                } else if (GameFunctions.dirX < 0) {
                    GameFunctions.newX = (target.getX() + 20);
                    GameFunctions.dirX = 0;
                } else if (GameFunctions.dirY > 0) {
                    GameFunctions.newY = (target.getY() - 55);
                    GameFunctions.dirY = 0;
                } else if (GameFunctions.dirY < 0) {
                    GameFunctions.newY = (target.getY() + 20);
                    GameFunctions.dirY = 0;
                }
                GameFunctions.moving = false;
                GameFunctions.keyLimit = false;
                GameFunctions.playSound("bounce");
            }
        }

    }

    public static void movement() {
        GameFunctions.newX = GameFunctions.player.getX() + (2 * GameFunctions.dirX);
        GameFunctions.newY = GameFunctions.player.getY() + (2 * GameFunctions.dirY);
    }

}
