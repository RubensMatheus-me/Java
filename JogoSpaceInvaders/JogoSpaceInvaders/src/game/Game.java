package game;

import models.Level;

import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Game extends JFrame {

    public Game() {
        Level level = new Level();
        add(level);
        setTitle("Game by Rubao");//nome da janela
        setSize(1280, 720);//tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//parar de executar o programa quando fechar a janela;
        setLocationRelativeTo(null);// define onde a janela irá aparecer, como é nulo irá aparecer no meio da tela
        setResizable(false); //nao pode alterar o tamanho da janela, por isso false
        setVisible(true); // define a visibilidade da janela como visivel(true)

    }


}
