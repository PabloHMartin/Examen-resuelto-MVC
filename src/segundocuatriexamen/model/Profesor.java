
package segundocuatriexamen.model;

public class Profesor extends Persona{
    
   private double salario;
   private boolean fijo;

    public Profesor(double salario, boolean fijo, String dni, String nombre) {
        super(dni, nombre);
        this.salario = salario;
        this.fijo = fijo;
    }
   
    public double salarioFinal(double retencionIrpf,double antigüedad){
        //salarioFinal = salario – (salario* retención IRPF/100) + (antigüedad * 50)
        return this.salario-=((salario*retencionIrpf/100)+(antigüedad*50));
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isFijo() {
        return fijo;
    }

    public void setFijo(boolean fijo) {
        this.fijo = fijo;
    }
    
    
    
    
    
}
