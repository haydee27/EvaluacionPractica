
package ejercicio2;

import java.util.Scanner;

public class Area {
    int  cantE, NEdi;
    String nombre, ubicacion, NE,CDepar, Cpisos, idA ;
    
    Scanner L = new Scanner(System.in);
    public Area(){
        
        
    }

    public Area(String idA, int cantE, int NEdi, String nombre) {
        this.idA = idA;
        this.cantE = cantE;
        this.NEdi = NEdi;
        this.nombre = nombre;
    }
    

    public Area(String ubicacion, String NE, String CDepar, String Cpisos) {
        this.ubicacion = ubicacion;
        this.NE = NE;
        this.CDepar = CDepar;
        this.Cpisos = Cpisos;
    }
    
    public String U( ){
        
       
        System.out.println("Ubicacion: Km 64 1/2 , desvio Hacienda el Nilo sobre autopista a Zacatecoluca y Usulutan El Salvador" );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        return this.ubicacion;
    }
    
    public String N(){
        System.out.println ("Nombre: ITCA-FEPADE");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return this.NE;
    }
    
    public String D (){
        System.out.println ("Departamentos: 6 departamentos");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return this.CDepar;
    }
    
    public String P (){
        
        System.out.println("Pisos: Tres pisos por departamento");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return this.Cpisos;
    }
    
    public String ID(){
        System.out.println(" Codigo de Departamento: 1) 234, 2) 876, 3)  574, 4)  5567, 5) 356, 6) 356");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return this.idA;
    }
    
    public String NA (){
        
        System.out.println(" Areas: Cancha, Biblioteca, Computo, Laboratorio, Bienestar Estudiantil, Cafetin");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return this.nombre;
    }
    
    public String DatosItca( Area dato){
        Area a = new Area();
        a.N();
        a.ID();
        a.P();
        a.U();
        a.NA();
        a.D();
        
        /*System.out.println("" + dato.N());
        System.out.println(" " + dato.U() );
        System.out.println("" + dato.D());
        System.out.println("" + dato.P() );
        System.out.println(" "  + dato.ID());
        System.out.println("" + dato.NA() );*/
        
      return "";
    
    }
}
 

