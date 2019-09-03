/*
 Faça um programa em Java com threads que exiba os números primos entre 0 e 100000.
 */
package exercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a834173
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new CalculaPrimo(2,50000));
        Thread t2 = new Thread(new CalculaPrimo(50000, 75000));
        Thread t3 = new Thread(new CalculaPrimo(75000, 87500));
        Thread t4 = new Thread(new CalculaPrimo(87500, 100000));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
    
}
