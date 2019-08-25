package singleton;

import java.util.Scanner;

public class main {

    static int eleccion=1;
    public static void main(String[] args) {
        while(eleccion!=0)
        {
            System.out.println("Digite 1 para crear un objeto persona, o 0 para salir");
            Scanner sc = new Scanner(System.in);
            eleccion = sc.nextInt();
            if(eleccion==1)
                persona.getInstancia();
        }
        
    }
    
}
