
package Polimorfismo;

public class OperarioO extends EmpleadoP{
    private boolean manejoMaquinaria;

    public OperarioO(boolean manejoMaquinaria, String nombre, double salario) {
        super(nombre, salario);
        this.manejoMaquinaria = manejoMaquinaria;
    }

    @Override
    public double calcularSalarioMes() {
        return super.calcularSalarioMes(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obtenerDetallesFunction() {
                return "Nombre: " + super.nombre + ", salario: " + super.salario 
                + ", manejo de maquinaria pesada: " + this.manejoMaquinaria;
    }
}
