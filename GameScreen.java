import javax.swing.*;
import java.awt.*;

public class GameScreen {
    static Container c;
    public static JFrame gameFrame;

    public GameScreen() {
        gameFrame = new JFrame("GameFrame");
        Methods.getFrame(gameFrame);
        c = gameFrame.getContentPane();
        gameFrame.setVisible(true);
        new GameFunctions();

    }
}
