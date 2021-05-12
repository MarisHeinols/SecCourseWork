import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;

public class Methods {
    static Image icon = Toolkit.getDefaultToolkit().getImage("icons\\icon.png");

    public static void getMenuButton(int x, int y, int width, int height, int r, int g, int b, String text) {
        JLabel buttonLabel = new JLabel();
        buttonLabel.setText(text);
        buttonLabel.setForeground(new Color(255, 255, 255));
        buttonLabel.setFont(new Font("Ambit", Font.PLAIN, 30));
        constructJLabel(buttonLabel, x, y, width, height, "", r, g, b, Menu.menuLabels, Menu.menuContainer, true);
    }

    public static void getFrame(JFrame frameName) {
        frameName.setBounds(300, 10, 1000, 800);
        frameName.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameName.setLayout(null);
        frameName.setResizable(false);
        frameName.setIconImage(icon);
    }

    public static void getLevelLabel(int x, int y, String level) {
        JLabel levelLabel = new JLabel();
        constructJLabel(levelLabel, x, y, 150, 200, "LVL" + level, 255, 255, 255, LevelsMenu.levelLabels,
                LevelsMenu.levelContainer, true);
    }

    public static void getMenuBanner() {
        JLabel Banner = new JLabel();
        Menu.menuFrame.setVisible(true);
        constructJLabel(Banner, 150, 50, 700, 250, "banner", 255, 255, 255, GameProps.usless, Menu.menuContainer,
                false);

    }

    public static void getTaskLabel(int x, int y, String text) {
        JLabel taskLabel = new JLabel();
        JLabel taskInstrutction = new JLabel();
        taskInstrutction.setFont(new Font("Ambit", Font.BOLD, 18));
        taskInstrutction.setForeground(new Color(255, 0, 111));
        taskInstrutction.setText(text);
        constructJLabel(taskInstrutction, x, y, 300, 150, "", 255, 255, 255, GameProps.usless, Tasks.taskContainer,
                false);
        constructJLabel(taskLabel, x, y, 300, 150, "taskLabel", 33, 240, 255, Tasks.labels, Tasks.taskContainer, true);
    }

    public static void getBackButton(JLabel backButton, Container cont) {
        constructJLabel(backButton, 850, 700, 100, 50, "back", 252, 3, 82, GameProps.usless, cont, true);

    }

    public static void getSoundButton() {
        JLabel soundButton = new JLabel();
        constructJLabel(soundButton, 50, 700, 50, 50, "sound", 255, 255, 255, Menu.menuLabels, Menu.menuContainer,
                true);
    }

    public static void getToolLabel() {
        JLabel toolBack = new JLabel();

        getToolButtons(720, "menu");
        getToolButtons(790, "restart");
        getToolButtons(860, "next");

        constructJLabel(toolBack, 700, 0, 300, 70, "gameLabel", 119, 26, 112, Menu.inGameLabels, GameScreen.c, true);
    }

    public static void getToolButtons(int x, String name) {
        JLabel toolButton = new JLabel();
        constructJLabel(toolButton, x, 10, 50, 50, name, 255, 255, 255, Menu.inGameLabels, GameScreen.c, true);
    }

    public static void constructJLabel(JLabel label, int x, int y, int width, int height, String name, int r, int g,
            int b, ArrayList<JLabel> list, Container location, boolean opaque) {
        label.setIcon(new ImageIcon("icons\\" + name + ".png"));
        label.setBounds(x, y, width, height);
        label.setOpaque(opaque);
        label.setBackground(new Color(r, g, b));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        location.add(label);
        list.add(label);

    }

}
