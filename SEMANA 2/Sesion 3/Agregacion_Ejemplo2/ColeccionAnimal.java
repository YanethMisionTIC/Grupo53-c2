package Agregacion_Ejemplo2;


public class ColeccionAnimal {
    public int idAnimal;
    public String tipoAnimal;
    public String nombre;
    public static int contadorAnimales;

    public ColeccionAnimal(String tipoAnimal, String nombre) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.idAnimal= ++ColeccionAnimal.contadorAnimales;
    }
}
