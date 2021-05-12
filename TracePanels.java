import javax.swing.JLabel;

import java.awt.*;

public class TracePanels extends JLabel {

    private static final long serialVersionUID = 1L;
    int r;
    int g;
    int b;

    public TracePanels(int x, int y, int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;

        this.setBackground(new Color(r, g, b));
        this.setBounds(x, y, 50, 50);
        this.setOpaque(true);
        GameFunctions.tracePanels.add(this);
        GameScreen.c.add(this);
    }

    public static void trace() {
        checkTrace();
        if (GameFunctions.player.r == 33) {
            changeColor(150, 10, 0);
        } else if (GameFunctions.player.r == 255) {
            changeColor(0, 100, 80);

        } else if (GameFunctions.player.r == 105) {
            changeColor(30, 0, 60);
        }

        for (JLabel target : GameFunctions.walls) {
            for (TracePanels panel : GameFunctions.tracePanels) {
                if (panel.getBounds().intersects(target.getBounds())) {
                    panel.setVisible(false);
                }

            }

        }

    }

    public static void checkTrace() {
        for (TracePanels panel : GameFunctions.tracePanels) {
            for (TracePanels secPanel : GameFunctions.tracePanels) {
                if (panel.getBounds().intersects(secPanel.getBounds())
                        && GameFunctions.player.getBounds().intersects(panel.getBounds())) {
                    if (GameFunctions.player.r == 33) {
                        panel.setBackground(new Color(GameFunctions.player.r + 150, GameFunctions.player.g + 10,
                                GameFunctions.player.b));
                    } else if (GameFunctions.player.r == 255) {
                        panel.setBackground(new Color(GameFunctions.player.r, GameFunctions.player.g + 100,
                                GameFunctions.player.b + 80));
                    } else if (GameFunctions.player.r == 105) {
                        panel.setBackground(new Color(GameFunctions.player.r + 30, GameFunctions.player.g,
                                GameFunctions.player.b + 60));
                    }
                }
            }

        }
    }

    public static void changeColor(int rChange, int gChange, int bChange) {
        TracePanels collorPanel = new TracePanels(GameFunctions.player.getX(), GameFunctions.player.getY(),
                GameFunctions.player.r + rChange, GameFunctions.player.g + gChange, GameFunctions.player.b + bChange);
        collorPanel.r = GameFunctions.player.r;
        collorPanel.g = GameFunctions.player.g;
        collorPanel.b = GameFunctions.player.b;
    }

}
