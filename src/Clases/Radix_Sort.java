/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author HiYeaismin 8a
 */
public class Radix_Sort {
    
    private Shell_Sort mostrar= new Shell_Sort();
    
    
    
    public String radix(int []arreglo){
            
        int iteracion,iteracionDos,j;
        //For para ordenar por unidades Decenas y Centenas.
        for(iteracionDos=Integer.SIZE-1; 0<iteracionDos; iteracionDos--){
            //Declarar otro Arreglo para que se vayan ordenando los valores.
            int acomodarArreglo[]= new int [arreglo.length];
           j=0;
           //For para ir avanzando en el valor individual del arreglo
            for(iteracion=0;iteracion<arreglo.length; iteracion++){
                //comprobar que haya un intercamio cuando:
                //si se es mayor, entonces pertenece a otro espacio.
                boolean intercambiar= arreglo[iteracion] <<iteracionDos>=0;
                
                
                // No Hacer intercambios internos en la posicion de Unidades Decenas o centenas
                if(iteracionDos==0 ? !intercambiar:intercambiar){
                    acomodarArreglo[j]= arreglo[iteracion];
                    j++;
                }
                else{
                    //Si hacer el intercambio en caso de que en la posición de unidades Decenas o centenas sea>
                    arreglo[iteracion-j]=arreglo[iteracion];
                    
                }
            }
            
            //Se
            for(iteracion=j; iteracion<acomodarArreglo.length; iteracion++){
                acomodarArreglo[iteracion] = arreglo[iteracion-j];
            
            }
            //Ponerle el valor del arreglo ya ordenado al Arreglo original.
            arreglo= acomodarArreglo;
        }
        
        return mostrar.mostrar(arreglo);
    }
    
}
