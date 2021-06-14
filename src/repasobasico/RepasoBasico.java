/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;
import ico.fes.dispositivos.SmartPhone;

/**
 *
 * @author Rsin
 */
public class RepasoBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SmartPhone cel1 = new SmartPhone("Samsung");
        SmartPhone cel2 = new SmartPhone("Huawei" , "P40" , "Gris" , 5.5f);
        SmartPhone cel3 = new SmartPhone("Apple","iPhone 8 Plus");
        SmartPhone cel4 = new SmartPhone();
        System.out.println(cel1);
        System.out.println(cel2);
        System.out.println(cel3);
        System.out.println(cel4);
        
        //Uso de métodos de acceso.
        cel1.setModelo("Galazy Note 18");
        System.out.println(cel1);
        System.out.println("Marca del cel: "+cel1.getMarca());
        
        //Uso de un atributo no protegido
        //cel1.tamanio=526.5f; rompe con la logica del negocio (vida real)
        cel1.setTamanio(626.5f);
        cel1.setTamanio(4.5f);
        System.out.println("El tamaño del cel: "+cel1.getTamanio());
    }
    
}
