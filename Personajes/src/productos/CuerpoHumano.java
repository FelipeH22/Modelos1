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
public class CuerpoHumano implements Cuerpo{
    @Override
    public String Estado() {
        return "Creando cuerpo humano";
    }
    public static String Habilidad(){
        return "Ofensivo y débil";
    }
}
