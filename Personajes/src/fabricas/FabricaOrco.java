/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import productos.ArmaOrco;
import productos.ArmaduraOrco;
import productos.CuerpoOrco;
import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;

/**
 *
 * @author judil
 */
public class FabricaOrco implements FabricaPersonaje{

    @Override
    public Arma CrearArma() {
        return new ArmaOrco();
    }

    @Override
    public Cuerpo CrearCuerpo() {
        return new CuerpoOrco();
    }

    @Override
    public Armadura CrearArmadura() {
        return new ArmaduraOrco();
    }
    
}
