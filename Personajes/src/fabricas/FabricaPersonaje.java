/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;
/**
 *
 * @author judil
 */
public interface FabricaPersonaje {
    public Arma CrearArma();
    public Cuerpo CrearCuerpo();
    public Armadura CrearArmadura();
}
