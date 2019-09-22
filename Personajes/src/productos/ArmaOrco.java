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
public class ArmaOrco implements Arma{
    @Override
    public String Estado() {
        return "Creando arma orco";
    }
    public static String Arma(){
        return "Hacha forjada por los dioses nordicos";
    }
}
