/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author GX505DT
 */
public class Quicksort {
    String cad = "";
    
    public String ordenarQuicksort(int arreglo[]){
        cad="";
        arreglo = quicksort1(arreglo);
        for(int i=0; i<arreglo.length; i++){
            cad = cad+arreglo[i]+", ";
        }
        return cad;
    }
    public int[] quicksort1(int numeros[]){
        return quicksort2(numeros, 0, numeros.length-1);
    }
    public int[] quicksort2(int numeros[], int izq, int der){
        if(izq>=der){
            return numeros;
        }
        int i=izq, d=der;
        if(izq!=der){
            int pivote, aux;
            pivote = izq;
            while(izq!=der){
                while(numeros[der]>=numeros[pivote] && izq<der)
                    der--;
                    while(numeros[izq]<numeros[pivote] && izq<der)
                        izq++;
                if(der!=izq){
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq]=aux;
                }
            }
            if(izq==der){
                quicksort2(numeros, i, izq-1);
                quicksort2(numeros, izq+1, d);
            }
        }
        else{
            return numeros;
        }
        return numeros;
    }
}
