
package Herencia;

public class Empleado {
    protected int idEmpleado;
    protected String nombre;
    protected String apellido;
    protected double salario;
    protected boolean arl;
    protected static int contadorEmpleados;

    public Empleado(String nombre, String apellido, double salario, boolean arl) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.arl = arl;
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }    
    
}
