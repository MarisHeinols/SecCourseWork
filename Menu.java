import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;

public class Menu {
    static Container menuContainer;
    public static JFrame menuFrame = new JFrame("Menu frame");
    public static ArrayList<JLabel> menuLabels = new ArrayList<JLabel>();
    public static ArrayList<JLabel> inGameLabels = new ArrayList<JLabel>();

    public static void menu(String[] args) {

        Methods.getFrame(menuFrame);
        menuContainer = menuFrame.getContentPane();
        menuContainer.setBackground(new Color(0, 0, 0));

        Methods.getSoundButton();
        Methods.getMenuButton(400, 400, 200, 50, 135, 28, 132, "Levels");
        Methods.getMenuButton(400, 470, 200, 50, 135, 28, 132, "Tasks");
        Methods.getMenuButton(400, 540, 200, 50, 135, 28, 132, "Exit");
        Methods.getMenuBanner();
        GameFunctions.playSound("backgroundTwo");
        new LevelsMenu();
        new Tasks();
        new MouseAction();

    }

}
