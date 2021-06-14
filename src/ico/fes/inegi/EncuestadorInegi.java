/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.inegi;

import ico.fes.dispositivos.SmartPhone;

/**
 *
 * @author Rsin
 */
public class EncuestadorInegi {
    private String nombre;
    private SmartPhone dispositivo;

    public EncuestadorInegi(String nombre, SmartPhone dispositivo) {
        this.nombre = nombre;
        this.dispositivo = dispositivo;
    }

    public EncuestadorInegi() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SmartPhone getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(SmartPhone dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public String toString() {
        return "EncuestadorInegi{" + "nombre=" + nombre + ", dispositivo=" + dispositivo + '}';
    }
    
    
    
}
