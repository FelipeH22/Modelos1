/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import productos.ArmaHumano;
import productos.ArmaduraHumano;
import productos.CuerpoHumano;
import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;

/**
 *
 * @author judil
 */
public class FabricaHumano implements FabricaPersonaje{
    @Override
    public Arma CrearArma(){
        return new ArmaHumano();
    }
    @Override
    public Armadura CrearArmadura(){
        return new ArmaduraHumano();
    }
    @Override
    public Cuerpo CrearCuerpo(){
        return new CuerpoHumano();
    }
}
