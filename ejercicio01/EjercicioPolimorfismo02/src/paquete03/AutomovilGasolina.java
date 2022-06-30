/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {
    double galonesMaximos;
    double costoGalon;
    double iva;

    public AutomovilGasolina(double galonesMaximos, double costoGalon, String nombresPropietario, String placa) {
        super(nombresPropietario, placa);
        this.galonesMaximos = galonesMaximos;
        this.costoGalon = costoGalon;
        this.iva = 10;
    }

    public double getGalonesMaximos() {
        return galonesMaximos;
    }

    public void setGalonesMaximos(double galonesMaximos) {
        this.galonesMaximos = galonesMaximos;
    }

    public double getCostoGalon() {
        return costoGalon;
    }

    public void setCostoGalon(double costoGalon) {
        this.costoGalon = costoGalon;
    }

    public double getIva() {
        return iva;
    }

    @Override
    public void calcularValorCancelar() {
        valorCancelar = (costoGalon * galonesMaximos) + (costoGalon * galonesMaximos)*(iva/100);
    }
    
    public String toString() {
        String cadena = String.format("Automovil Gasolina\n"
                + "Nombres Propietario: %s\n"
                + "Placa: %s\n"
                + "Galones Maximos: %.2f\n"
                + "Costo Galon: %.2f\n"
                + "Iva: %.2f\n"
                + "Valor cancelar: %.2f\n",
                nombresPropietario,
                placa,
                galonesMaximos,
                costoGalon,
                iva,
                valorCancelar);
        return cadena;
    }
    
    
    
}
