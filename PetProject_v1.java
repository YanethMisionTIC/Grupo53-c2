/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petproject_g53_v1;

/**
 *
 * @author YanethM
 */
public class PetProject_G53_V1 {

    //Declaración de atributos
    private static String petName = "Homero";
    private static int age = 1;
    private static String healthStatus = "OK";
    private static int bornYear = 2021;
    private static String breed = "Persa";
    private static boolean pedigree = true;    
    private static char petSex = 'M';

    public static String getPetName() {
        return petName;
    }

    public static int getAge() {
        return age;
    }

    public static String getHealthStatus() {
        return healthStatus;
    }

    public static int getBornYear() {
        return bornYear;
    }
    
    public static String getBreed() {
        return breed;
    }

    public static boolean isPedigree() {
        return pedigree;
    }

    public static char getPetSex() {
        return petSex;
    }

    //Creaci�n del m�todo que muestra los valores de los atributos
    public static void ShowPetInformation() {
        //Atajo: sout + TAB
        System.out.println(getPetName() + " es un " + getBreed() + " que tiene " + getAge() + " a�os, nacio en el " + getBornYear() + " y se encuentra " + getHealthStatus() + " de salud.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ShowPetInformation();
    }
}
