import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.File;

public class GameFunctions implements ActionListener {

    static int dirX = 0;
    static int dirY = 0;
    static boolean gameEnd = false;
    static boolean musicStarted = false;
    public static Player player = new Player("Player", 50, 50, 33, 240, 255);
    public static ArrayList<JLabel> walls = new ArrayList<JLabel>();
    public static ArrayList<Coin> coins = new ArrayList<Coin>();
    public static ArrayList<Entity> entities = new ArrayList<Entity>();
    public static ArrayList<JLabel> goals = new ArrayList<JLabel>();
    public static ArrayList<TracePanels> tracePanels = new ArrayList<TracePanels>();
    public static ArrayList<JLabel> spikes = new ArrayList<JLabel>();
    public static ArrayList<BouncePad> bouncePads = new ArrayList<BouncePad>();
    public static int activeLevel = 0;
    static int newX;
    static int newY;
    public static boolean keyLimit = false;
    public static boolean isWon = false;
    public static boolean spikeHit = false;
    public static boolean padBounce = false;
    public static boolean soundOn = true;
    public static boolean moving = false;
    static Timer timer;
    public static ArrayList<Clip> clips = new ArrayList<Clip>();

    public GameFunctions() {
        timer = new Timer(5, this);
    }

    public static void checkFinish() {
        for (JLabel goal : goals) {
            if (player.getBounds().intersects(goal.getBounds()) && player.r == GameProps.FinR) {
                goal.setBackground(new Color(166, 250, 57));
                player.setVisible(false);
                playSound("finish");
                gameEnd = true;
                timer.stop();
                dirX = 0;
                dirY = 0;
                Menu.inGameLabels.get(2).setVisible(true);
                isWon = true;
                GameProps.getFinsihLabel();
                Tasks.checkTasks();

            }

        }
    }

    public static synchronized void playSound(String name) {
        if (soundOn == true) {
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem
                        .getAudioInputStream(new File(System.getProperty("user.dir") + "\\sounds\\" + name + ".wav")));
                clips.add(clip);
                clip.start();
            } catch (Exception e) {

            }
        }
    }

    public static void restartGame(int x, int y) {
        player.setBounds(x, y, 50, 50);
        player.setVisible(true);
        player.setBackground(new Color(33, 240, 255));
        player.r = 33;
        player.g = 240;
        player.b = 255;
        GameScreen.c.add(player);
        Methods.getToolLabel();
        keyLimit = false;
        isWon = false;
        new GameKeyListener();
        timer.restart();

    }

    public static void checkSpikeHit() {
        for (JLabel spike : spikes) {
            if (spike.getBounds().intersects(player.getBounds())) {
                spikeHit = true;
                endGame();
            }

        }
    }

    public static void endGame() {
        playSound("rip");
        GameFunctions.player.setVisible(false);
        GameFunctions.timer.stop();
        GameFunctions.isWon = false;
        GameProps.getFinsihLabel();
        GameFunctions.dirX = 0;
        GameFunctions.dirY = 0;
        Tasks.checkTasks();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (timer.isRunning()) {

            Player.movement();
            Entity.movement();
            Entity.bounce();
            BouncePad.checkBouncePad();
            Player.bounce();
            if (moving == true) {
                TracePanels.trace();
            }
            player.setLocation(newX, newY);
            Coin.checkCoins(coins);
            checkSpikeHit();
            checkFinish();

        }

    }

}
