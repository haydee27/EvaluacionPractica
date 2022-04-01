
package Ejercicios;

import java.util.Scanner;


public class Datos {
    public static void main( String [] args){
        
   
    Scanner L = new Scanner( System.in);
    
    Salario Dato = new Salario();
    
        System.out.println("Escriba el nombre del empleado: " );
        Dato.setNombre(L.nextLine());
        System.out.println("Escriba el salario: ");
        Dato.setSueldo(L.nextDouble());
        System.out.println("Escriba el numero de horas trabajadas: ");
        Dato.setHorasTrabajadas(L.nextDouble());
        System.out.println("Escriba el monto de salario por hora:  ");
        Dato.setPagoPorHoras(L.nextDouble());
        
        
        
        
        System.out.println("El nombre del empleado es" + Dato.getNombre());
        System.out.println("El salario bruto es: $ " + Dato.salarioL(Dato));
        System.out.println("El salario Liquido es: $" + Dato.salL(Dato));
        System.out.println("La retencion de su salario es: $" + Dato.Renta(Dato));
        
        //La clase si funciona pero la respuesta que me da es incorrecta.  
    } 
}
