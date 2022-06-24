package Principal;
//1. Llamamos todas las clases contenidas en el paquete Herencia

import Herencia.*;

public class Main {

    public static void main(String[] args) {
        /*
        =================================================================================
        ==================================Employee: Manager====================================
        =================================================================================
        */
        
        String[] endowment1 = new String[]{"Guantes", "Casco"};
        String[] endowment2 = new String[]{"Portatil", "Guaya"};

        Manager instanceManager1 = new Manager(3400000, true, endowment2, "Tulio", "Mejía");
        Employee instanceManager2 = new Manager(1200000, true, endowment1, "Ernesto", "Díaz");
        
        System.out.println("ArrayPersonas:\n    [\n" + instanceManager1.toString()
                + ",\n" + instanceManager2.toString() + "\n    ]");
        
        /*
        =================================================================================
        ==================================Client====================================
        =================================================================================
        */
        
        Client instanceClient1 = new Client(false, "Ivan", "Marquez", "C.C.", "75230230", "ivan@gmail.com", "Manizales");
        System.out.println(instanceClient1.toString());
    }
}
