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

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getDeslocationX() {
        return deslocationX;
    }

    public void setDeslocationX(int deslocationX) {
        this.deslocationX = deslocationX;
    }

    public int getDeslocationY() {
        return deslocationY;
    }

    public void setDeslocationY(int deslocationY) {
        this.deslocationY = deslocationY;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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

    public void setWidthImage(int widthImage) {
        this.widthImage = widthImage;
    }

    public int getHeightImage() {
        return heightImage;
    }

    public void setHeightImage(int heightImage) {
        this.heightImage = heightImage;
    }


}
