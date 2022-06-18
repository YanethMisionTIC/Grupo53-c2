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
public class PetClass {
    
    //DeclaraciÃ³n de atributos
    private String petName;
    private int age;
    private String healthStatus;
    private int bornYear;
    private String breed;
    private boolean pedigree;    
    private char petSex;

    //Los siguientes parametros, llegan desde el ,ètodo ejecutor de la clase Main
    public PetClass(String _petName, int _age, String _healthStatus, int _bornYear, String _breed, boolean _pedigree, char _petSex) {
        this.petName = _petName;
        this.age = _age;
        this.healthStatus = _healthStatus;
        this.bornYear = _bornYear;
        this.breed = _breed;
        this.pedigree = _pedigree;
        this.petSex = _petSex;
    }

    public String getPetName() {
        return petName;
    }

    public int getAge() {
        return age;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public int getBornYear() {
        return bornYear;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public char getPetSex() {
        return petSex;
    }

  

    //Creación del método que muestra los valores de los atributos
    public void ShowPetInformation() {
        //Atajo: sout + TAB
        System.out.println(getPetName() + " es un " + getBreed() + " que tiene " + getAge() + " años, nacio en el " + getBornYear() + " y se encuentra " + getHealthStatus() + " de salud.");
    }

}
