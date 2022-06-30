/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        AutomovilGasolina ag = new AutomovilGasolina(20, 3, "Jean Valarezo", "ABB-2345");
        AutomovilDiesel ad = new AutomovilDiesel(20, 2, 10, "Mateo Valarezo", "ACC-2342");
        
        ag.calcularValorCancelar();
        ad.calcularValorCancelar();
        
        System.out.println(ag);
        System.out.println(ad);
    }
}
