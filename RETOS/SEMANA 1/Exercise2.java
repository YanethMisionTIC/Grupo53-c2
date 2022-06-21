/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g53;
import java.util.Scanner;
/**
 * Crear un programa donde el usuario ingresa un número y el sistema 
 * valida si es número es par o impar.
 * @author YanethM
 */
public class Exercise2 {
    //1. Creamos la instancia de la librería Scanner
    Scanner scannerInstance = new Scanner(System.in);
    //2. Variables necesarias para esta clase
    private int number = 0;
    
    //3. Crear el método que valida si es par o impar
    public void NumberOddEven(){
        System.out.println("        INGRESA UN NÚMERO EL SISTEMA VALIDARA SI ES PAR");
        System.out.println("            Número:");
        number = scannerInstance.nextInt();
        
        //4. Validamos si par o impar
        if(number % 2 == 0){
            System.out.println("El número " + number + " es par.");
        }else{
            System.out.println("El número " + number + " es impar.");
        }
    }
}
