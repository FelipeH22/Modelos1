package gui;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class recreacion extends JFrame implements KeyListener {

    public recreacion() {
     init();
    }

    private void init() {
     setLayout(null);
     setTitle("Recreación");
     setVisible(true);
     setSize(700, 700);
     setLocationRelativeTo(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {

     int key = e.getKeyCode();

     if (key == KeyEvent.VK_LEFT) {

      System.out.println("Moviendo a la izquierda");
     }
     if (key == KeyEvent.VK_RIGHT) {

      System.out.println("Moviendo a la derecha");
     }
     if (key == KeyEvent.VK_UP) {

      System.out.println("Saltando");
     }
     if (key == KeyEvent.VK_C) {

      System.out.println("Atacando");
     }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

}