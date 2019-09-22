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
public class ArmaduraElfo implements Armadura{
    @Override
    public String Estado() {
        return "Creando armadura elfo";
    }
    public static String Armadura(){
        return "Armadura cómoda, 30% resistenccia";
    }
}
