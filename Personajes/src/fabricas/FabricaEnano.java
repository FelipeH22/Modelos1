/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;
import productos.ArmaEnano;
import productos.ArmaduraEnano;
import productos.CuerpoEnano;
/**
 *
 * @author judil
 */
public class FabricaEnano implements FabricaPersonaje{
    @Override
    public Arma CrearArma(){
        return new ArmaEnano();
    }
    @Override
    public Armadura CrearArmadura(){
        return new ArmaduraEnano();
    }
    @Override
    public Cuerpo CrearCuerpo(){
        return new CuerpoEnano();
    }
}
