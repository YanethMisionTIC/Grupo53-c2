/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petproject_v2;

/**
 *
 * @author YanethM
 */
public class PetProject_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Creamos la instancia de la clase
        PetClass instancia_gato = new PetClass("Homero", 1, "ok", 2021, "Persa", true, 'M');
        PetClass instancia_perro = new PetClass("Dante", 3, "ok", 2019, "Cocker Spaniel", true, 'M');
        PetClass instancia_gato2 = new PetClass("Michu", 1, "ok", 2017, "Criollo", false, 'M');
        //2. Mediante la instancia llamamos los métodos de la clase
        instancia_gato.ShowPetInformation();
        instancia_perro.ShowPetInformation();
        instancia_gato2.ShowPetInformation();
    }
}
