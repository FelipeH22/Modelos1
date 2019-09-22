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
public class ArmaduraEnano implements Armadura{
    @Override
    public String Estado() {
        return "Creando armadura enano";
    }
    public static String Armadura(){
        return "Hecha por los mejores herreros del pueblo";
    }
}
