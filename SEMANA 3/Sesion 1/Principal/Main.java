package Principal;

import Sobreescritura.*;
import Sobrecarga.*;
import Polimorfismo.*;
import RelacionClasesAgregacion.*;
import RelacionClasesComposicion.*;
import ClasesAbstractas.*;

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
        /*
        ********************Sobreescritura********************
         */
        System.out.println(ANSI_BLUE + "        >>> EJEMPLO 1: SOBREESCRITURA <<<" + ANSI_RESET);
        //1. Instanciamos la clase padre
        Empleado emp = new Empleado("Juan", 3400000);
        System.out.println(emp.obtenerDetallesFunction());

        //2. Instanciamos la clase hijo Gerente
        Gerente ger = new Gerente("Jacinto", 5000000, "Sistemas", 7);
        System.out.println(ger.obtenerDetallesFunction());
        System.out.println(ger.calcularSalarioMes());

        //3. Instanciamos la clase hijo Operario
        Operario oper = new Operario("Jairo", 2400000, true);
        System.out.println(oper.obtenerDetallesFunction() + " pago total: " + oper.calcularSalarioMes());

        /*
        ********************Sobrecarga********************
         */
        //Cuando creamos una instancia con el constructor vacío,no se pasa
        //ningun argumento a la clase EmpleadoSobrecarga
        EmpleadoSobrecarga emp1 = new EmpleadoSobrecarga();
        System.out.println(ANSI_BLUE + "\n        >>> EJEMPLO 2: SOBRECARGA <<<" + ANSI_RESET);
        System.out.println(emp1.toString());
        
        EmpleadoSobrecarga emp2 = new EmpleadoSobrecarga("Martha");
        System.out.println(emp2.toString());

        EmpleadoSobrecarga emp3 = new EmpleadoSobrecarga("Diego", 6300000);
        System.out.println(emp3.toString());
        
        EmpleadoSobrecarga emp4 = new EmpleadoSobrecarga("Francisco", 4200000, 0.2, "R.R.H.H.");
        System.out.println(emp4.toString());
        
        
         /*
        ********************Abstracción entre clases********************
        */
        System.out.println(ANSI_BLUE + "\n        >>> EJEMPLO 3: ABSTRACCIÓN ENTRE CLASES <<<" + ANSI_RESET);
        Circulo circulo = new Circulo("Circulo");
        Rectangulo rectangulo = new Rectangulo("Rectangulo");
        /*
        ********************Polimorfismo********************
        */
        System.out.println(ANSI_BLUE + "\n        >>> EJEMPLO 4: POLIMORFISMO <<<" + ANSI_RESET);
        EmpleadoP emp5 = new EmpleadoP("Adiela", 2400000);
        imprimir(emp5);
        
        emp5 = new GerenteP("Jacinto", 3400000, "Contabilidad", 5);
        imprimir(emp5);
        
        emp5 = new OperarioO(true, "Esneyder", 2400000);
        imprimir(emp5);
        
        /*
        ********************Relación por agregación entre clases********************
        */
        System.out.println(ANSI_BLUE + "\n        >>> EJEMPLO 5: RELACIÓN POR AGREGACIÓN ENTRE CLASES <<<" + ANSI_RESET);
        //1. llamamos el constructor vacío de la clase lago
        //Con esta instancia crearemos la colección patos
        Lago lago= new Lago();
        
        //2. Asignamos cantidad de patos que contendra la colección
        lago.patos = new Pato[3];
        
        //3. Creamos las 3 instancias Pato
        Pato pato1 = new Pato("Donald");
        Pato pato2 = new Pato("Hugo");
        Pato pato3 = new Pato("Luis");
        
        //4. Asignamos a cada posición de la colección una instancia Pato
        lago.patos[0] = pato1;
        lago.patos[1] = pato2;
        lago.patos[2] = pato3;
        
        //5. Creamos la instancia de la clase Lago que recibe todos los args
        Lago lago1 = new Lago("Laguna negra", "Inframundo", lago.patos);
        
        //6. Llamamos la función toString de la clase Lago
        System.out.println(lago1.toString());
        
        /*
        ********************Relación por composición entre clases********************
        */
        System.out.println(ANSI_BLUE + "\n        >>> EJEMPLO 6: RELACIÓN POR COMPOSICIÓN ENTRE CLASES <<<" + ANSI_RESET);
        Panal panal = new Panal("Patio de la casa");
        System.out.println(panal.toString());
        
      
    }
    
    /*
    Para aplicar el polimorfismo:
    1. Generamos en la clase otro método que nos permita imprimir el return
    de la función obtenerDetalles de la clase padre (Empleado) y sus clases
    hijas
    */
    public static void imprimir(EmpleadoP empleado){
        String llamarFuncion = empleado.obtenerDetallesFunction();
        System.out.println("Empleado: " + llamarFuncion);
        double llamarFuncionSalario = empleado.calcularSalarioMes();
        System.out.println("Salario con bono " + llamarFuncionSalario);
    }
    

}
