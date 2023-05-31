package models;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Level extends JPanel implements ActionListener {

    private Image background;
    private Player player;
    private Timer timer;

    public Level() {
        setFocusable(true);
        setDoubleBuffered(true);

        ImageIcon loader = new ImageIcon("src/resources/maxresdefault.jpg");
        background = loader.getImage();
        player = new Player();
        player.load();

        addKeyListener(new KeyboardAdapter());

        timer = new Timer(5, this);
        timer.start();
    }
    public void paint(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        graphics.drawImage(background, 0, 0, null);
        graphics.drawImage(player.getImage(), player.getPositionX(), player.getPositionY(), this);
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        repaint();

    }
    public void repaintPlayer() {
        player.setHeight(110);
    }

    public class KeyboardAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e) {
            player.keyRelease(e);
        }
    }
}
