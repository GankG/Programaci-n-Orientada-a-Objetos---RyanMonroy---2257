/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacomposicion;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.pc.Computadora;

/**
 *
 * @author rigar
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora pc1 = new Computadora();
        
        pc1.setMarca("ASUS");
        pc1.setModelo("AMD APU A10 Sonicmaster");
        pc1.setCpu(new CPU("AMD","APU A10 6700", 3.7f));
        pc1.setMonitor(new Monitor("HP","LV911",13));
        pc1.setMouse(new Mouse("Razer","Orochi V2","Gaming"));
        pc1.setTeclado(new Teclado("Hyper X","Alloy Origins Core",255,106));

        System.out.println(pc1.toString());
        
        
    }
    
}
