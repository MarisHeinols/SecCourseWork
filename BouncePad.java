import javax.swing.JLabel;

import javax.swing.*;

import java.awt.*;

public class BouncePad extends JLabel {

    private static final long serialVersionUID = 1L;
    String dir;

    public BouncePad(int x, int y, String dir) {
        this.dir = dir;
        this.setBounds(x, y, 50, 50);
        this.setVisible(true);
        this.setOpaque(true);
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        this.setIcon(new ImageIcon("icons\\" + dir + ".png"));
        GameScreen.c.add(this);
        GameFunctions.bouncePads.add(this);
    }

    public static void checkBouncePad() {
        GameFunctions.padBounce = false;
        for (BouncePad pad : GameFunctions.bouncePads) {
            if (pad.getBounds().intersects(GameFunctions.player.getBounds())) {
                GameFunctions.padBounce = true;
                GameFunctions.playSound("padBounce");
                if (pad.dir.equals("topLeft")) {
                    if (GameFunctions.dirY < 0) {
                        GameFunctions.newY = pad.getY() + 5;
                        changeDir("Y", -20);
                    } else if (GameFunctions.dirX > 0) {
                        GameFunctions.newX = pad.getX() - 5;
                        changeDir("X", 20);
                    }
                } else if (pad.dir.equals("topRight")) {
                    if (GameFunctions.dirY < 0) {
                        GameFunctions.newY = pad.getY() + 5;
                        changeDir("Y", 20);
                    } else if (GameFunctions.dirX < 0) {
                        GameFunctions.newX = pad.getX() + 5;
                        changeDir("X", 20);
                    }
                } else if (pad.dir.equals("bottomLeft")) {
                    if (GameFunctions.dirY > 0) {
                        GameFunctions.newY = pad.getY() - 5;
                        changeDir("Y", -20);
                    } else if (GameFunctions.dirX > 0) {
                        GameFunctions.newX = pad.getX() - 5;
                        changeDir("X", -20);
                    }
                } else if (pad.dir.equals("bottomRight")) {
                    if (GameFunctions.dirY > 0) {
                        GameFunctions.newY = pad.getY() - 5;
                        changeDir("Y", 20);
                    } else if (GameFunctions.dirX < 0) {
                        GameFunctions.newX = pad.getX() + 5;
                        changeDir("X", -20);
                    }
                }

            }
        }
    }
    public static void changeDir(String axis, int dirChange){
        if(axis == "Y"){
            GameFunctions.dirY = 0;
            GameFunctions.dirX = dirChange;
        }
        if(axis == "X"){
            GameFunctions.dirX = 0;
            GameFunctions.dirY = dirChange;
        }
    }

}
