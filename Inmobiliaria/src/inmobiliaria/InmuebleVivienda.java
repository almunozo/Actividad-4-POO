/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria;

/**
 *
 * @author santi
 */
public class InmuebleVivienda extends Inmueble{
    protected int númeroHabitaciones;
    protected int númeroBaños;
public InmuebleVivienda(int identificadorInmobiliario, int área, String 
    dirección, int númeroHabitaciones, int númeroBaños) {
    super(identificadorInmobiliario, área, dirección); 
        this.númeroHabitaciones = númeroHabitaciones;
        this.númeroBaños = númeroBaños;
}
void imprimir() {
super.imprimir(); 
System.out.println("Numero de habitaciones = " + númeroHabitaciones);
System.out.println("Numero de banhos = " + númeroBaños);
}
}