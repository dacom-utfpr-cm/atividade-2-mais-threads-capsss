/*
Faça um programa em Java para testar um conjunto de operações sobre um grupo de threads. Use o ThreadGroup.
 */
package exercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a834173
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadGroup grupo = new ThreadGroup("grupo");

        Thread t1 = new Thread(grupo, new PrintThread());
        Thread t2 = new Thread(grupo, new PrintThread());
        Thread t3 = new Thread(grupo, new PrintThread());

        System.out.println("threads executando: " + grupo.activeCount());
        System.out.println("preparando as threads...");

        t1.start();
        t2.start();
        t3.start();

        try{
            Thread.sleep(2000);
            System.out.println("threads executando: " + grupo.activeCount());
            
            Thread.sleep(1000);
            System.out.println("prioridade do grupo: " + grupo.getMaxPriority());
            
            Thread.sleep(1000);
            System.out.println("o grupo e daemon? " + grupo.isDaemon());
            
            Thread.sleep(1000);
            System.out.println("setando a prioridade do grupo para 5");
            grupo.setMaxPriority(5);
            System.out.println("prioridade do grupo: " + grupo.getMaxPriority());

            Thread.sleep(5000);
            System.out.println("threads executando: " + grupo.activeCount());
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
