/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g53;

/**
 *
 * @author YanethM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Creamos las instancias de las demás clases del paquete
        Exercise1 exercise1Instance = new Exercise1();
        Exercise2 exercise2Instance = new Exercise2();
        Exercise3 exercise3Instance = new Exercise3();
        Exercise4 exercise4Instance = new Exercise4();
        //2. Mediante la instancia lo creamos
        exercise1Instance.RequestDataUser();
        exercise2Instance.NumberOddEven();
        exercise3Instance.NegativeNumberOddEven();
        exercise4Instance.NegativeNumberOdd();
    }
}
