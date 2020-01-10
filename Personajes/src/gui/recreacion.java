package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class recreacion extends JFrame{
    private final int AnchoVentana = 500;
    private final int AltoVentana = 500;
    Thread hilo;
    boolean inicio = false;
    BufferedImage bi;
    Image img;
    Toolkit h = Toolkit.getDefaultToolkit();
    Graphics2D g2d;
    int Incremento = 0;
    int incx = 50;
    int incy = 50;
    boolean arriba=true;
    boolean abajo=true;
    boolean izquierda=true;
    boolean derecha=true;
    boolean ataca=true;
    public static String eleccion;


    public void arriba(){
        abajo=true;
        izquierda=true;
        derecha=true;
        ataca=true;
    }
    public void abajo(){
        arriba=true;
        izquierda=true;
        derecha=true;
        ataca=true;
    }
    public void izquierda(){
        abajo=true;
        arriba=true;
        derecha=true;
        ataca=true;
    }
    public void derecha(){
        abajo=true;
        izquierda=true;
        arriba=true;
        ataca=true;
    }

    public recreacion() {
        setSize(AnchoVentana,AltoVentana);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Animation");
//		hilo = new Thread(this);
        bi = new BufferedImage(AnchoVentana, AltoVentana, BufferedImage.TYPE_INT_RGB);

//		hilo.start();
        inicio = true;

        addKeyListener(new KeyAdapter() {

        @Override
        public void keyPressed(KeyEvent e) {

            if(e.getKeyCode()==KeyEvent.VK_UP){
                img = h.getImage(this.getClass().getResource("/assets/"+"Enano"+"_arriba.png"));

                    Incremento++;

                    if(Incremento>4){
                        Incremento = 0;
                    }
                if(arriba==true){
                    incy = incy-4;
                    if(incy<20){
                        incy = incy +4;
                    }
                }
            }


            if(e.getKeyCode()==KeyEvent.VK_DOWN){
                img = h.getImage(this.getClass().getResource("/assets/"+"Enano"+"_abajo.png"));

                    Incremento++;

                    if(Incremento>4){
                            Incremento = 0;
                    }
                if(abajo==true){
                    incy = incy+4;
                    if(incy>getHeight()-40){
                            incy = incy -4;
                    }
                }
            }
            
            if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                img = h.getImage(this.getClass().getResource("/assets/"+"Enano"+"_derecha.png"));
                Incremento++;

                if(Incremento>4){
                        Incremento = 0;
                }
                if(derecha==true){
                    incx=incx+4;
                    if(incx>getWidth()-15){
                            incx = incx-10;
                    }
                }

            }
            
            if(e.getKeyCode()==KeyEvent.VK_LEFT){					
                img = h.getImage(this.getClass().getResource("/assets/"+"Enano"+"_izquierda.png"));
                Incremento++;


                if(Incremento>4){
                        Incremento = 0;
                }
                if(izquierda=true){
                    incx=incx-4;
                    if(incx<-4){
                            incx=incx+4;
                    }
                }
            }
            
            if(e.getKeyCode()==KeyEvent.VK_C){					
                img = h.getImage(this.getClass().getResource("/assets/"+"Enano"+"_ataca_2.png"));
                Incremento=Incremento+5;
                if(Incremento>5){
                        Incremento = 0;
                }
            }

        }
        });
        setFocusable(true);
    }



    @Override
    public void paint(Graphics g) {
            g.drawImage(bi,0,0,null);
            int mxA = (Incremento%6)*64;
            int myA = (Incremento/6)*52;
            g2d = bi.createGraphics();
            g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
            g2d.drawImage(img, incx-25, incy-25, 50+incx, 50+incy, mxA, myA, mxA+64, myA+52, this);

            repaint();
    }


    public static void inicia() {
        new recreacion().setVisible(true);            
    }

}