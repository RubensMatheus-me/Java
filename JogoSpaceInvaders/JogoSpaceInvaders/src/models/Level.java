package models;


import javax.swing.*;
import java.awt.*;

public class Level extends JPanel {

    private Image background;
    private Player player;

    public Level() {
        ImageIcon loader = new ImageIcon("src/resources/maxresdefault.jpg");
        background = loader.getImage();
        player = new Player();
        player.load();

    }
    public void paint(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        graphics.drawImage(background, 0, 0, null);
        graphics.drawImage(player.getImage(), player.getPositionX(), player.getPositionY(), this);
        g.dispose();
    }

    public void repaintPlayer() {
        player.setHeight(110);
    }
}
