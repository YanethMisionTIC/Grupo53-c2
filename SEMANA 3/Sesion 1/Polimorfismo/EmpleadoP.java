package Polimorfismo;

public class EmpleadoP{
    //1. Declaración de los atributos
    protected String nombre;
    protected double salario;
    protected double bonificacion;
    
    //2. Inserción del constructor de la clase
    public EmpleadoP(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    //3. Función que retorna la información del empleado
    public String obtenerDetallesFunction(){
        return "Nombre: " + this.nombre + ", salario: " + this.salario;
    }
    
    public double calcularSalarioMes(){
        //Bonificación tiene el valor del 20% del salario
        this.bonificacion = this.salario * 0.2;
        double salarioPagar = this.salario + this.bonificacion;
        return salarioPagar;
    }
}
