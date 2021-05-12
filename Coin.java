import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Coin extends JLabel {

    private static final long serialVersionUID = 1L;
    int R;
    int G;
    int B;
    boolean collected = false;

    public Coin(int x, int y, int r, int g, int b) {
        this.R = r;
        this.G = g;
        this.B = b;
        this.setBackground(new Color(r, g, b));
        this.setBounds(x, y, 20, 20);
        this.setOpaque(true);
        this.setIcon(new ImageIcon("icons\\coin.png"));
        GameFunctions.coins.add(this);
        GameScreen.c.add(this);
    }

    public static void checkCoins(ArrayList<Coin> source) {
        for (Coin coin : source) {
            if (coin.collected == false) {
                if (coin.getBounds().intersects(GameFunctions.player.getBounds())) {
                    GameFunctions.player.r = coin.R;
                    GameFunctions.player.g = coin.G;
                    GameFunctions.player.b = coin.B;
                    GameFunctions.player.setBackground(
                            new Color(GameFunctions.player.r, GameFunctions.player.g, GameFunctions.player.b));
                    GameFunctions.playSound("coin");
                    coin.setVisible(false);
                    coin.collected = true;
                }
            }
        }
    }
}
