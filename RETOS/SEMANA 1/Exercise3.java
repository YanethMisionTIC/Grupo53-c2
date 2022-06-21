/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g53;

import java.util.Scanner;

/**
 * Crear un programa donde el usuario ingresa un número y el sistema valida si
 * es número es par o impar. El número ingresado debe ser negativo.
 *
 * @author YanethM
 */
public class Exercise3 {
    //1. Creamos la instancia de la librería Scanner

    Scanner scannerInstance = new Scanner(System.in);
    //2. Variables necesarias para esta clase
    private int number = 0;

    //3. Crear el método que valida si es par o impar
    public void NegativeNumberOddEven() {
        System.out.println("        INGRESA UN NÚMERO EL SISTEMA VALIDARA SI ES NEGATIVO PAR O IMPAR");
        System.out.println("            Número negativo:");
        number = scannerInstance.nextInt();
        if(number < 0){
            if(number % 2 == 0){
                System.out.println("El número " + number + " es negativo par.");
            }else{
                System.out.println("El número " + number + " es negativo impar.");
            }
        }else{
            System.out.println("El número es positivo, no cumple la restricción.");
        }
    }
}
