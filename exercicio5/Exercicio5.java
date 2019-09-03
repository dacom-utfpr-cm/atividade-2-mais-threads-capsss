/*
 Faça um programa multithreaded em Java que ordene um vetor usando o Merge Sort recursivo.
 Faça com que a thread principal dispare duas threads para classificar cada metade do vetor.
 */

//implementação do merge sort: https://www.geeksforgeeks.org/merge-sort/
package exercicio5;

/**
 *
 * @author a834173
 */

public class Exercicio5 { 
/* A utility function to print array of size n */
    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {3,2,1,6,5,4}; 

        System.out.println("Given Array"); 
        printArray(arr); 

        Thread t1 = new Thread(new MergeSort(arr, 0, (arr.length/2 +1)));
        t1.start();
        
        Thread t2 = new Thread(new MergeSort(arr, (arr.length/2), arr.length-1));
        t2.start();
        
        t1.yield();
        t2.yield();

        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 

}
/* This code is contributed by Rajat Mishra */
