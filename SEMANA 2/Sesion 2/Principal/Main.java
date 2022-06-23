package Principal;
//1. Llamamos todas las clases contenidas en el paquete Herencia

import Herencia.*;

public class Main {

    public static void main(String[] args) {
        Person instancePerson1 = new Person("Marci", "Ana");
        Person instancePerson2 = new Person("Marco", "de la Puerta");
        Person instancePerson3 = new Person("Jorge", "Iván");
        /*
            En Java un arreglo es semejante a las listas en python []
                studentsList = ["Javier", "Jacinto", "Marci"]
                arrayDeObjectos = 
                    [
                        Person1 = {nombre: "Yaneth", apellido: "Mejía"},
                        Person2 = {nombre: "Luis", apellido: "Betancourt"}
                    ]
        
            En Java los objetos tienen la misma estructura que los diccionarios en python {}
                objeto = {clave: valor} 
                person = {nombre: "Yaneth"}
         */
        System.out.println("ArrayPersonas:\n    [\n" + instancePerson1.toString()
                + ",\n" + instancePerson2.toString() + ",\n" + instancePerson3.toString()
                + "\n    ]");
    }
}
