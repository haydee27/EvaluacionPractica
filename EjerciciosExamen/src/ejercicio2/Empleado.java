
package ejercicio2;

import java.util.Scanner;

public class Empleado {
    String nombre, direccion;
    int id, edad, cargo;
   private double S, I, A,R, SF;
    String FI;
    
    public Empleado(){
        
        
    }

    public Empleado( int SF, String nombre, String direccion, int cargo, int id, int edad, double S, double I, double A, double R, String FI) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cargo = cargo;
        this.id = id;
        this.edad = edad;
        this.S = S;
        this.I = I;
        this.A = A;
        this.R = R;
        this.FI = FI;
    }

    public double getSF() {
        return SF;
    }

    public void setSF(double SF) {
        this.SF = SF;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int Cargo) {
        this.cargo = Cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getS() {
        return S;
    }

    public void setS(double S) {
        this.S = S;
    }

    public double getI() {
        return I;
    }

    public void setI(double I) {
        this.I = I;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public String getFI() {
        return FI;
    }

    public void setFI(String FI) {
        this.FI = FI;
    }
    
    public void pedir(){
        Scanner L = new Scanner(System.in);
        
        System.out.println("Dijite su nombre: ");
        this.nombre = L.nextLine();
        System.out.println("\n");
        
        System.out.println("Dijite su id: ");
        this.id = L.nextInt();
        System.out.println("\n");
        
        System.out.println("Dijite su edad: ");
        this.edad =L.nextInt();
        System.out.println("\n");
        
        System.out.println("Dijite su direccion:");
        this.direccion =L.next();
        System.out.println("\n");
        
        
        System.out.println("Ingrese su fecha de ingreso: ");
        this.FI = L.next();
        System.out.println("\n");
        
        System.out.println("Ingrese su sueldo base: $");
        this.S = L.nextDouble();
        System.out.println("\n");
        
        
        System.out.println("Digite 1 si su cargo es por servicio y 2 si su cargo es permanente: $");
        this.cargo  = L.nextInt();
        System.out.println("\n");
        
    }
     
    public void info (){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Su Nombre: " + this.nombre );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Su Edad:"+ this.edad);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Su direccion:" + this.direccion);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Su fecha de ingreso es: " +this.SF);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public void C ( ){
       
        if (cargo == 1){
            this.R= (this.S * 0.10);
           this.SF = (this.S - this.R);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Es un empleado por servicio y su salario menos impuesto es: $" + this.SF);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }else if(cargo == 2){
            this.R = this.S * 0.10;
            this.I = this.S * 0.03;
            this.A = this.S * 0.0725;
            this.SF = (this.S -this.R - this.I- this.A);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Es un empleado permanente y su salario menos impuestos es: $"+ this.SF);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    
    public static void main(String [] args ){
        
        
        Empleado I;
        I = new Empleado();
        System.out.println("");
        
        I.pedir();
        I.info();
        I.C();
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Area A = new Area();
        
         String dato = A.DatosItca(A);//
        System.out.println("");
        System.out.println("" +dato);//
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        
    }
    
}
