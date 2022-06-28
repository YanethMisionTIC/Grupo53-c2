package RelacionClasesAgregacion;

public class Pato {
    //1. Atributos: contador, nombre
    protected int idPato;
    protected String nombre;
    protected static int contadorPatos;

    //2. Inserción del constructor de la clase
    public Pato(String nombre) {
        this.nombre = nombre;
        this.idPato = ++Pato.contadorPatos;
    }
}
