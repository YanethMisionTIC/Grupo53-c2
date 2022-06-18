/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petproject_g53;

/**
 *
 * @author YanethM
 */
public class PetProject_G53 {

    //DeclaraciÃ³n de atributos
    private static String petName = "Dante";
    private static int age = 3;
    private static String healthStatus = "OK";
    private static int bornYear = 2019;
    private static String breed = "Cocker Spaniel";
    private static boolean pedigree = false;    
    private static char petSex = 'M';

    //Creación del método que muestra los valores de los atributos
    public static void ShowPetInformation() {
        //Atajo: sout + TAB
        System.out.println(petName + " es un " + breed + " que tiene " + age + " aÃ±os, nacio en el " + bornYear + " y se encuentra " + healthStatus + " de salud.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShowPetInformation();
    }
}
