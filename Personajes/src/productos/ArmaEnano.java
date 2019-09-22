/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author judil
 */
public class ArmaEnano implements Arma{
    @Override
    public String Estado() {
        return "Creando arma enano";
    }
    public static String Arma(){
        return "Elaborada con madera del árbol de la vida";
    }
}
