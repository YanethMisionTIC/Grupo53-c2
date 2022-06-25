package Herencia;


public class Gerente extends Empleado{
    private int cantSubordinados;

    public Gerente(int cantSubordinados, String nombre, String apellido, double salario, boolean arl) {
        super(nombre, apellido, salario, arl);
        this.cantSubordinados = cantSubordinados;
    }

    @Override
    public String toString() {
        return "Gerente{" +"idEmpleado=" + idEmpleado 
                + ", nombre=" + nombre 
                + ", apellido=" + apellido 
                + ", salario=" + salario 
                + ", arl=" + arl
                + "cantSubordinados=" + cantSubordinados + '}';
    }
    
    
}
