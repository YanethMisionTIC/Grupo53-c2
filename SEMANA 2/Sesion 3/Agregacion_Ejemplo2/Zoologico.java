package Agregacion_Ejemplo2;

import static Principal.Main2.ANSI_PURPLE;
import static Principal.Main2.ANSI_RESET;
import java.util.Scanner;

public class Zoologico {

    private String nombreZoo;
    public ColeccionAnimal[] animales;
    Scanner infoUser = new Scanner(System.in);

    public Zoologico() {
    }

    public Zoologico(String nombreZoo, ColeccionAnimal[] animales) {
        this.nombreZoo = nombreZoo;
        this.animales = animales;
    }

    public void cantidadAnimales() {
        System.out.println(ANSI_PURPLE + "===================================================" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "==============>>> Hacienda Napoles <<<=============");
        System.out.println(ANSI_PURPLE + "===================================================" + ANSI_RESET);

        //Inicializamos la colección de animales de forma vacía
        this.animales = new ColeccionAnimal[]{};

        //Solicitamos al usuario la cantidad de animales que quiere crear
        System.out.println("Cúantos animales viste en tu recorrido?");
        int cantAnimales = infoUser.nextInt();
        infoUser.nextLine();

        //Por cada animal solicitamos la especie y el nombre
        for (int i = 1; i <= cantAnimales; i++) {
            System.out.println("        Especie: ");
            String especie = infoUser.nextLine();
            System.out.println("        Nombre: ");
            String nombre = infoUser.nextLine();
            //Los valores obtenidos debemos de pasarselos a la instancia de 
            //la clase ColeccionAnimal
            ColeccionAnimal animalNuevo = new ColeccionAnimal(especie, nombre);
            System.out.println("{\n" + "       Animal N°=" + animalNuevo.idAnimal
                    + ",       Especie: " + animalNuevo.tipoAnimal
                    + ",       Nombre: " + animalNuevo.nombre
                    + '}');
        }

    }
    
    public String cantidadAnimales(int cantAnimales){
        return "";
    }

    @Override
    public String toString() {
        return "Zoologico{" + "nombreZoo=" + nombreZoo + ", animales=" + animales + '}';
    }
}
