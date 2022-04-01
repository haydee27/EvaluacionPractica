
package Ejercicios;

public class Salario{
    double HorasTrabajadas;
    double PagoPorHoras;
    double renta;
    String nombre;
    double sueldo;

    public Salario(double HorasTrabajadas, double PagoPorHoras,  String nombre, double renta) {
        this.HorasTrabajadas = HorasTrabajadas;
        this.PagoPorHoras = PagoPorHoras;
        this.renta = renta;
        this.nombre = nombre;
    }

    public Salario(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(double HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }

    public double getPagoPorHoras() {
        return PagoPorHoras;
    }

    public void setPagoPorHoras(double PagoPorHoras) {
        this.PagoPorHoras = PagoPorHoras;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }
    
    
    public Salario(){
        
        
    }
    public double TotalSalario(){
   double TtalS= 0.0;
        TtalS = this.HorasTrabajadas * this.PagoPorHoras;
      return TtalS;  
    }
  
    public double HorasExtras(){
        double  HE2, HE3;
        double salario = 0.0;
        
        if(this.HorasTrabajadas <= 40){
            salario = this.HorasTrabajadas * this.PagoPorHoras;}
            else if ( this.HorasTrabajadas > 40 && this.HorasTrabajadas <= 48){
                    HE2= this.HorasTrabajadas - this.PagoPorHoras;
                    salario =(40*this.HorasTrabajadas) + (HE2*this.PagoPorHoras*2);
                    }else if (this.HorasTrabajadas>48){
                        HE3= this.HorasTrabajadas-48;
                        salario= (40 * this.PagoPorHoras) + (8*this.PagoPorHoras*2) + (HE3*this.PagoPorHoras *3);
                    }  
        return salario;
    }
    
    public double salarioL(Salario dato){
        
        double SB;
        double SB2;
        
        SB = dato.HorasExtras();
        SB2= (this.sueldo + SB);
        return SB2;
    }
    
    public double Renta( Salario dato){
       double renta ;
       
       renta= (dato.HorasExtras() * 0.10);
        
        return renta;
    }
    public double salL(Salario dato){
        
        double Slrenta = 0.0;
        double SalB;
        double salLiq;  
        
        salLiq = dato.Renta(dato);
        SalB = dato.salarioL(dato);
        
        Slrenta = SalB - salLiq;
        return Slrenta;
    }
}
