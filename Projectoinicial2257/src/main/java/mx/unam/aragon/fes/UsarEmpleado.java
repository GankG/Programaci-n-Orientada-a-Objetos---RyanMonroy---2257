/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

/**
 *
 * @author Rsin
 */
public class UsarEmpleado {
    public static void main(String[] args)
    {
        Empleado empl = new Empleado();
        empl.setNombre("José");
        empl.setSueldo(10000.0f);
        empl.setHorasExtra(10);
        float cobro = empl.calcularSueldo();
        System.out.println("Gran total: "+ cobro);
        System.out.println(empl.toString());
    }
}
