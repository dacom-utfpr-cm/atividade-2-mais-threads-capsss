/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.List;

/**
 *
 * @author a834173
 */
public class BuscaParalela implements Runnable{

    public List<Integer> vetor;
    public Integer alvo;
    public Integer inicio;
    public Integer fim;
    
    BuscaParalela(List<Integer> vetor, Integer alvo, Integer inicio, Integer fim){
        this.vetor = vetor;
        this.alvo = alvo;
        this.inicio = inicio;
        this.fim = fim;
    }
    
    @Override
    public void run() {
        for(int i=this.inicio; i<this.fim; i++){
            if(this.vetor.get(i) == this.alvo){
                System.out.println("Encontrado: " + this.vetor.get(i) + " Thread ID: " + Thread.currentThread().getId());
            }
        }
        System.out.println("Thread ID: " + Thread.currentThread().getId() + " finalizada");
    }
    
}
