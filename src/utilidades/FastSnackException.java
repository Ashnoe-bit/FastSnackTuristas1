/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

/**
 *
 * @author noemi
 */
public class FastSnackException extends Exception {
    public FastSnackException(String message){
        super(message);
    }
 
    public FastSnackException(String message, Throwable cause) {
        super(message, cause);
    }
    
}