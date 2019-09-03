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
public class ParametrosParaBuscaParalela {

    public ParametrosParaBuscaParalela(List<Integer> vetor, Integer alvo, Integer numero_t){
        Integer intervalo = vetor.size() / numero_t;
        //Integer inicio = 0;
        //Integer fim = 10;
        boolean intervalo_quebrado = false;
        
        if((intervalo * numero_t) != vetor.size()){
            intervalo_quebrado = true;
        }
        
        for (int i=0; i<numero_t; i++){
            Integer inicio = intervalo * i;
            Integer fim = intervalo * (i +1);
            if((intervalo_quebrado == true) && (i==(numero_t -1))){
                Thread t = new Thread(new BuscaParalela(vetor, alvo, inicio, vetor.size()));
                t.start();
            } else {
                Thread t = new Thread(new BuscaParalela(vetor, alvo, inicio, fim));
                t.start();
            }
        }
    }
    
    
    
}
