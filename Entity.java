import javax.swing.*;
import java.awt.*;

public class Entity extends JLabel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    int r;
    int g;
    int b;
    int dirX;
    int dirY;
    int newX;
    int newY;
    boolean hit = false;

    public Entity(int x, int y, int r, int g, int b, int dirX, int dirY) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.dirX = dirX;
        this.dirY = dirY;
        this.newX = x;
        this.newY = y;
        this.setBackground(new Color(r, g, b));
        this.setBounds(x, y, 50, 50);
        this.setOpaque(true);
        this.setIcon(new ImageIcon("icons\\enm.png"));
        GameFunctions.entities.add(this);
        GameScreen.c.add(this);
    }

    public static void movement() {
        for (Entity ent : GameFunctions.entities) {
            ent.newX = ent.getX() + (2 * ent.dirX);
            ent.newY = ent.getY() + (2 * ent.dirY);
            ent.setLocation(ent.newX, ent.newY);

            getHit();
        }

    }

    public static void bounce() {
        for (JLabel target : GameFunctions.walls) {
            for (Entity ent : GameFunctions.entities)
                if (target.getBounds().intersects(ent.getBounds())) {
                    if (ent.dirX > 0) {
                        ent.dirX = (-2);
                    } else if (ent.dirX < 0) {
                        ent.dirX = (+2);
                    } else if (ent.dirY > 0) {
                        ent.dirY = (-2);
                    } else if (ent.dirY < 0) {
                        ent.dirY = (+2);
                    }

                }

        }
    }

    public static void getHit() {
        for (Entity ent : GameFunctions.entities) {
            if (ent.getBounds().intersects(GameFunctions.player.getBounds())) {
                if (ent.hit == false) {
                    if (ent.r != GameFunctions.player.r) {
                        GameFunctions.endGame();
                    } else {
                        GameScreen.gameFrame.remove(ent);
                        GameScreen.gameFrame.revalidate();
                        GameScreen.gameFrame.repaint();
                        ent.hit = true;
                    }
                }

            }
        }
    }

    public static void getReset() {
        for (Entity ent : GameFunctions.entities) {
            GameScreen.c.remove(ent);
        }
    }
}
