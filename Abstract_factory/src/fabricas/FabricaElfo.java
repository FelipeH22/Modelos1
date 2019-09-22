/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;
import productos.ArmaElfo;
import productos.ArmaduraElfo;
import productos.CuerpoElfo;

/**
 *
 * @author judil
 */
public class FabricaElfo implements FabricaPersonaje{
    @Override
    public Arma CrearArma(){
        return new ArmaElfo();
    }
    @Override
    public Armadura CrearArmadura(){
        return new ArmaduraElfo();
    }
    @Override
    public Cuerpo CrearCuerpo(){
        return new CuerpoElfo();
    }
}
