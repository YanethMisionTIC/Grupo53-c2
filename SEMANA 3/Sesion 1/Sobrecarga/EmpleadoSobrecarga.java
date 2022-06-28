package Sobrecarga;

public class EmpleadoSobrecarga{
    //1. Declaración de los atributos
    protected String nombre;
    protected double salario;
    protected double bonificacion;
    protected String departamento;
    
    //2. Añadimos los constructores de la clase empleado
    public EmpleadoSobrecarga() {}

    public EmpleadoSobrecarga(String nombre) {
        this.nombre = nombre;
    }

    public EmpleadoSobrecarga(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public EmpleadoSobrecarga(String nombre, double salario, double bonificacion, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.bonificacion = bonificacion;
        this.departamento = departamento;
    }
    
    //3.Función para imprimir el objeto
    //Clic secundario > Insert code > toString()
    @Override
    public String toString() {
        return "EmpleadoSobrecarga{" + "nombre=" + nombre + ", salario=" 
                + salario + ", bonificacion=" + bonificacion 
                + ", departamento=" + departamento + '}';
    }
}
