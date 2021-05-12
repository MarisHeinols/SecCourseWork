import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class LevelsMenu {
    static Container levelContainer;
    public static JFrame levelFrame;
    public static JLabel backButton = new JLabel();
    public static ArrayList<JLabel> levelLabels = new ArrayList<JLabel>();

    public LevelsMenu() {

        levelFrame = new JFrame("Levels");
        Methods.getFrame(levelFrame);
        levelContainer = levelFrame.getContentPane();
        levelContainer.setBackground(new Color(0, 0, 0));

        backButton = new JLabel();
        Methods.getBackButton(backButton, levelContainer);

        Methods.getLevelLabel(250, 50, "1");
        Methods.getLevelLabel(420, 50, "2");
        Methods.getLevelLabel(590, 50, "3");
        Methods.getLevelLabel(250, 300, "4");
        Methods.getLevelLabel(420, 300, "5");
        Methods.getLevelLabel(590, 300, "6");

    }

}
