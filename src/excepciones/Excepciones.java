/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import excepciones.MyException;
import excepciones.MyException;

/**
 *
 * @author Brenda
 */
public class Excepciones {
    private static int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
    private static int suma =0;
    private static int contadorEnteros=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("A continuacion se checará si exsiste alguna Excepcion");
        ChecarExcepciones();
        System.out.println("=============================");
        System.out.println("Suma ascendente");
        SumaAscendente();
        System.out.println("Suma descendente");
        sumaDescendente();
    }
    static public void ChecarExcepciones(){
        for(int i=0; i<arreglo.length; i++){
            try{
                if(contadorEnteros==5){
                    throw new MyException();
                }
            }catch(MyException ex){
                System.out.println(ex.ErrorPersonalizado());
            }
            if(arreglo[i] % 1==0){
                contadorEnteros++;
            }
            try{
                if(arreglo[i] >9 ){
                    throw new MyException();
                }
            }catch(MyException ex){
                System.out.println(ex.ErrorPersonalizado());
            }
            try{
                if(arreglo[i] <0 ){
                    throw new MyException();
                }
            }catch(MyException ex){
                System.out.println(ex.ErrorPersonalizado());
            }
            suma += arreglo[i];
        }
    }
    static public void SumaAscendente(){
        suma=0;
        for(int i=0; i<arreglo.length; i++){
            suma += arreglo[i];
        }
        System.out.println("La suma total es: "+ suma);
    }
    static public void sumaDescendente(){
        suma=0;
        for(int i=(arreglo.length-1); i>=0; i--){
            suma += arreglo[i];
        }
        System.out.println("La suma total es: "+ suma);
    }
    
}
