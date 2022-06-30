/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected String nombresPropietario;
    protected String placa;
    protected double valorCancelar;

    public String getNombresPropietario() {
        return nombresPropietario;
    }

    public Automovil(String nombresPropietario, String placa) {
        this.nombresPropietario = nombresPropietario;
        this.placa = placa;
    }

    public void setNombresPropietario(String nombresPropietario) {
        this.nombresPropietario = nombresPropietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorCancelar() {
        return valorCancelar;
    }

    public abstract void calcularValorCancelar();
    
    
    
    
}
