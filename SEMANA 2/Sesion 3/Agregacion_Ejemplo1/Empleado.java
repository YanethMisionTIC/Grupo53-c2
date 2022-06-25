package Agregacion_Ejemplo1;

public class Empleado {

    private String nombreEmp;
    //1. Se genera la relación de agregación con vehiculo
    private Vehiculo vehiculos;
    //2. Se genera la relación de agregación con bicicleta
    private Bicicleta bicicletas;
    //3. Se genera la relación de agregación con coleccionVehiculo
    public ColeccionVehiculo[] coleccionVehiculos;

    //4. Insertar el constructor con todos los args
    public Empleado(String nombreEmp, Vehiculo vehiculos, Bicicleta bicicletas) {
        this.nombreEmp = nombreEmp;
        this.vehiculos = vehiculos;
        this.bicicletas = bicicletas;
    }

    //5. Añadimos un nuevo constructor con los args: coleccionVehiculos, bici
    public Empleado(String nombreEmp, Bicicleta bicicletas, ColeccionVehiculo[] coleccionVehiculos) {
        this.nombreEmp = nombreEmp;
        this.bicicletas = bicicletas;
        this.coleccionVehiculos = coleccionVehiculos;
    }

    public Empleado() {
    }

    public String toString1() {
        //Validamos si bicicleta.marca es null
        String tieneBicicleta = "";
        if (bicicletas.marca == null) {
            tieneBicicleta = "No tiene bici";
        } else {
            tieneBicicleta = bicicletas.marca;
        }

        if (vehiculos.placa == null && vehiculos.marca == null && vehiculos.modelo == 0) {
            return "{" + "\n      Empleado: " + nombreEmp
                    + ",\n      >>>>No tiene vehiculo<<<< "
                    + ",\n      Bicleta: " + tieneBicicleta + "\n}";
        } else {
            return "{" + "\n      Empleado: " + nombreEmp
                    + ",\n      Placa: " + vehiculos.placa
                    + ",\n      Marca: " + vehiculos.marca
                    + ",\n      Modelo: " + vehiculos.modelo
                    + ",\n      Bicleta: " + tieneBicicleta + "\n}";
        }
    }

    @Override
    public String toString() {
        //Validamos si bicicleta.marca es null
        String tieneBicicleta = "";
        if (bicicletas.marca == null) {
            tieneBicicleta = "No tiene bici";
        } else {
            tieneBicicleta = bicicletas.marca;
        }

        //el .length devuelve la cantidad de elementos que tiene un array
        for (int i = 0; i < coleccionVehiculos.length; i++) {
            //En cada iteración que recorremos la coleccionVehiculos
            //mostramos por cada posicion la marca, el modelo y la placa
            System.out.println("{" + ",\n      Placa: " + coleccionVehiculos[i].placa
                    + ",\n      Marca: " + coleccionVehiculos[i].marca
                    + ",\n      Modelo: " + coleccionVehiculos[i].modelo + "\n}");
        }
        return "{" + "\n      Empleado: " + nombreEmp
                + ",\n      Bicleta: " + tieneBicicleta + "\n}";
    }

}
