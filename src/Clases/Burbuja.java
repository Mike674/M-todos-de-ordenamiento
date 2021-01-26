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
public class Burbuja {
    String cad = ""; int aux;
    
    public String burbuja(int arreglo[]){
        cad="";
        for(int i=0; i<(arreglo.length-1);i++){
            for(int k=0; k<(arreglo.length-1); k++){
                if(arreglo[k]>arreglo[k+1]){
                    aux = arreglo[k];
                    arreglo[k] = arreglo[k+1];
                    arreglo[k+1] = aux;
                }
            }
        }
        for(int i=0; i<arreglo.length; i++){
            cad = cad+arreglo[i]+", ";
        }
        return cad;
    }
}
