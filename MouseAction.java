import java.awt.event.*;
import java.awt.*;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.util.ArrayList;

public class MouseAction implements MouseListener {
    public static boolean isGameScreenMade = false;

    public MouseAction() {
        getActionListeners(Menu.menuLabels);
        getActionListeners(LevelsMenu.levelLabels);
        Tasks.backButton.addMouseListener(this);
        LevelsMenu.backButton.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        GameFunctions.playSound("buttonClick");

        if (e.getSource() == Menu.menuLabels.get(1)) {
            Menu.menuFrame.setVisible(false);
            LevelsMenu.levelFrame.setVisible(true);

        } else if (e.getSource() == Menu.menuLabels.get(2)) {
            Menu.menuFrame.setVisible(false);
            Tasks.tasksFrame.setVisible(true);
        } else if (e.getSource() == Menu.menuLabels.get(3)) {
            Menu.menuFrame.dispatchEvent(new WindowEvent(Menu.menuFrame, WindowEvent.WINDOW_CLOSING));

        } else if (e.getSource() == Menu.menuLabels.get(0)) {
            if (GameFunctions.soundOn == true) {
                Menu.menuLabels.get(0).setIcon(new ImageIcon("icons\\soundOff.png"));
                GameFunctions.soundOn = false;
                GameFunctions.clips.get(0).stop();

            } else {
                Menu.menuLabels.get(0).setIcon(new ImageIcon("icons\\sound.png"));
                GameFunctions.soundOn = true;
                GameFunctions.clips.get(0).start();
                GameFunctions.clips.get(0).loop(Clip.LOOP_CONTINUOUSLY);
            }

        }

        if (e.getSource() == Tasks.backButton) {
            Tasks.tasksFrame.setVisible(false);
            Menu.menuFrame.setVisible(true);
        } else if (e.getSource() == LevelsMenu.backButton) {
            LevelsMenu.levelFrame.setVisible(false);
            Menu.menuFrame.setVisible(true);
        }

        if (e.getSource() == LevelsMenu.levelLabels.get(0)) {

            new GameScreen();
            Levels.level1();
            getNewLevel(1);

        } else if (e.getSource() == LevelsMenu.levelLabels.get(1)) {
            new GameScreen();
            Levels.level2();
            getNewLevel(2);
        } else if (e.getSource() == LevelsMenu.levelLabels.get(2)) {
            new GameScreen();
            Levels.level3();
            getNewLevel(3);
        } else if (e.getSource() == LevelsMenu.levelLabels.get(3)) {
            new GameScreen();
            Levels.level4();
            getNewLevel(4);
        } else if (e.getSource() == LevelsMenu.levelLabels.get(4)) {
            new GameScreen();
            Levels.level5();
            getNewLevel(5);
        } else if (e.getSource() == LevelsMenu.levelLabels.get(5)) {
            new GameScreen();
            Levels.level6();
            getNewLevel(6);
        }

        if (isGameScreenMade == true) {
            if (e.getSource() == Menu.inGameLabels.get(0)) {
                clearEverything();
                isGameScreenMade = false;
                Menu.menuFrame.setVisible(true);
            } else if (e.getSource() == Menu.inGameLabels.get(1)) {
                clearEverything();
                new GameScreen();
                switch (GameFunctions.activeLevel) {
                    case 1:
                        Levels.level1();
                        break;
                    case 2:
                        Levels.level2();
                        break;
                    case 3:
                        Levels.level3();
                        break;
                    case 4:
                        Levels.level4();
                        break;
                    case 5:
                        Levels.level5();
                        break;
                    case 6:
                        Levels.level6();
                        break;
                }
                if (isGameScreenMade == true) {
                    getToolActionListeners();
                }
            }

            else if (e.getSource() == Menu.inGameLabels.get(2)) {
                clearEverything();
                new GameScreen();
                switch (GameFunctions.activeLevel) {
                    case 1:
                        Levels.level2();
                        break;
                    case 2:
                        Levels.level3();
                        break;
                    case 3:
                        Levels.level4();
                        break;
                    case 4:
                        Levels.level5();
                        break;
                    case 5:
                        Levels.level6();
                        break;
                    default:
                        GameScreen.gameFrame.dispose();
                        isGameScreenMade = false;
                        Menu.menuFrame.setVisible(true);
                        break;
                }
                GameFunctions.activeLevel++;
                if (isGameScreenMade == true) {
                    getToolActionListeners();
                }
            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        for (JLabel label : LevelsMenu.levelLabels) {
            if (e.getSource() == label) {
                label.setBackground(new Color(33, 240, 255));
            }
        }
        if (isGameScreenMade == true) {
            for (JLabel label : Menu.inGameLabels) {
                if (label == Menu.inGameLabels.get(3)) {
                    continue;
                }
                if (e.getSource() == label) {
                    label.setBackground(new Color(33, 240, 255));
                }
            }
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

        for (JLabel label : LevelsMenu.levelLabels) {
            if (e.getSource() == label) {
                label.setBackground(new Color(255, 255, 255));
            }
        }
        if (isGameScreenMade == true) {
            for (JLabel label : Menu.inGameLabels) {
                if (label == Menu.inGameLabels.get(3)) {
                    continue;
                }
                if (e.getSource() == label) {
                    label.setBackground(new Color(255, 255, 255));
                }
            }
        }
    }

    public void getToolActionListeners() {
        getActionListeners(Menu.inGameLabels);
        Menu.inGameLabels.get(2).setVisible(false);
    }

    public void getActionListeners(ArrayList<JLabel> labels) {
        for (JLabel label : labels) {
            label.addMouseListener(this);
        }
    }

    public void clearEverything() {
        GameScreen.gameFrame.dispose();
        GameFunctions.coins.clear();
        Menu.inGameLabels.clear();
        GameFunctions.walls.clear();
        GameFunctions.tracePanels.clear();
        GameFunctions.goals.clear();
        Entity.getReset();
        GameFunctions.entities.clear();
        GameFunctions.bouncePads.clear();
        GameFunctions.spikes.clear();
        GameFunctions.timer.stop();
    }

    public void getNewLevel(int levelNum) {
        isGameScreenMade = true;
        GameFunctions.activeLevel = levelNum;
        LevelsMenu.levelFrame.setVisible(false);
        if (isGameScreenMade == true) {
            getToolActionListeners();
        }
    }
}
