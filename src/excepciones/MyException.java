/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Brenda
 */
public class MyException extends Exception{
   // Constructor
    public MyException(){};
    
    // Excepcion: Error Provocado
    public String ErrorPersonalizado(){
        return "Error provocado.";
    }
}
