/*
 Faça um programa em Java que consulte periodicamente o estado de um conjunto de threads.
 */
package exercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a834173
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadGroup grupo = new ThreadGroup("grupo");
        
        Thread t1 = new Thread(grupo, new PrintThread());
        Thread t2 = new Thread(grupo, new PrintThread());
        Thread t3 = new Thread(grupo, new PrintThread());
        
        System.out.println("estado da thread " + t1.getId() + ": " + t1.getState());
        System.out.println("estado da thread " + t2.getId() + ": " + t1.getState());
        System.out.println("estado da thread " + t3.getId() + ": " + t1.getState());
        
        t1.start();
        t2.start();
        t3.start();
        
        try{
            System.out.println("estado da thread " + t1.getId() + ": " + t1.getState());
            System.out.println("estado da thread " + t2.getId() + ": " + t1.getState());
            System.out.println("estado da thread " + t3.getId() + ": " + t1.getState());
            Thread.sleep(1000);
            System.out.println("estado da thread " + t1.getId() + ": " + t1.getState());
            System.out.println("estado da thread " + t2.getId() + ": " + t1.getState());
            System.out.println("estado da thread " + t3.getId() + ": " + t1.getState());

        } catch (InterruptedException ex) {
            Logger.getLogger(Exercicio1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
