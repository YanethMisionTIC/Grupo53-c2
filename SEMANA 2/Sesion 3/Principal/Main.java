
package Principal;

import Agregacion.Cliente;
import Agregacion.Empresa;
import Herencia.Gerente;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Instancia de la librería Scanner
        Scanner entradaDatos = new Scanner(System.in);
        String nombreCliente = "";
        String correoCliente = "";        
        
        Empresa instEmpresa = new Empresa();
        Gerente jefe = new Gerente(23, "Jacinto", "jacinto@misiontic.edu.co", 7000000, true);
        
        
        //Inicializamos la colección de clientes
        instEmpresa.clientes = new Cliente[2];
        
        System.out.println("Ingresa la siguiente información:");
        for (int i = 0; i < instEmpresa.clientes.length; i++) {
            
            //Por cada cliente se debe solicitar el nombre y correo electrónico
            System.out.println("    Nombre: ");
            nombreCliente = entradaDatos.nextLine();
            System.out.println("    Email: ");
            correoCliente = entradaDatos.nextLine();
            
            //Añadimos los valores a la instancia Cliente 
            Cliente insCliente = new Cliente(nombreCliente, correoCliente);
            System.out.println(insCliente.toString());
        }
        Empresa insEmpresa2 = new Empresa("Misión tic", "9999999-0", instEmpresa.clientes);
        System.out.println(insEmpresa2.toString());
        System.out.println(jefe.toString());
    }
    
}
