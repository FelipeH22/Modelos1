/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import fabricas.FabricaElfo;
import fabricas.FabricaEnano;
import fabricas.FabricaHumano;
import fabricas.FabricaOrco;
import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;
import java.util.Scanner;
import fabricas.FabricaPersonaje;

/**
 *
 * @author judil
 */
public class AbstractFactory {

    public FabricaPersonaje fabrica;
    public Arma arma;
    public Armadura armadura;
    public Cuerpo cuerpo;
    int a;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       gui.gui.main(args);
       /*
        Scanner sc = new Scanner(System.in);
        AbstractFactory exe = new AbstractFactory();
        do {
            System.out.println("Cual personaje desea crear?\n[1.]Humano\n[2.]Orco\n[3.]Elfo\n[4.]Enano\n");
            exe.a = sc.nextInt();
            
            if (exe.a > 4 || exe.a == 0) {
                System.out.println("Opcion incorrecta");
            } else {
                switch (exe.a) {
                    case 1:
                        exe.fabrica = new FabricaHumano();
                        break;
                    case 2:
                        exe.fabrica = new FabricaOrco();
                        break;
                    case 3:
                        exe.fabrica = new FabricaElfo();
                        break;
                    case 4:
                        exe.fabrica = new FabricaEnano();
                        break;
                }
            }

        
        } while (exe.a > 4 || exe.a == 0);
        exe.cuerpo=exe.fabrica.CrearCuerpo();
        exe.arma = exe.fabrica.CrearArma();
        exe.armadura = exe.fabrica.CrearArmadura();
        
        System.out.println(exe.cuerpo.Estado());
        System.out.println(exe.armadura.Estado());
        System.out.println(exe.arma.Estado()); */   
    }

}
