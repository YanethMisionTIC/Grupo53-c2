package RelacionClasesAgregacion;


public class Lago {
    //1. Declaramos los atributos de la clase
    private String nombreLago;
    private String ciudad;
    //2. Creamos la colección de tipo Pato llamada patos
    // Es una colección [] debido a que el lago contiene más de un pato
    public Pato [] patos;
    
    //3. Utilizamos sobrecarga para crear dos contructores de clase:
    //Uno vacío y otro que recibe todos los argumentos

    public Lago() {
    }

    public Lago(String nombreLago, String ciudad, Pato[] patos) {
        this.nombreLago = nombreLago;
        this.ciudad = ciudad;
        this.patos = patos;
    }
    
    //4. Generamos la función que retorna el contenido del objeto Lago

    @Override
    public String toString() {
        //5. Se recorre la colección de patos imprimiendo la información de
        //cada uno de ellos
        for (int i = 0; i < this.patos.length; i++) {
            System.out.println("Pato: " + this.patos[i].idPato + ", nombre: "
                    + this.patos[i].nombre);
        }
        return "Lago{" + "nombreLago=" + nombreLago 
                + ", ciudad=" + ciudad + '}';
    }
    
    
}
