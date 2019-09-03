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
        
        System.out.println("preparando as threads...");
        System.out.println("threads executando: " + grupo.activeCount());
        
        t1.start();
        t2.start();
        t3.start();
        
        try{
            Thread.sleep(1000);
            System.out.println("threads inicializadas");
            System.out.println("threads executando: " + grupo.activeCount());
        

            Thread.sleep(10000);
            System.out.println("threads finalizadas");
            System.out.println("threads executando: " + grupo.activeCount());
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercicio1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
