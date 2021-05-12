import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Tasks {
    static Container taskContainer;
    public static JFrame tasksFrame;
    public static JLabel backButton = new JLabel();
    public static ArrayList<JLabel> labels = new ArrayList<JLabel>();

    public Tasks() {
        tasksFrame = new JFrame("Tasks");
        Methods.getFrame(tasksFrame);
        taskContainer = tasksFrame.getContentPane();
        taskContainer.setBackground(new Color(0, 0, 0));

        backButton = new JLabel();
        Methods.getBackButton(backButton, taskContainer);

        Methods.getTaskLabel(100, 100, "Finish level (1.LVL)");
        Methods.getTaskLabel(500, 100, "Get the gem (2.LVL)");
        Methods.getTaskLabel(100, 300, "No killing (3.LVL)");
        Methods.getTaskLabel(500, 300, "Hit the spikes (4.LVL)");
        Methods.getTaskLabel(100, 500, "Terminator (5.LVL)");
        Methods.getTaskLabel(500, 500, "End game (6.LVL)");

    }

    public static void checkTasks() {
        if (GameFunctions.activeLevel == 1 && GameFunctions.isWon == true) {
            labels.get(0).setBackground(new Color(255, 242, 0));
        } else if (GameFunctions.activeLevel == 2 && GameFunctions.coins.get(0).isVisible() == false) {
            labels.get(1).setBackground(new Color(255, 242, 0));
        } else if (GameFunctions.activeLevel == 3 && GameFunctions.isWon == true
                && GameFunctions.entities.get(0).hit == false) {
            labels.get(2).setBackground(new Color(255, 242, 0));
        } else if (GameFunctions.activeLevel == 4 && GameFunctions.isWon == false && GameFunctions.spikeHit == true) {
            labels.get(3).setBackground(new Color(255, 242, 0));
        } else if (GameFunctions.activeLevel == 5 && GameFunctions.isWon == true
                && GameFunctions.entities.get(0).hit == true && GameFunctions.entities.get(1).hit == true) {
            labels.get(4).setBackground(new Color(255, 242, 0));
        } else if (GameFunctions.activeLevel == 6 && GameFunctions.isWon == true) {
            labels.get(5).setBackground(new Color(255, 242, 0));
        }
        tasksFrame.revalidate();
        tasksFrame.repaint();
    }
}
