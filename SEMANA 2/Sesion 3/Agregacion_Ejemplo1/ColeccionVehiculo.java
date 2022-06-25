package Agregacion_Ejemplo1;


public class ColeccionVehiculo {
    //1. Declaración de los atributos de la clase
    public int idVehiculo;
    public String marca;
    public String placa;
    public int modelo;
    public static int contadorVehiculos;

    public ColeccionVehiculo(String marca, String placa, int modelo) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.idVehiculo = ++ColeccionVehiculo.contadorVehiculos;
    }
    
    
}
