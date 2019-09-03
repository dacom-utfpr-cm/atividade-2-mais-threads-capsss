/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author a834173
 */
public class CalculaPrimo  implements Runnable{
    private int inicio;
    private int fim;
    
    public CalculaPrimo(int inicio, int fim){
        this.inicio = inicio;
        this.fim = fim;
    }
    
    @Override
    public void run() {
        for(int valorAtual=this.inicio; valorAtual<this.fim; valorAtual++){
            boolean primo = true;
            for(int i=2; i<valorAtual; i++){
                if((valorAtual % i) == 0){
                    primo = false;
                }
            }
            if(primo == true){
                System.out.println("thread id: " + Thread.currentThread().getId() + " numero primo: " + valorAtual);
            }
        }
        System.out.println("acabou a thread id: " + Thread.currentThread().getId());
    }
}
