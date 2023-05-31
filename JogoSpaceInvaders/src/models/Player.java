package models;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player {
    private int positionX;
    private int positionY;
    private int deslocationX;

    private int deslocationY;
    private Image image;
    private int width;
    private int height;
    private int widthImage;
    private int heightImage;
    public Player() {
        this.positionX = 100;
        this.positionY = 100;
    }
    public void load() {
        ImageIcon loading = new ImageIcon("src/resources/Ship3.png");
        this.image = loading.getImage();
        this.heightImage = this.image.getHeight(null);
        this.widthImage = this.image.getWidth(null);
    }

    public void update() {
        positionX += deslocationX;
        positionY += deslocationY;
    }

    public void keyPressed(KeyEvent key) {
        int code = key.getKeyCode();

        if(code == KeyEvent.VK_UP) {
            deslocationY =- 3;
        }
        if(code == KeyEvent.VK_DOWN) {
            deslocationY = 3;
        }
        if(code == KeyEvent.VK_LEFT) {
            deslocationX =- 3;
        }
        if(code == KeyEvent.VK_RIGHT) {
            deslocationX = 3;
        }
    }

    public void keyRelease(KeyEvent key) {
        int code = key.getKeyCode();

        if(code == KeyEvent.VK_UP) {
            deslocationY = 0;
        }
        if(code == KeyEvent.VK_DOWN) {
            deslocationY = 0;
        }
        if(code == KeyEvent.VK_LEFT) {
            deslocationX = 0;
        }
        if(code == KeyEvent.VK_RIGHT) {
            deslocationX = 0;
        }
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getDeslocationX() {
        return deslocationX;
    }

    public int getDeslocationY() {
        return deslocationY;
    }


    public Image getImage() {
        return image;
    }


    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidthImage() {
        return widthImage;
    }


    public int getHeightImage() {
        return heightImage;
    }



}
