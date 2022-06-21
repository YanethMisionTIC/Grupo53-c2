/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g53;

import java.util.Scanner;

/**
 *
 * El programa debe identificar si es hombre o mujer mayor de edad.
 *
 */
public class Exercise1 {

    //1. Instancia (para llamar los métodos o funciones de una clase o librería) de la librería Scanner
    Scanner scannerInstance = new Scanner(System.in);

    //2. Variables globales de la clase
    private String userName = "";
    private int age = 0;
    private char gender;

    //3. Creamos el método que solicita los datos al usuario
    public void RequestDataUser() {
        System.out.println("        INGRESA LA SIGUIENTE INFORMACIÓN");
        System.out.println("            Nombre");
        userName = scannerInstance.nextLine();

        System.out.println("            Edad");
        age = scannerInstance.nextInt();

        System.out.println("            Género:\n               1. F(Femenino)\n               2. M(Masculino)\n               3. O(Otro)");
        gender = scannerInstance.next().charAt(0);

        //4. Validar si es mujer u hombre mayor de edad
        // || es or dentro de un condicional
        // && es and dentro de un condicional 
        // == es comparar valor dentro de un condicional
        if (age >= 18) {
            if (gender == 'f' || gender == 'F') {
                System.out.println("Es género femenino mayor de edad.");
            } else if (gender == 'm' || gender == 'M') {
                System.out.println("Es género masculino mayor de edad.");
            } else if (gender == 'o' || gender == 'O') {
                System.out.println("Es otro tipo de género mayor de edad.");
            } else {
                System.out.println("Opción ingresada, es inválida.");
            }
        } else {
            if (gender == 'f' || gender == 'F') {
                System.out.println("Es género femenino mayor de edad.");
            } else if (gender == 'm' || gender == 'M') {
                System.out.println("Es género masculino mayor de edad.");
            } else if (gender == 'o' || gender == 'O') {
                System.out.println("Es otro tipo de género menor de edad.");
            } else {
                System.out.println("Opción ingresada, es inválida.");
            }
        }

    }
}
