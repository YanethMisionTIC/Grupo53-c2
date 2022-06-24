package Principal;
//1. Llamamos todas las clases contenidas en el paquete Herencia

import Herencia.*;

public class Main {

    public static void main(String[] args) {
        /*
        =================================================================================
        ==================================Employee====================================
        =================================================================================
        */
        
        String[] endowment1 = new String[]{"Guantes", "Casco"};
        String[] endowment2 = new String[]{"Portatil", "Guaya"};

        Employee instanceEmployee1 = new Employee(3400000, true, endowment2, "Tulio", "Mejía");
        Employee instanceEmployee2 = new Employee(1200000, true, endowment1, "Ernesto", "Díaz");
        Employee instanceEmployee3 = new Employee(7600000, true, endowment2, "Lola", "Mento");

        System.out.println("ArrayPersonas:\n    [\n" + instanceEmployee1.toString()
                + ",\n" + instanceEmployee2.toString() + ",\n"
                + instanceEmployee3.toString() + "\n    ]");
    }
}
