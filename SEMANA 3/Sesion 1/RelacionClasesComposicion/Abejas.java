package RelacionClasesComposicion;

public class Abejas {
    //1. Atributos: contador, nombre
    protected int idAbeja;
    protected String nombre;
    protected static int contadorAbejas;

    public Abejas(String nombre) {
        this.nombre = nombre;
        this.idAbeja = ++Abejas.contadorAbejas;
    }
}
