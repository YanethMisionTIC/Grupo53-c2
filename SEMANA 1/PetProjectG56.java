/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petproject.g56;

/**
 *
 * @author YanethM
 */
public class PetProjectG56 {

    public static void main(String[] args) {
        PetClass instancia_perro = new PetClass("Dante", 'M', 3, "todo esta bien", "coocker spaniel", false, "cafe", "tamaño mediano");
        PetClass instancia_gato = new PetClass("Homera", 'H', 1, "todo esta bien", "persa", true, "gris con blanco", "tamaño pequeño");
        System.out.println(instancia_perro.showPetInformationFunction());
        instancia_gato.showPetInformation();
    }
}
