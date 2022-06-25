package Agregacion_Ejemplo1;

public class Bicicleta {
    public int idBicicleta;
    public String marca;
    public static int contadorBicicleta;

    public Bicicleta(String marca) {
        this.marca = marca;
        this.idBicicleta= ++Bicicleta.contadorBicicleta;
    }

    //3. Inserción del constructor vacío
    public Bicicleta() {
    }
}
