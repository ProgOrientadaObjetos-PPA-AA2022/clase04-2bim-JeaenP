/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {
    double numeroLitrosMaximos;
    double costoLitro;
    double descuentoLitro;

    public AutomovilDiesel(double numeroLitrosMaximos, double costoLitro,
            double descuentoLitro, String nombresPropietario, String placa) {
        super(nombresPropietario, placa);
        this.numeroLitrosMaximos = numeroLitrosMaximos;
        this.costoLitro = costoLitro;
        this.descuentoLitro = descuentoLitro;
    }

    
    public double getNumeroLitrosMaximos() {
        return numeroLitrosMaximos;
    }

    public void setNumeroLitrosMaximos(double numeroLitrosMaximos) {
        this.numeroLitrosMaximos = numeroLitrosMaximos;
    }

    public double getCostoLitro() {
        return costoLitro;
    }

    public void setCostoLitro(double costoLitro) {
        this.costoLitro = costoLitro;
    }

    public double getDescuentoLitro() {
        return descuentoLitro;
    }

    public void setDescuentoLitro(double descuentoLitro) {
        this.descuentoLitro = descuentoLitro;
    }
    
    @Override
    public void calcularValorCancelar() {
        valorCancelar = costoLitro * (numeroLitrosMaximos - 
                ((descuentoLitro/100)* numeroLitrosMaximos));
    }
    
    public String toString() {
        String cadena = String.format("Automovil Gasolina\n"
                + "Nombres Propietario: %s\n"
                + "Placa: %s\n"
                + "Litros Maximos: %.2f\n"
                + "Costo litro: %.2f\n"
                + "Descuento litros: %.2f\n"
                + "Litros facturados: %.2f\n"
                + "Valor cancelar: %.2f\n",
                nombresPropietario,
                placa,
                numeroLitrosMaximos,
                costoLitro,
                descuentoLitro,
                numeroLitrosMaximos - (numeroLitrosMaximos * descuentoLitro/100),
                valorCancelar);
        return cadena;
    }
}
