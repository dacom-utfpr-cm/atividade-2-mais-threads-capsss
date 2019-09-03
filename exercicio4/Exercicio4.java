/*
 Faça um programa em Java que realize uma busca paralela em um vetor de inteiros.
 Informe para o método: valor procurado, vetor de inteiros e o número de threads.
 */
package exercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a834173
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Integer numero_t = 3;
        Integer alvo = 2;
        List<Integer> vetor = new ArrayList<>();
        
        for(int i=0; i<20; i++){
            vetor.add(i);
        }
        
        ParametrosParaBuscaParalela busca = new ParametrosParaBuscaParalela(vetor, alvo, numero_t);
    }
    
}