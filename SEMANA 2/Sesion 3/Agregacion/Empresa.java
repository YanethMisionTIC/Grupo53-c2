
package Agregacion;

public class Empresa {
    private String razonSocial;
    private String nit;
    //Creamos la relación de agregación entre las clases
    //Mediante el array Cliente
    public Cliente [] clientes;
    
    //Insertamos 2 constructores de la clase Empresa, uno vacío y otro con todos los atributos

    public Empresa() {
    }

    public Empresa(String razonSocial, String nit, Cliente[] clientes) {
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Empresa{" + "razonSocial=" + razonSocial + ", nit=" + nit + ", clientes=" + clientes + '}';
    }
}
