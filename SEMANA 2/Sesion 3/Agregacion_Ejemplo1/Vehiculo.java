package Agregacion_Ejemplo1;

public class Vehiculo {

    //1. Declaración de los atributos de la clase
    public int idVehiculo;
    public String marca;
    public String placa;
    public int modelo;
    public static int contadorVehiculos;

    /*
        2. Inserción del constructor de la clase con todos los args
    excepto el idVehiculo
     */
    public Vehiculo(String marca, String placa, int modelo) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        //3. Inicialización del atributo idVehiculo
        this.idVehiculo = ++Vehiculo.contadorVehiculos;
    }
    
    //3. Inserción del constructor vacío
    public Vehiculo() {
    }
    
}
