package Polimorfismo;

import Sobreescritura.Empleado;

public class GerenteP extends EmpleadoP{
    private String departamento;
    private int cantSubordinados;

    public GerenteP(String nombre, double salario,String departamento, int cantSubordinados) {
        super(nombre, salario);
        this.departamento = departamento;
        this.cantSubordinados = cantSubordinados;
    }

    @Override
    public String obtenerDetallesFunction() {
        return "Nombre: " + super.nombre + ", salario: " + super.salario 
                + ", departamento: " + this.departamento
                + ", subordinados: " + this.cantSubordinados;
    }

    @Override
    public double calcularSalarioMes() {
        //Bonificación tiene el valor del 20% del salario
        this.bonificacion = this.salario * 0.2;
        double bonoAdicional = this.salario * 0.15;
        double salarioPagar = this.salario + this.bonificacion + bonoAdicional;
        return salarioPagar;
    }
}
