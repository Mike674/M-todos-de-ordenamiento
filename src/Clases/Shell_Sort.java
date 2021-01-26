/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Vistas.Metodos_de_Ordenamiento;

/**
 *
 * @author HiYeaismin 8a
 */
public class Shell_Sort {

    public  String shell(int arreglo[]) {

        int distacia, aux, iteracion;
        boolean intercambios;
        
//dividir la variable que se asignará por el lado izquierdo y la almacena en el lado derecho.
//La cantidad del arreglo se divide entre dos y se queda con el número entero.
        for (distacia = arreglo.length / 2; distacia != 0; distacia /= 2) { 
        intercambios = true;
        
        // Mientras (siempre y cuando) se intercambien los elementos 
            while (intercambios) {                                                               
                intercambios = false;
                
                // se dan las pasadas
                for (iteracion = distacia; iteracion < arreglo.length; iteracion++) 
                {
                    // y si están desordenados
                    if (arreglo[iteracion - distacia] > arreglo[iteracion]) {       
                        // se reordenan
                        aux = arreglo[iteracion];                  
                        arreglo[iteracion] = arreglo[iteracion - distacia];
                        arreglo[iteracion - distacia] = aux;
                        // y se marca como cambio.   
                        intercambios = true;                                              
                    }
                }
                 
            }
            
           
        }
        return mostrar(arreglo);
        
    }
    
    
    public String mostrar(int[] numeros) {
        String cadena="";
        for (int iteracion = 0; iteracion < numeros.length; iteracion++) {
             cadena  += numeros[iteracion] + ",";
        }
        return cadena;
    }
    
    
   
}
