/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g53;
import java.util.Scanner;
/**
 * El sistema 
 * valida si es número es par negativo, de lo contrario vuelve a 
 * solicitarle el número hasta que cumpla dicha restricción.
 * @author YanethM
 */
public class Exercise4 {
     //1. Creamos la instancia de la librería Scanner

    Scanner scannerInstance = new Scanner(System.in);
    //2. Variables necesarias para esta clase
    private int number = 0;

    //3. Crear el método que valida si es par o impar
    public void NegativeNumberOdd() {
        System.out.println("        INGRESA UN NÚMERO EL SISTEMA VALIDARA SI ES NEGATIVO PAR");
        System.out.println("            Número negativo par:");
        number = scannerInstance.nextInt();
        
        //4. Iterador que termina el ciclo cuando no se cumple la condición
        
        while(number >= 0 || number % 2 != 0){
            System.out.println("Número no cumple las restricciones, ingresa otro valor: ");
            number = scannerInstance.nextInt();
        }
        System.out.println("El número " + number + " es negativo par.");
    }
}
