package RelacionClasesComposicion;

public class Panal {
    private String ubicacion;
    public Abejas[] enjambre;

    public Panal(String ubicacion) {
        this.ubicacion = ubicacion;
        //Inicializamos la colección de abejas dentro del constructor de la 
        //clase Panal, de tal forma que si no existe una instancia Panal
        //no hay forma de que existan las abejas
        this.enjambre = new Abejas[2];
        this.enjambre[0] = new Abejas("Barry");
        this.enjambre[1] = new Abejas("Adam");
    }

    
    @Override
    public String toString() {
        for (int i = 0; i < this.enjambre.length; i++) {
            System.out.println("N°: " + this.enjambre[i].idAbeja 
                    + " abeja: " + this.enjambre[i].nombre);
        }
        return "Panal{" + "ubicacion: " + this.ubicacion + '}';
    }
    
    
    //Ejemplo de sobrecarga en clases relacionadas por composición
    public String mostrarInfoPanal(){
        return "Sin información";
    }
 
    public String mostrarInfoPanal(String ubicacion){
        return ubicacion;
    }
    
    public char mostrarInfoPanal(char ubicacion){
        return ubicacion;
    }
    
    public String mostrarInfoPanal(String ubicacion, int cantAbejas){
        return ubicacion + " " + cantAbejas;
    }
}
