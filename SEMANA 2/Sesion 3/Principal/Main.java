package Principal;

import Agregacion_Ejemplo1.*;

public class Main {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        /*1. 
        Creamos las instancia de la clase vehiculo y bicileta para el caso
        de que un empleado tiene un vehiculo y una bicicleta
         */
        System.out.println(ANSI_GREEN + "***** CASO I: Empleado TIENE vehiculo y bicicleta****"+ ANSI_RESET);
        System.out.println(ANSI_GREEN +"====================================================="+ ANSI_RESET);
        Vehiculo carro1 = new Vehiculo("Ford", "UET999", 2021);
        Bicicleta bici1 = new Bicicleta("Specialized");
        Empleado emp1 = new Empleado("Jacinto", carro1, bici1);
        System.out.println(emp1.toString1());
        
        System.out.println(ANSI_GREEN + "*** CASO II: TIENE vehiculo pero NO TIENE bicicleta***"+ ANSI_RESET);
        System.out.println(ANSI_GREEN +"====================================================="+ ANSI_RESET);
        Vehiculo carro2 = new Vehiculo("Mazda", "EPN343", 2021);
        Bicicleta bici2 = new Bicicleta();
        Empleado emp2 = new Empleado("Raúl", carro2, bici2);
        System.out.println(emp2.toString1());
                
        
        System.out.println(ANSI_GREEN + "*** CASO III: NO TIENE vehiculo pero TIENE bicicleta***"+ ANSI_RESET);
        System.out.println(ANSI_GREEN +"====================================================="+ ANSI_RESET);
        Vehiculo carro3 = new Vehiculo();
        Bicicleta bici3= new Bicicleta("Cannondale");
        Empleado emp3 = new Empleado("Messi", carro3, bici3);
        System.out.println(emp3.toString1());
        
        System.out.println(ANSI_GREEN + "*** CASO IV: NO TIENE vehiculo NI bicicleta***"+ ANSI_RESET);
        System.out.println(ANSI_GREEN +"====================================================="+ ANSI_RESET);
        Vehiculo carro4 = new Vehiculo();
        Bicicleta bici4= new Bicicleta();
        Empleado emp4 = new Empleado("Angela", carro4, bici4);
        System.out.println(emp4.toString1());
        
        System.out.println(ANSI_GREEN + "*** CASO V: TIENE más de un vehiculo ***"+ ANSI_RESET);
        System.out.println(ANSI_GREEN +"====================================================="+ ANSI_RESET);
        //Se desconoce el tamaño del arreglo []{}
        //ColeccionVehiculo [] carros = new ColeccionVehiculo[]{};
        //Se conoce el tamaño del arreglo y se envia entre los corchetes [2]
        
        Empleado empleadoNull = new Empleado();
        empleadoNull.coleccionVehiculos = new ColeccionVehiculo[2];
        empleadoNull.coleccionVehiculos[0] = new ColeccionVehiculo("Chevrolet", "UET111", 2019);
        empleadoNull.coleccionVehiculos[1] = new ColeccionVehiculo("Ford", "WTF666", 2020);
       
        Bicicleta bici5= new Bicicleta();
        Empleado emp5 = new Empleado("Francisco",bici5, empleadoNull.coleccionVehiculos);
        System.out.println(emp5.toString());
    }

}
