
package Sobreescritura;

public class Operario extends Empleado{
    
    private boolean maquinaPesada;

    public Operario(String nombre, double salario, boolean maquinaPesada) {
        super(nombre, salario);
        this.maquinaPesada = maquinaPesada;
    }

    @Override
    public String obtenerDetallesFunction() {
        return "Nombre: " + super.nombre + ", salario: " + super.salario 
                + ", manejo maquinaria pesada: " + this.maquinaPesada;
    }

    @Override
    public double calcularSalarioMes() {
        return super.calcularSalarioMes(); //To change body of generated methods, choose Tools | Templates.
    }
}
