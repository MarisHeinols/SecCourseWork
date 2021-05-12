
import java.awt.event.*;

public class GameKeyListener implements KeyListener{

    static int count;

    public GameKeyListener(){
        GameScreen.gameFrame.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(GameFunctions.keyLimit== false){
            if (key == KeyEvent.VK_RIGHT) {
                GameFunctions.dirX = 20;
                presedAction();
            } else if (key == KeyEvent.VK_LEFT) {
                GameFunctions.dirX = -20;
                presedAction();
            } else if (key == KeyEvent.VK_DOWN) {
                GameFunctions.dirY = 20;
                presedAction();
            } else if (key == KeyEvent.VK_UP) {
                GameFunctions.dirY = -20;
                presedAction();
            }
        }
        
        
    }
    public void presedAction(){
        GameFunctions.moving=true;
        GameFunctions.keyLimit = true;
        GameFunctions.playSound("move");
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    
    
}
