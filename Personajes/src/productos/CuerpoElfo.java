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
public class CuerpoElfo implements Cuerpo{
    @Override
    public String Estado() {
        return "Creando cuerpo elfo";
    }
    public static String Habilidad(){
        return "Comunicación con la naturaleza";
    }
}
