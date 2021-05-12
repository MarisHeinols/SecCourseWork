import javax.swing.*;
import java.util.ArrayList;

public class GameProps {
    public static int FinR;
    public static boolean coinColected = false;
    public static ArrayList<JLabel> usless = new ArrayList<JLabel>();

    public static void getWall(int x, int y, int height, int width) {
        JLabel wall = new JLabel();
        Methods.constructJLabel(wall, x, y, width, height, "", 88, 31, 112, GameFunctions.walls, GameScreen.c, true);

    }

    public static void getFinish(int x, int y, int r, int g, int b) {
        FinR = r;
        JLabel fin = new JLabel();
        Methods.constructJLabel(fin, x, y, 30, 60, "finish", r, g, b, GameFunctions.goals, GameScreen.c, true);
    }

    public static void getFinsihLabel() {
        JLabel finishLabel = new JLabel();
        if (GameFunctions.isWon == true) {
            Methods.constructJLabel(finishLabel, 125, 250, 700, 250, "done", 200, 255, 0, usless, GameScreen.c, true);
        } else {
            Methods.constructJLabel(finishLabel, 125, 250, 700, 250, "rip", 212, 21, 21, usless, GameScreen.c, true);
        }
        GameScreen.c.setComponentZOrder(finishLabel, 0);
        GameScreen.c.repaint();
        GameScreen.c.revalidate();

    }

    public static void getSpikes(int x, int y, String dir) {
        JLabel spike = new JLabel();
        if (dir.equals("Ver")) {
            Methods.constructJLabel(spike, x, y, 20, 50, "spikeVer", 255, 0, 212, GameFunctions.spikes, GameScreen.c,
                    true);
        } else {
            Methods.constructJLabel(spike, x, y, 50, 20, "spikeHor", 255, 0, 212, GameFunctions.spikes, GameScreen.c,
                    true);
        }
    }

}
