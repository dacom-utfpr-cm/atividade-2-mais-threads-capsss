/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a834173
 */
public class PrintThread  implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread id " + Thread.currentThread().getId() + " incializada");
        try {
            Thread.sleep(8000);
            System.out.println("Thread id " + Thread.currentThread().getId() + " finalizada");
        } catch (InterruptedException ex) {
            Logger.getLogger(PrintThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
