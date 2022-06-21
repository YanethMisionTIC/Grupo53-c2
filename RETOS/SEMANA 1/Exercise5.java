/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g53;

import java.util.Scanner;

/**
 * Crear un programa que solicita al usuario la contraseña de su wifi, la cual
 * es “ABC123”, sólo tendrá 3 intentos. Al 3 intento incorrecto, el sistema le
 * mostrará un mensaje indicando que ha sido bloqueado.
 *
 * @author YanethM
 */
public class Exercise5 {

    //1. Creamos la instancia de la librería Scanner
    Scanner scannerInstance = new Scanner(System.in);

    //2. Variables necesarias para esta clase
    private String wifiPassword = "";
    private int numberAttempts = 1;

    //3. Creamos el método que valida la clave del wifi y los intentos
    public void ValidateWifiPassword() {
        System.out.println("        INGRESA TU CONTRASEÑA DEL WIFI");
        System.out.println("            Password:");
        wifiPassword = scannerInstance.nextLine();

        while (numberAttempts < 3) {
            // if((wifiPassword.equals("ABC123")){} se valida si son iguales
            // if(!(wifiPassword.equals("ABC123")){} se valida si son diferentes
            if (!(wifiPassword.equals("ABC123"))) {
                System.out.println("Contraseña incorrecta intento número " + numberAttempts);
                System.out.println("            Password:");
                wifiPassword = scannerInstance.nextLine();
            }else{
                System.out.println("Contraseña correcta, conectado a tu red WIFI.");
            }
            numberAttempts += 1;
        }
    }

}
