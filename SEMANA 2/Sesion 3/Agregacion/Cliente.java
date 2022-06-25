package Agregacion;

public class Cliente {
    private int idClientes;
    private String nombre;
    private String email;
    private static int contadorClientes;
    
    //1. Insertar constructor
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        //2. Inicializamos la variable idClientes
        this.idClientes = ++Cliente.contadorClientes;
    }
    
    //3. Función que retorna el objeto

    @Override
    public String toString() {
        return "Clientes{" + "idClientes=" + idClientes + ", nombre=" + nombre + ", email=" + email + '}';
    }
    
    
}
