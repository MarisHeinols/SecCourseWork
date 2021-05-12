
import java.awt.*;

public class Levels {

    public static void level1() {
        GameScreen.c.setBackground(new Color(0, 0, 0));

        GameProps.getWall(30, 30, 90, 15);
        GameProps.getWall(30, 30, 15, 500);
        GameProps.getWall(30, 105, 15, 425);

        GameProps.getWall(455, 105, 350, 15);
        GameProps.getWall(530, 30, 350, 15);

        GameProps.getWall(760, 370, 85, 15);
        GameProps.getWall(530, 370, 15, 240);

        GameProps.getWall(455, 445, 15, 320);

        GameProps.getFinish(730, 385, 33, 240, 255);
        GameFunctions.restartGame(50, 50);
        GameFunctions.timer.restart();

    }

    public static void level2() {
        GameScreen.c.setBackground(new Color(0, 0, 0));

        GameProps.getWall(30, 30, 90, 15);
        GameProps.getWall(30, 30, 15, 500);
        GameProps.getWall(30, 105, 15, 425);

        GameProps.getWall(455, 105, 270, 15);
        GameProps.getWall(530, 30, 350, 15);

        GameProps.getWall(170, 370, 15, 300);
        GameProps.getWall(165, 370, 300, 15);
        GameProps.getWall(165, 665, 15, 300);

        GameProps.getWall(465, 590, 90, 15);

        GameProps.getWall(240, 590, 15, 225);
        GameProps.getWall(240, 445, 155, 15);
        GameProps.getWall(250, 445, 15, 525);
        GameProps.getWall(760, 370, 85, 15);
        GameProps.getWall(530, 370, 15, 240);
        Coin collorCoin = new Coin(300, 625, 255, 20, 56);
        GameProps.getFinish(730, 385, 255, 20, 56);
        GameFunctions.restartGame(50, 50);
        GameFunctions.timer.restart();

    }

    public static void level3() {
        GameScreen.c.setBackground(new Color(0, 0, 0));

        GameProps.getWall(50, 690, 15, 275);
        GameProps.getWall(50, 615, 80, 15);
        GameProps.getWall(50, 615, 15, 200);

        GameProps.getWall(325, 505, 200, 15);
        GameProps.getWall(250, 505, 125, 15);

        GameProps.getWall(150, 505, 15, 100);
        GameProps.getWall(325, 505, 15, 100);

        GameProps.getWall(150, 130, 375, 15);
        GameProps.getWall(225, 215, 215, 15);

        GameProps.getWall(225, 205, 15, 125);
        GameProps.getWall(225, 430, 15, 125);

        GameProps.getWall(340, 205, 240, 15);
        GameProps.getWall(415, 205, 315, 15);

        GameProps.getWall(150, 130, 15, 600);
        GameProps.getWall(415, 205, 15, 260);

        GameProps.getWall(675, 205, 275, 15);
        GameProps.getWall(750, 130, 275, 15);

        GameProps.getWall(675, 480, 15, 200);
        GameProps.getWall(750, 405, 15, 125);
        GameProps.getWall(875, 405, 90, 15);

        Coin collorCoinOne = new Coin(380, 300, 255, 20, 56);
        Coin collorCoinTwo = new Coin(180, 300, 105, 255, 3);

        Entity enemy = new Entity(300, 150, 255, 20, 56, 2, 0);

        GameProps.getFinish(845, 420, 105, 255, 3);

        GameFunctions.restartGame(70, 635);

    }

    public static void level4() {
        GameScreen.c.setBackground(new Color(0, 0, 0));
        GameProps.getWall(50, 695, 15, 365);
        GameProps.getWall(50, 620, 80, 15);
        GameProps.getWall(50, 620, 15, 200);
        GameProps.getWall(500, 620, 15, 165);

        GameProps.getWall(250, 100, 535, 15);
        GameProps.getWall(50, 100, 15, 200);
        GameProps.getWall(50, 25, 80, 15);
        GameProps.getWall(50, 25, 15, 350);
        GameProps.getWall(500, 100, 15, 150);

        GameProps.getWall(850, 100, 80, 15);
        GameProps.getWall(650, 100, 15, 215);
        GameProps.getWall(650, 180, 15, 215);

        GameProps.getWall(650, 180, 120, 15);
        GameProps.getWall(650, 300, 15, 200);
        GameProps.getWall(850, 300, 80, 15);
        GameProps.getWall(650, 380, 15, 215);
        GameProps.getWall(650, 380, 240, 15);

        GameProps.getWall(400, 620, 75, 15);
        GameProps.getWall(400, 620, 15, 100);

        GameProps.getWall(325, 380, 15, 265);
        GameProps.getWall(325, 380, 100, 15);
        GameProps.getWall(325, 480, 15, 265);
        GameProps.getWall(575, 380, 115, 15);

        GameProps.getWall(400, 25, 200, 15);
        GameProps.getWall(400, 225, 15, 115);
        GameProps.getWall(500, 100, 140, 15);

        GameProps.getFinish(820, 320, 105, 255, 3);

        Coin collorCoinOne = new Coin(90, 60, 255, 20, 56);
        Coin collorCoinTwo = new Coin(780, 135, 105, 255, 3);

        Entity enemyOne = new Entity(400, 495, 255, 20, 56, 2, 0);
        GameProps.getSpikes(450, 320, "Ver");
        GameProps.getSpikes(450, 250, "Ver");

        GameFunctions.restartGame(70, 640);

    }

    public static void level5() {
        GameScreen.c.setBackground(new Color(0, 0, 0));
        GameProps.getWall(50, 50, 15, 500);
        GameProps.getWall(550, 50, 70, 15);
        GameProps.getWall(550, 120, 15, 300);
        GameProps.getWall(850, 120, 70, 15);
        GameProps.getWall(850, 190, 15, 100);
        GameProps.getWall(950, 190, 525, 15);

        GameProps.getWall(50, 50, 400, 15);
        GameProps.getWall(50, 450, 15, 100);
        GameProps.getWall(150, 450, 185, 15);
        GameProps.getWall(50, 625, 15, 115);
        GameProps.getWall(50, 625, 90, 15);
        GameProps.getWall(50, 625, 80, 15);
        GameProps.getWall(50, 700, 15, 200);
        GameProps.getWall(250, 580, 135, 15);
        GameProps.getWall(250, 580, 15, 100);
        GameProps.getWall(350, 580, 120, 15);
        GameProps.getWall(350, 700, 15, 300);
        GameProps.getWall(650, 580, 135, 15);
        GameProps.getWall(650, 580, 15, 100);
        GameProps.getWall(750, 265, 330, 15);
        GameProps.getWall(750, 265, 15, 120);
        GameProps.getWall(870, 265, 450, 15);
        GameProps.getWall(870, 700, 15, 80);

        GameProps.getWall(450, 450, 15, 100);
        GameProps.getWall(550, 200, 265, 15);
        GameProps.getWall(350, 200, 15, 200);
        GameProps.getWall(350, 200, 100, 15);
        GameProps.getWall(350, 300, 15, 100);
        GameProps.getWall(450, 300, 150, 15);

        Coin collorCoinOne = new Coin(360, 330, 255, 20, 56);
        Coin collorCoinTwo = new Coin(910, 665, 105, 255, 3);

        Entity deathMachine = new Entity(895, 500, 255, 20, 56, 0, 2);
        Entity terminator = new Entity(500, 500, 33, 240, 255, 0, 2);

        BouncePad padOne = new BouncePad(568, 410, "bottomRight");
        BouncePad padTwo = new BouncePad(67, 398, "bottomRight");
        BouncePad padThree = new BouncePad(398, 398, "bottomLeft");
        BouncePad padFour = new BouncePad(568, 210, "topRight");
        BouncePad padFive = new BouncePad(698, 526, "bottomLeft");

        GameProps.getFinish(65, 640, 105, 255, 3);
        GameFunctions.restartGame(70, 70);

    }

    public static void level6() {
        GameScreen.c.setBackground(new Color(0, 0, 0));
        GameProps.getWall(50, 50, 15, 600);
        GameProps.getWall(650, 50, 335, 15);
        GameProps.getWall(550, 370, 15, 100);
        GameProps.getWall(550, 370, 80, 15);
        GameProps.getWall(550, 450, 15, 200);
        GameProps.getWall(750, 150, 315, 15);
        GameProps.getWall(750, 150, 15, 80);
        GameProps.getWall(830, 150, 395, 15);
        GameProps.getWall(570, 530, 15, 260);
        GameProps.getWall(570, 530, 100, 15);
        GameProps.getWall(270, 630, 15, 315);
        GameProps.getWall(270, 630, 30, 15);
        GameProps.getWall(270, 660, 15, 315);
        GameProps.getWall(570, 660, 80, 15);
        GameProps.getWall(190, 730, 15, 395);
        GameProps.getWall(190, 630, 100, 15);
        GameProps.getWall(120, 630, 15, 70);
        GameProps.getWall(120, 530, 100, 15);
        GameProps.getWall(50, 530, 15, 70);
        GameProps.getWall(50, 50, 480, 15);

        GameProps.getWall(130, 130, 15, 100);
        GameProps.getWall(130, 130, 300, 15);
        GameProps.getWall(130, 430, 15, 60);
        GameProps.getWall(190, 295, 150, 15);
        GameProps.getWall(190, 295, 15, 40);
        GameProps.getWall(230, 130, 180, 15);

        GameProps.getWall(310, 130, 15, 100);
        GameProps.getWall(310, 130, 165, 15);
        GameProps.getWall(310, 295, 15, 115);
        GameProps.getWall(410, 130, 165, 15);

        GameProps.getWall(490, 130, 15, 100);
        GameProps.getWall(490, 130, 165, 15);
        GameProps.getWall(490, 295, 15, 100);
        GameProps.getWall(575, 130, 165, 15);

        Coin collorCoinOne = new Coin(790, 180, 105, 255, 3);

        Entity deathMachine = new Entity(255, 130, 255, 20, 56, 0, 2);
        Entity terminator = new Entity(430, 330, 105, 255, 3, 0, 2);

        BouncePad padOne = new BouncePad(70, 475, "bottomRight");
        BouncePad padTwo = new BouncePad(775, 475, "bottomLeft");

        GameProps.getFinish(540, 673, 105, 255, 3);
        GameFunctions.restartGame(70, 70);

    }

}
