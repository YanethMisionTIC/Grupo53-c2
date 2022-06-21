/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g53;

import java.util.Scanner;

/**
 *
 * @author YanethM
 */
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
        //1. Creamos la instancia de la librería Scanner
        Scanner scannerInstance = new Scanner(System.in);
        //2. Variables de opciones del menu
        boolean exitMenu = false;
        int menuOption = 0;

        //3. Creamos las instancias de las demás clases del paquete
        Exercise1 exercise1Instance = new Exercise1();
        Exercise2 exercise2Instance = new Exercise2();
        Exercise3 exercise3Instance = new Exercise3();
        Exercise4 exercise4Instance = new Exercise4();
        Exercise5 exercise5Instance = new Exercise5();

        //3. Ciclo while del menu
        // exitMenu = false
        // !exitMenu = true
        while (!exitMenu) {
            System.out.println(ANSI_BLUE + "            SELECCIONA UNA OPCIÓN DEL MENU" +ANSI_RESET);
            System.out.println("1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Ejercicio 5\n6. Ejercicio 6\n7. Ejercicio 7\n8. Salir\n"+ ANSI_RED + ">>>"+ANSI_RESET);
            menuOption = scannerInstance.nextInt();

            switch (menuOption) {
                case 1:
                    exercise1Instance.RequestDataUser();
                    break;
                case 2:
                    exercise2Instance.NumberOddEven();
                    break;
                case 3:
                    exercise3Instance.NegativeNumberOddEven();
                    break;
                case 4:
                    exercise4Instance.NegativeNumberOdd();
                    break;
                case 5:
                    exercise5Instance.ValidateWifiPassword();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    //Cuando la variable exitMenu toma este valor, deja de ingresar al while
                    exitMenu = true;
                    break;
                default:
                    System.out.println("Sólo se admiten opciones entre 1 y 8");
            }
        }
    }
}
