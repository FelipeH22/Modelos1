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
public class ArmaduraOrco implements Armadura{
    @Override
    public String Estado() {
        return "Creando armadura orco";
    }
    public static String Armadura(){
        return "Irrompible, 200% de resistencia";
    }
}
